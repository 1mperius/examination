package com.examination.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_major_score")
public class MajorScore extends BaseQueryVO {
    @TableId(type= IdType.AUTO)
    private Integer id;

    private Integer majMaxScore;

    private Integer majAveScore;

    private Integer majMinScore;

    private Integer majNumber;

    private Integer year;

    private String province;
    private Integer majId;

    @TableField(exist = false)
    private String colName;
    @TableField(exist = false)
    private String majName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getMajMaxScore() {
        return majMaxScore;
    }

    public void setMajMaxScore(Integer majMaxScore) {
        this.majMaxScore = majMaxScore;
    }

    public Integer getMajAveScore() {
        return majAveScore;
    }

    public void setMajAveScore(Integer majAveScore) {
        this.majAveScore = majAveScore;
    }

    public Integer getMajMinScore() {
        return majMinScore;
    }

    public void setMajMinScore(Integer majMinScore) {
        this.majMinScore = majMinScore;
    }

    public Integer getMajNumber() {
        return majNumber;
    }

    public void setMajNumber(Integer majNumber) {
        this.majNumber = majNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }



    public String getMajName() {
        return majName;
    }

    public void setMajName(String majName) {
        this.majName = majName;
    }

    public Integer getMajId() {
        return majId;
    }

    public void setMajId(Integer majId) {
        this.majId = majId;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }
}