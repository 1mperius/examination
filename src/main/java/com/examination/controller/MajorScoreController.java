package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.CollegeScore;
import com.examination.model.po.MajorScore;
import com.examination.service.CollegeScoreService;
import com.examination.service.MajorScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("majorscore")
public class MajorScoreController {
    @Autowired
    MajorScoreService majorScoreService;
    @RequestMapping("/addmajorscore")
    public Result addMajorScore(MajorScore majorScore){
        return majorScoreService.addMajorScore(majorScore);
    }
    @RequestMapping("/updatemajorscore")
    public Result updateMajorScore(MajorScore majorScore){
        return majorScoreService.updateMajorScore(majorScore);
    }
    @RequestMapping("/deletemajorscore")
    public Result deleteMajorScore(Integer id){
        return majorScoreService.deleteMajorScore(id);
    }
    @RequestMapping("/listmajorscore")
    public Result listMajorScore(MajorScore majorScore, Integer rows,Integer currPage){
        return majorScoreService.listMajorScore(majorScore,rows,currPage);
    }
}
