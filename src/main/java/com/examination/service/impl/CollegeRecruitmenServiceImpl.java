package com.examination.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.CollegeRecruitmenMapper;
import com.examination.model.Result;
import com.examination.model.po.CollegeRecruitmen;
import com.examination.service.CollegeRecruitmenService;
import org.springframework.stereotype.Service;

@Service
public class CollegeRecruitmenServiceImpl extends ServiceImpl<CollegeRecruitmenMapper, CollegeRecruitmen> implements CollegeRecruitmenService {
    @Override
    public Result addCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen) {
        if(retBool(baseMapper.insert(collegeRecruitmen))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result updateCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen) {
        if(retBool(baseMapper.updateById(collegeRecruitmen))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result deleteCollegeRecruitmen(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }
    @Override
    public Result listCollegeRecruitmen(CollegeRecruitmen collegeRecruitmen,Integer rows,Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
        IPage<CollegeRecruitmen> result= baseMapper.selectPage(page,new QueryWrapper<>(collegeRecruitmen));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(collegeRecruitmen));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
