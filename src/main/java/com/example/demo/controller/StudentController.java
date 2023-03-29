package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private Studentservice studentService;
//integration of html to show form and submit request to savestudent api
//    @GetMapping("/add")
//    public String showForm() {
//        return "index";

//    @PostMapping("/submit")
//    public String submitForm(@RequestParam String name, @RequestParam String address, Model model) {
//        Student stundent = new student(name, address);
//        studentService.saveStudent(student);
//        model.addAttribute("StudentInfo", students);
//        return "New student added";
//    }
//    }
    @PostMapping("/add")
    public String add(@RequestBody Student student){
     studentService.saveStudent(student);
     return "New student is added";
    }

//    @GetMapping("/")
//    public String getUsers(Model model) {
//        model.addAttribute("studentList", studentService.getAllStudents());
//        return "ShowStudents.html";
//    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    }
