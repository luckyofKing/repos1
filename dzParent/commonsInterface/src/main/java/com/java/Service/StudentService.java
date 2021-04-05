package com.java.Service;

import java.util.List;

/**
 * @author 珏
 * @description 暂无
 * @time 2021/1/3120:04
 */
public interface StudentService {
    /**
     * 查询正在听课的学生名
     * @return
     */
    List<String> findStudentNames();
}
