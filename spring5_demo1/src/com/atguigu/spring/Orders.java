package com.atguigu.spring;

/**
 * @author WangZY
 * @date 2021年09月15日20:17
 */
public class Orders {

    private String oName;
    private String address;

    public Orders(String oName,String address) {
        this.oName = oName;
        this.address = address;
    }
    public void testDemo() {
        System.out.println(oName + "::" + address);
    }
}
