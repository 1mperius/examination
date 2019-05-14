package com.examination.service;

import com.examination.model.Result;
import com.examination.model.po.CollegeRecruitmen;

public interface CollegeRecruitmenService {
    Result addCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen) ;
    Result updateCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen);
    Result deleteCollegeRecruitmen(Integer id);
    Result listCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen,Integer rows,Integer currPage);
}
