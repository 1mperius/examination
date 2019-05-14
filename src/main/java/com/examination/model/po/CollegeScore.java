package com.examination.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_college_score")
public class CollegeScore  extends BaseQueryVO{
    @TableId(type= IdType.AUTO)
    private Integer id;

    private String colGenera;

    private String colBatch;

    private Integer year;

    private Integer colMaxScore;

    private Integer colAveScore;

    private Integer colMinScore;

    private Integer colNumber;

    private String province;

    private String colId;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColGenera() {
        return colGenera;
    }

    public void setColGenera(String colGenera) {
        this.colGenera = colGenera == null ? null : colGenera.trim();
    }

    public String getColBatch() {
        return colBatch;
    }

    public void setColBatch(String colBatch) {
        this.colBatch = colBatch == null ? null : colBatch.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getColMaxScore() {
        return colMaxScore;
    }

    public void setColMaxScore(Integer colMaxScore) {
        this.colMaxScore = colMaxScore;
    }

    public Integer getColAveScore() {
        return colAveScore;
    }

    public void setColAveScore(Integer colAveScore) {
        this.colAveScore = colAveScore;
    }

    public Integer getColMinScore() {
        return colMinScore;
    }

    public void setColMinScore(Integer colMinScore) {
        this.colMinScore = colMinScore;
    }

    public Integer getColNumber() {
        return colNumber;
    }

    public void setColNumber(Integer colNumber) {
        this.colNumber = colNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getColId() {
        return colId;
    }

    public void setColId(String colId) {
        this.colId = colId;
    }


}