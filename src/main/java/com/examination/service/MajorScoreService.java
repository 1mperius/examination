package com.examination.service;

import com.examination.model.Result;
import com.examination.model.po.MajorScore;

public interface MajorScoreService {
    Result addMajorScore(MajorScore majorScore) ;
    Result updateMajorScore(MajorScore majorScore);
    Result deleteMajorScore(Integer id);
    Result listMajorScore(MajorScore majorScore,Integer rows,Integer currPage);
}
