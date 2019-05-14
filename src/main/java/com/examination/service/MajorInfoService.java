package com.examination.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.examination.model.Result;
import com.examination.model.po.MajorInfo;

public interface MajorInfoService extends IService<MajorInfo> {
    Result addMajorInfo(MajorInfo majorInfo);
    Result updateMajorInfo(MajorInfo majorInfo);
    Result deleteMajorInfo(Integer id);
    Result listMajorInfo(MajorInfo majorInfo);
}
