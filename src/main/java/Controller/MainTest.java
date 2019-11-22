package Controller;

import Service.Context;
import Service.impl.ByBusImplIstrategy;

public class MainTest {

    public static void main(String[] args) {
        Context context = new Context(new ByBusImplIstrategy());
        context.operate();
    }
}
