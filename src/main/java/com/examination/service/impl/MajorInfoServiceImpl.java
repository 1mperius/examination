package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.MajorInfoMapper;
import com.examination.model.Result;
import com.examination.model.po.MajorInfo;
import com.examination.service.MajorInfoService;
import org.springframework.stereotype.Service;

@Service
public class MajorInfoServiceImpl extends ServiceImpl<MajorInfoMapper,MajorInfo> implements MajorInfoService {
    @Override
    public Result addMajorInfo(MajorInfo majorInfo) {
        if(retBool(baseMapper.insert(majorInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");

    }

    @Override
    public Result updateMajorInfo(MajorInfo majorInfo) {
        if(retBool(baseMapper.updateById(majorInfo))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result deleteMajorInfo(Integer id) {
        if(retBool(baseMapper.deleteById(id))){
            return  Result.success();
        }
        return  Result.error("数据库出错");
    }

    @Override
    public Result listMajorInfo(MajorInfo majorInfo) {
        Page page = new Page();
        page.setSize(majorInfo.getRows());
        page.setCurrent(majorInfo.getCurrPage());
        IPage<MajorInfo> result= baseMapper.selectPage(page,new QueryWrapper<>(majorInfo));
        Integer total = baseMapper.selectCount(new QueryWrapper<>(majorInfo));
        result.setTotal(Long.valueOf(total));
        return Result.success(result);
    }
}
