package com.examination.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.dao.common.AdminMapper;
import com.examination.dao.common.CollegeInfoMapper;
import com.examination.model.Result;
import com.examination.model.po.Admin;
import com.examination.model.po.CollegeInfo;
import com.examination.service.LoginService;
import org.springframework.stereotype.Service;

@Service(value = "loginService")
public class LoginServiceImpl extends ServiceImpl<AdminMapper, Admin> implements LoginService  {

    @Override
    public Result login(Admin admin) {
        Admin admin1 = new Admin();
        admin1.setAdAccount(admin.getAdAccount());
         Admin admin2  = baseMapper.selectOne(new QueryWrapper<>(admin1));
        if(admin2==null){
            return Result.error("不存在该用户");
        }else {
            if(admin.getAdPassword().equals(admin2.getAdPassword())){
                return  Result.success(admin2);
            }
            return Result.error("账号密码出错");
        }
    }
}
