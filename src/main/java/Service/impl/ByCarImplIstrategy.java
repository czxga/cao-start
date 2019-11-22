package Service.impl;

import Service.IStrategy;

/**
 * @author Cao
 * @Date 2019/11/12
 * 策略接口的一个实现
 */


public class ByCarImplIstrategy implements IStrategy {
    public void operate() {
        System.out.println("通过自驾到达目的地");
    }
}
