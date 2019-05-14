package com.examination.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("t_major_info")
public class MajorInfo  extends BaseQueryVO{
    @TableId(type= IdType.AUTO)
    private Integer id;

    private String majName;

    private String colId;

    private Date majDate;

    private Integer majYears;
    private String colName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajName() {
        return majName;
    }

    public void setMajName(String majName) {
        this.majName = majName == null ? null : majName.trim();
    }

    public String getColId() {
        return colId;
    }

    public void setColId(String colId) {
        this.colId = colId;
    }

    public Date getMajDate() {
        return majDate;
    }

    public void setMajDate(Date majDate) {
        this.majDate = majDate;
    }

    public Integer getMajYears() {
        return majYears;
    }

    public void setMajYears(Integer majYears) {
        this.majYears = majYears;
    }
    public String getColName() {
        return colName;
    }

    public void setColName(String majName) {
        this.colName = majName == null ? null : majName.trim();
    }
}