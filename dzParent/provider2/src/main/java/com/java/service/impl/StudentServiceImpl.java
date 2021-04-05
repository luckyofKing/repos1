package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.Service.StudentService;

import java.util.Arrays;
import java.util.List;

/**
 * @author 珏
 * @description 暂无
 * @time 2021/1/3119:40
 */
@Service(version = "stu")
public class StudentServiceImpl implements StudentService {
    /*提供者2学生具体类*/
    @Override
    public List<String> findStudentNames() {
        System.out.println("我是提供者2");
        return Arrays.asList("我是提供者2，我是提供者2");
    }
}
