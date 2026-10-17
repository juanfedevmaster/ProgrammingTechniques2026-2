/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.examplefiles.interfaces;

import com.juanfedevmaster.examplefiles.entities.Student;
import java.util.List;

/**
 *
 * @author juanfe
 */
public interface IStudentRepository {
    public String getAllContentOfFile() throws Exception;
    public List<String> getAllRowsFromFile() throws Exception;
    public boolean saveAllStudentsJson(List<Student> students) throws Exception;
}
