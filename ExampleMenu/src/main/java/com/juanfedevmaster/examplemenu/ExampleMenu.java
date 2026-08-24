/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.examplemenu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanfe
 */
public class ExampleMenu {

    public static Student selectStudent(ArrayList<Student> students, Scanner scan){
        int optionUser;
        Student selectedStudent;
        do{
            System.out.println("+++++++++++++");
            System.out.println("Select a student:");
            System.out.println("+++++++++++++");
            for (int i=0; i < students.size() ; i++){
                Student student = students.get(i);
                System.out.println((i+1) + ". " + student.getLastName() + " " + student.getName());
            }
            System.out.print ("Enter the student number: ");
            optionUser = scan.nextInt();
        }while (optionUser < 1 || optionUser > students.size());
        selectedStudent = students.get(optionUser-1);
        return selectedStudent;
    }

    public static Subject selectSubject(ArrayList<Subject> subjects, Scanner scan){
        int optionUser;
        Subject selectedSubject;
        do{
            System.out.println("+++++++++++++");
            System.out.println("Select a subject:");
            System.out.println("+++++++++++++");
            for (int i=0; i<subjects.size(); i++){
                Subject subject = subjects.get(i);
                System.out.println((i+1) + ". " + subject.getName() + " " + subject.getCode());
            }
            System.out.print ("Enter the subject number: ");
            optionUser = scan.nextInt();
        }while(optionUser < 1 || optionUser > subjects.size());
        selectedSubject = subjects.get(optionUser-1);
        return selectedSubject;
    }

    public static void main(String[] args) {
        // 1. El estudiante debe tener Nombre, Apellido, Carrera
        // 2. Asignatura debe tener Nombre y Código

        // Regla de Negocio: 
        // 1. Un estudiante Puede tener muchas Asignaturas.
        // 2. Un Asignatura Puede tener muchos Estudiantes.
        // 3. Un estudiante puede tener máximo 3 asignaturas.
        // 4. Un estudiante no puede tener la misma asignatura repetida.

        // Instancia nuevo objeto
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        int option = 0;

        subjects.add(new Subject("Tec. de Programacion", "Sb1"));
        subjects.add(new Subject("Logica 2", "Sb2"));
        subjects.add(new Subject("Bases de Datos", "Sb3"));

        do {
            System.out.println("+++++++++++++++++++++++");
            System.out.println("University of Antioquia");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("1. Create Student");
            System.out.println("2. Print all Students");
            System.out.println("3. Print available subjects");
            System.out.println("4. Assign a subject to a student");
            System.out.println("5. Search a student");
            System.out.println("6. Exit");

            Scanner scan = new Scanner(System.in);

            int optionUser = scan.nextInt();
            scan.nextLine();

            switch (optionUser) {
                case 1:
                    option = 1;
                    Student student = new Student();

                    System.out.println("Set the name of the new Student:");
                    student.setName(scan.nextLine());

                    System.out.println("Set the last name of the new Student:");
                    student.setLastName(scan.nextLine());

                    System.out.println("Set the career of the new Student:");
                    student.setCareer(scan.nextLine());

                    student.setSubjects(new ArrayList<>());

                    students.add(student);

                    break;
                case 2:
                    option = 1;
                    System.out.println("The total students are: " + students.size());

                    for (Student s : students) {
                        System.out.println("+++++++++++++");
                        System.out.println("The full name of the student is: " + s.getName() + " " + s.getLastName());
                        System.out.println("Career: "+ s.getCareer());
                    }   
                    break;

                case 3:
                    option = 1;
                    System.out.println("+++++++++++++");
                    System.out.println("Subjects List:");
                    System.out.println("+++++++++++++");

                    for (Subject subject : subjects){
                        System.out.println(subject.getName() + "   " + subject.getCode());
                    }
                    break;

                case 4:
                    option = 1;
                    if (students.isEmpty()){
                        System.out.println("Error: No students found.");
                    }else {
                        if (subjects.isEmpty()){
                            System.out.println("Error: No subjects found.");
                        }else {
                            Student studentToAssign = selectStudent(students, scan);
                            Subject subjectToAdd = selectSubject(subjects, scan);
                            if (studentToAssign.addSubject(subjectToAdd)) {
                                System.out.println("Added successful");
                            } else {
                                System.out.println("error to added subject");
                            }
                        }
                    }
                    break;

                case 5:
                    option = 1;
                    if (students.isEmpty()){
                        System.out.println("Error: No students found.");
                    }else {
                        Student searchedStudent = selectStudent(students, scan);
                        ArrayList<Subject> studentSubjects = searchedStudent.getSubjects();
                        System.out.println("Full name: " + searchedStudent.getName() + " " + searchedStudent.getLastName());
                        System.out.println("career: " + searchedStudent.getCareer());
                        System.out.println("___________________");
                        System.out.println("assigned subjects:");
                        System.out.println("-------------------");

                        for (Subject studentSubject : studentSubjects) {
                            System.out.println("Subject name: " + studentSubject.getName() + "    Code : " + studentSubject.getCode());
                        }
                    }
                    break;


                default:
                    option = -1;
                    break;
            }

        } while (option > 0);
    }
}
