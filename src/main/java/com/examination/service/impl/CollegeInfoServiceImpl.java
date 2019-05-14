package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.CollegeInfoMapper;
import com.examination.model.Result;
import com.examination.model.po.CollegeInfo;
import com.examination.service.CollegeInfoService;
import org.springframework.stereotype.Service;

@Service
public class CollegeInfoServiceImpl extends ServiceImpl<CollegeInfoMapper, CollegeInfo> implements CollegeInfoService {
    @Override
    public Result addCollegeInfo(CollegeInfo collegeInfo) {
        if(retBool(baseMapper.insert(collegeInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result updateCollegeInfo(CollegeInfo collegeInfo) {
        if(retBool(baseMapper.updateById(collegeInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result deleteCollegeInfo(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result listCollegeInfo(CollegeInfo collegeInfo,Integer rows,Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
        IPage<CollegeInfo> result= baseMapper.selectPage(page,new QueryWrapper<>(collegeInfo));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(collegeInfo));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
