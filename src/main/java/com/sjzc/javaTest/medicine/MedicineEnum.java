package com.sjzc.javaTest.medicine;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-11-18 10:27
 **/
public enum MedicineEnum {
    LIFUPING("利福平胶囊"),
    YIYANJING("异烟肼片"),
    YANSUANYIANDINGCHUN("盐酸乙胺丁醇片"),
    PIQIN("皮嗪酰胺片"),
    SHUANGHUANCHUN("双环醇片"),
    PUQUANNEIZHI("葡醛内酯片");

    private final String discription;
    private int count;

    MedicineEnum(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return discription;
    }
}
