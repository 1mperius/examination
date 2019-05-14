package com.examination.service;

import com.examination.model.Result;
import com.examination.model.po.Rank;

public interface RankService {
    Result addRank(Rank rank) ;
    Result updateRank(Rank rank);
    Result deleteRank(Integer id);
    Result listRank(Rank rank,Integer rows,Integer currPage);
}
