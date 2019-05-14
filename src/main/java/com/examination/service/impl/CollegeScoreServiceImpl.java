package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.CollegeScoreMapper;
import com.examination.model.Result;
import com.examination.model.po.CollegeScore;
import com.examination.service.CollegeScoreService;
import com.examination.service.MajorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeScoreServiceImpl extends ServiceImpl<CollegeScoreMapper, CollegeScore> implements CollegeScoreService {
    @Override
    public Result addCollegeScore(CollegeScore collegeScore) {
        if(retBool(baseMapper.insert(collegeScore))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result updateCollegeScore(CollegeScore collegeScore) {
        if(retBool(baseMapper.updateById(collegeScore))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result deleteCollegeScore(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result listCollegeScore(CollegeScore collegeScore,Integer rows,Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
        IPage<CollegeScore> result= baseMapper.selectPage(page,new QueryWrapper<>(collegeScore));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(collegeScore));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
