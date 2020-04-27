package com.sjzc.javaTest.medicine;

import lombok.Data;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-11-18 10:24
 **/
@Data
public class Medicine {

    private MedicineEnum lifuping;
    private int yansuoyiandingchun;
    private int yiyanjing;
    private int piqin;
    private int shuanghuanchun;
    private int puquanneizhi;

    private String show(){
        return "";
    }
}
