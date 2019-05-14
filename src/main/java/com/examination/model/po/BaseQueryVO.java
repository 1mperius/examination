package com.examination.model.po;

import com.baomidou.mybatisplus.annotation.TableField;

public class BaseQueryVO {
    @TableField(exist = false)
    private Integer rows;
    @TableField(exist = false)
    private Integer currPage;

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }
}
