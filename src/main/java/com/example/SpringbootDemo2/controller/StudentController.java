package com.example.SpringbootDemo2.controller;

import com.example.SpringbootDemo2.Model2.Student;
import com.example.SpringbootDemo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @GetMapping("/studentList")

    public List<Student>getStudent(){
         return this.studentService.getStudents();
    }

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{stuId}")
    public String deleteStudent(@PathVariable("stuId") int stuId){
     return this.studentService.deleteStudentById(stuId);
    }

    @PutMapping("/findAllById")
    public List<Student> findAllById(@RequestParam int stuId)
    {
        return this.studentService.findAllById(stuId);
    }

}
