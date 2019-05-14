package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.StudentInfo;
import com.examination.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentInfoController {
    @Autowired
    StudentInfoService studentInfoService;
    @RequestMapping("/add")
    public Result addStudentInfo(StudentInfo studentInfo){
        return studentInfoService.addStudentInfo(studentInfo);
    }
    @RequestMapping("/update")
    public Result updateStudentInfo(StudentInfo studentInfo){
        return studentInfoService.updateStudentInfo(studentInfo);
    }
    @RequestMapping("/delete")
    public Result deleteStudentInfo(Integer id){
        return studentInfoService.deleteStudentInfo(id);
    }
    @RequestMapping("/listStudentInfo")
    public Result listStudentInfo(StudentInfo studentInfo){
        return studentInfoService.listStudentInfo(studentInfo,studentInfo.getRows(),studentInfo.getCurrPage());
    }
}
