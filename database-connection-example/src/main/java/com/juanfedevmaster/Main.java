package com.juanfedevmaster;

import com.juanfedevmaster.model.Course;
import com.juanfedevmaster.model.Student;
import com.juanfedevmaster.repository.CourseRepository;
import com.juanfedevmaster.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {
        CourseRepository courseRepo = new CourseRepository();
        StudentRepository studentRepo = new StudentRepository();

        Course math = new Course("Varias Variables", 3);
        courseRepo.save(math);

        Student student = new Student("Juan", "Perez", 3001234567L);
        studentRepo.save(student);
        math.getStudents().add(student);
        courseRepo.update(math);

        var estudiantes = studentRepo.findAll();

        for (Student student_db : estudiantes) {
            System.out.println("Estudiante: "+student_db.getFullName());
            System.out.println("Cursos del Estudiante");
            for (Course course_db : student_db.getCourses()) {
                System.out.println("Course: "+course_db.getName()+" Creditos: "+course_db.getCredits());
            }
        }
    }
}