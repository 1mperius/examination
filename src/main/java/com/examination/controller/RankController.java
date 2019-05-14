package com.examination.controller;

import com.examination.model.Result;
import com.examination.model.po.Rank;
import com.examination.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("rank")
public class RankController {
    @Autowired
    RankService rankService;
    @RequestMapping("/addrank")
    public Result addRank(Rank rank){
        return rankService.addRank(rank);

    }
    @RequestMapping("/updaterank")
    public Result updateRank(Rank rank){
        return rankService.updateRank(rank);

    }
    @RequestMapping("/deleterank")
    public Result deleteRank(Integer id){
        return rankService.deleteRank(id);

    }
    @RequestMapping("/listrank")
    public Result listRank(Rank rank,Integer rows,Integer currPage){
        return rankService.listRank(rank,rows,currPage);

    }
}
