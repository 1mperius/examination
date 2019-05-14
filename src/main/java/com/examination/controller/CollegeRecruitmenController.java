package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.CollegeRecruitmen;
import com.examination.service.CollegeRecruitmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("collegerecruitmen")
public class CollegeRecruitmenController {
    @Autowired
    CollegeRecruitmenService collegeRecruitmenService;
    @RequestMapping("/addcollegerecruitmen")
    public Result addCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen){
        return collegeRecruitmenService.addCollegeRecruitmen(collegeRecruitmen);
    }
    @RequestMapping("/updatecollegerecruitmen")
    public Result updetaCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen){
        return collegeRecruitmenService.updateCollegeRecruitmen(collegeRecruitmen);
    }
    @RequestMapping("/deletecollegerecruitmen")
    public Result deleteCollegeRecruitmen(Integer id){
        return collegeRecruitmenService.deleteCollegeRecruitmen(id);
    }
    @RequestMapping("/listcollegerecruitmen")
    public Result listCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen,Integer rows,Integer currPage){
        return collegeRecruitmenService.listCollegeRecruitmen(collegeRecruitmen,rows,currPage);
    }
}
