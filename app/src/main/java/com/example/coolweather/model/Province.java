package com.example.coolweather.model;

/**
 * Created by Administrator on 2016/12/11 0011.
 */
public class Province{
    private String provinceName;
    private String provinceCode;
    private int id;

    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void  setProvinceCode(String provinceCode){
        this.provinceCode=provinceCode;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceID(int id){
        this.id=id;
    }
    public  int getProvinceID(){
        return id;
    }

}
