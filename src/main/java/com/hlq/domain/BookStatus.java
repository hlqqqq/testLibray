package com.hlq.domain;

/**
 * Created by heliqing on 2016/10/18.
 * Í¼Êé×´Ì¬
 */
public enum BookStatus {
    GIVE_OUT("1","½è³ö");
    private String code;
    private String desc;
    private BookStatus(String code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public BookStatus getByCode(String code){
        BookStatus[] arry$=values();
        int length=arry$.length;
        for(int i=0;i<length;i++){
            if(arry$[i].getCode().equals(code)){
                return arry$[i];
            }
        }
        return null;
    }
}
