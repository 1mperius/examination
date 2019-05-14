package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.MajorInfo;
import com.examination.service.MajorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("majorinfo")
public class MajorInfoController {
    @Autowired
    MajorInfoService majorInfoService;
    @RequestMapping("/addmajorinfo")
    public Result addMajorInfo(MajorInfo majorInfo){
        return majorInfoService.addMajorInfo(majorInfo);
    }
    @RequestMapping("/updatemajorinfo")
    public Result updateMajorInfo(MajorInfo majorInfo){
        return majorInfoService.updateMajorInfo(majorInfo);
    }
    @RequestMapping("/deletemajorinfo")
    public Result deleteMajorInfo(Integer id){
        return majorInfoService.deleteMajorInfo(id);
    }
    @RequestMapping("/listmajorinfo")
    public Result listMajorScore(MajorInfo majorInfo){
        return majorInfoService.listMajorInfo(majorInfo);
    }
}
