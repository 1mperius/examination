package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.CollegeScore;
import com.examination.service.CollegeScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("collegescore")
public class CollegeScoreController {
    @Autowired
    CollegeScoreService collegeScoreService;
    @RequestMapping("/addcollegescore")
    public Result addCollegeScore(CollegeScore collegeScore){
        return collegeScoreService.addCollegeScore(collegeScore);
    }
    @RequestMapping("/updatecollegescore")
    public Result updateCollegeScore(CollegeScore collegeScore){
        return collegeScoreService.updateCollegeScore(collegeScore);
    }
    @RequestMapping("/deletecollegescore")
    public Result deleteCollegeScore(Integer id){
        return collegeScoreService.deleteCollegeScore(id);
    }
    @RequestMapping("/listcollegescore")
    public Result listCollegeScore(CollegeScore collegeScore, Integer rows,Integer currPage){
        return collegeScoreService.listCollegeScore(collegeScore,rows,currPage);
    }
}
