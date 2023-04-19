package com.example.SpringbootDemo2.repository;

import com.example.SpringbootDemo2.Model2.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

@Query(value="select * from Student where stuId= :id",nativeQuery = true)
    public List<Student>findAllById(int id);

}
