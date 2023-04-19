package com.example.SpringbootDemo2.service;

import com.example.SpringbootDemo2.Model2.Student;
import com.example.SpringbootDemo2.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addStudent(Student student){
        if(studentRepo.existsById(student.getStuId()))
        {
            return "Student already exist";
        }else {
            studentRepo.save(student);
            return "Student added successfully";
        }
    }

    public List<Student> getStudents(){
        return this.studentRepo.findAll();
    }

    public String updateStudent(Student student){
        if(studentRepo.existsById(student.getStuId())){
            Student s = this.studentRepo.getReferenceById(student.getStuId());
            s.setStuId(student.getStuId());
            s.setStuAge(student.getStuAge());
            s.setStuCourse(student.getStuCourse());
            s.setStuFirstName(student.getStuFirstName());
            s.setStuLastName(student.getStuLastName());
            this.studentRepo.save(s);
            return "Student details successfully updated";
        }
        return "Student does not exist";
    }
   public String deleteStudentById(int stuId){
        studentRepo.deleteById(stuId);
        return "Student deleted ";
   }

   public List<Student> findAllById(int stuId)
   {
       return this.studentRepo.findAllById(stuId);
   }

}
