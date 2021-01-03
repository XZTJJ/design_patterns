package com.zhouhc.eachPattern.flyweight.desc.code;

/**
 * 抽象的享元角色
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    private final String Extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态的getter / setter
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
