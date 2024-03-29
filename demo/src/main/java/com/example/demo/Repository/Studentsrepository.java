package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentsModel;

@Repository
public interface Studentsrepository extends MongoRepository<StudentsModel,String>{
   
    public List<StudentsModel> findByLastName(String lastName);
    
    void deleteByFirstName(String firstName);

}
