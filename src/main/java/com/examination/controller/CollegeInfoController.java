package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.CollegeInfo;
import com.examination.service.CollegeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("collegeinfo")
public class CollegeInfoController {
    @Autowired
    CollegeInfoService collegeInfoService;
    @RequestMapping("/addcollegeinfo")
    public Result addCollegeInfo(CollegeInfo collegeInfo){
        return collegeInfoService.addCollegeInfo(collegeInfo);
    }
    @RequestMapping("/updatecollegeinfo")
    public Result updateCollegeInfo(CollegeInfo collegeInfo){
        return collegeInfoService.updateCollegeInfo(collegeInfo);
    }
    @RequestMapping("/deletecollegeinfo")
    public Result deleteCollegeInfo(Integer id){
        return collegeInfoService.deleteCollegeInfo(id);
    }
    @RequestMapping("/listcollegeinfo")
    public Result listCollegeInfo(CollegeInfo collegeInfo, Integer rows,Integer currPage){
        return collegeInfoService.listCollegeInfo(collegeInfo,rows,currPage);
    }

}
