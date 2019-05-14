package com.examination.service;

import com.examination.model.Result;
import com.examination.model.po.StudentInfo;

public interface StudentInfoService {
    Result addStudentInfo(StudentInfo studentInfo) ;
    Result updateStudentInfo(StudentInfo studentInfo);
    Result deleteStudentInfo(Integer id);
    Result listStudentInfo(StudentInfo studentInfo,Integer rows,Integer currPage);
}
