package com.java.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.java.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 珏
 * @description 暂无
 * @time 2021/2/211:42
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Reference(version = "stu")
    private StudentService studentService;

    @RequestMapping("/getStudents")
    public @ResponseBody List<String> getStudents(){
       return studentService.findStudentNames();
    }
}
