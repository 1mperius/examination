package com.examination.service;

import com.examination.model.Result;
import com.examination.model.po.CollegeInfo;

public interface CollegeInfoService {
    Result addCollegeInfo(CollegeInfo collegeInfo) ;
    Result updateCollegeInfo(CollegeInfo collegeInfo);
    Result deleteCollegeInfo(Integer id);
    Result listCollegeInfo(CollegeInfo collegeInfo,Integer rows,Integer currPage);
}
