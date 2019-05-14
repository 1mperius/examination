package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.RankMapper;
import com.examination.model.Result;
import com.examination.model.po.Rank;

import com.examination.service.RankService;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl extends ServiceImpl<RankMapper,Rank> implements RankService {
    @Override
    public Result addRank(Rank rank) {
        if(retBool(baseMapper.insert(rank))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result updateRank(Rank rank) {
        if(retBool(baseMapper.updateById(rank))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result deleteRank(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result listRank(Rank rank,Integer rows,Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
        IPage<Rank> result= baseMapper.selectPage(page,new QueryWrapper<>(rank));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(rank));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
