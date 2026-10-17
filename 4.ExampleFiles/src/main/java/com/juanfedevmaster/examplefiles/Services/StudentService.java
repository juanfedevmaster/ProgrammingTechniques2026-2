/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.examplefiles.Services;

import com.juanfedevmaster.examplefiles.entities.Student;
import com.juanfedevmaster.examplefiles.interfaces.IStudentService;
import com.juanfedevmaster.examplefiles.repositories.StudentRepository;
import java.util.List;

/**
 *
 * @author juanfe
 */
public class StudentService implements IStudentService{
    private StudentRepository repository;
    
    public  StudentService(){
        repository = new StudentRepository();
    }
    
    @Override
    public String getAllContentOfFile() throws Exception {
       String fileContent = repository.getAllContentOfFile();
       
       if(fileContent.isEmpty() || fileContent.isBlank()){
           throw new Exception ("The file is empty");
       }
       
       return fileContent;
    }
    
    @Override
    public List<String> getAllRowsFromFile() throws Exception {
       List<String> rowsFromFile = repository.getAllRowsFromFile();
       
       if(rowsFromFile.isEmpty() || rowsFromFile.size() == 0){
           throw new Exception ("The file is empty");
       }
       
       return rowsFromFile;
    } 

    @Override
    public boolean saveAllStudentsJson(List<Student> students) throws Exception {
        return repository.saveAllStudentsJson(students);
    }
}
