package com.examination.service;

import com.examination.model.Result;

import com.examination.model.po.CollegeScore;

public interface CollegeScoreService {
    Result addCollegeScore(CollegeScore collegeScore) ;
    Result updateCollegeScore(CollegeScore collegeScore);
    Result deleteCollegeScore(Integer id);
    Result listCollegeScore(CollegeScore collegeScore,Integer rows,Integer currPage);
}
