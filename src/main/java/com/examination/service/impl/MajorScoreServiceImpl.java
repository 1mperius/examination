package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.MajorScoreMapper;
import com.examination.model.Result;
import com.examination.model.po.MajorInfo;
import com.examination.model.po.MajorScore;
import com.examination.service.MajorInfoService;
import com.examination.service.MajorScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorScoreServiceImpl extends ServiceImpl<MajorScoreMapper,MajorScore> implements MajorScoreService {
    @Autowired
    MajorInfoService majorInfoService;
    @Override
    public Result addMajorScore(MajorScore majorScore) {
        if(retBool(baseMapper.insert(majorScore))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result updateMajorScore(MajorScore majorScore) {
        if(retBool(baseMapper.updateById(majorScore))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result deleteMajorScore(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result listMajorScore(MajorScore majorScore,Integer rows,Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
        IPage<MajorScore> result= baseMapper.selectPage(page,new QueryWrapper<>(majorScore));
        //联表查询获取MajorInfo字段信息
        for(int i=0;i<result.getRecords().size();i++){
            MajorInfo majorInfo = new MajorInfo();
            Integer majId = result.getRecords().get(i).getMajId();
            majorInfo.setId(majId);
            majorInfo=majorInfoService.getOne(new QueryWrapper<>(majorInfo));
            result.getRecords().get(i).setMajName(majorInfo.getMajName());
            result.getRecords().get(i).setColName(majorInfo.getColName());
        }
        Integer total = baseMapper.selectCount(new QueryWrapper<>(majorScore));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
