package com.examination.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.StudentInfoMapper;
import com.examination.model.Result;
import com.examination.model.po.StudentInfo;
import com.examination.service.StudentInfoService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements StudentInfoService {
    @Override
    public Result addStudentInfo(StudentInfo studentInfo) {
        if(retBool(baseMapper.insert(studentInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result updateStudentInfo(StudentInfo studentInfo) {
        if(retBool(baseMapper.updateById(studentInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result deleteStudentInfo(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result listStudentInfo( StudentInfo studentInfo, Integer rows, Integer currPage) {
        Page page = new Page();
        page.setSize(rows);
        page.setCurrent(currPage);
       IPage<StudentInfo>  result= baseMapper.selectPage(page,new QueryWrapper<>(studentInfo));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(studentInfo));
        result.setTotal(Long.valueOf(total));
       return Result.success(result);
    }
}
