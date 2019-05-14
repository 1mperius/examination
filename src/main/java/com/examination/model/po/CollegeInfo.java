package com.examination.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_college_info")
public class CollegeInfo extends BaseQueryVO {
    @TableId(type= IdType.AUTO)
    private Integer id;

    private String colName;

    private String colType;

    private String colTel;

    private String colUrl;

    private String colAddress;

    private String colLogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public String getColType() {
        return colType;
    }

    public void setColType(String colType) {
        this.colType = colType == null ? null : colType.trim();
    }

    public String getColTel() {
        return colTel;
    }

    public void setColTel(String colTel) {
        this.colTel = colTel == null ? null : colTel.trim();
    }

    public String getColUrl() {
        return colUrl;
    }

    public void setColUrl(String colUrl) {
        this.colUrl = colUrl == null ? null : colUrl.trim();
    }

    public String getColAddress() {
        return colAddress;
    }

    public void setColAddress(String colAddress) {
        this.colAddress = colAddress == null ? null : colAddress.trim();
    }

    public String getColLogo() {
        return colLogo;
    }

    public void setColLogo(String colLogo) {
        this.colLogo = colLogo == null ? null : colLogo.trim();
    }
}