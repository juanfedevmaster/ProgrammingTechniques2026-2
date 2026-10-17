/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.examplefiles.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.juanfedevmaster.examplefiles.entities.Student;
import com.juanfedevmaster.examplefiles.interfaces.IStudentRepository;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author juanfe
 */
public class StudentRepository implements IStudentRepository {

    private final Path path;

    public StudentRepository() {
        path = Path.of("repositorio.txt");
    }

    @Override
    public String getAllContentOfFile() throws Exception {
        try {

            String allText = Files.readString(path); // 1.Opcion, lee todo lo que se encuentra en el archivo.
            return allText;

        } catch (IOException exe) {
            throw new Exception("Error de archivo: " + exe.getMessage());
        }
    }

    @Override
    public List<String> getAllRowsFromFile() throws Exception {
        List<String> rows = Files.readAllLines(path);
        return rows;
    }

    @Override
    public boolean saveAllStudentsJson(List<Student> students) throws Exception {
        try {
            ObjectMapper mapper = new ObjectMapper()
                    .enable(SerializationFeature.INDENT_OUTPUT);
            
            mapper.writeValue(new File("repo.json"), students);
            
            return true;
        } catch (Exception exe) {
            throw new Exception("Error de archivo: " + exe.getMessage());
        }

    }

}
