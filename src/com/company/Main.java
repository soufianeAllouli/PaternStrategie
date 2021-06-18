package com.company;

public class Main {

    public static void main(String[] args) {
        Context context=new Context();
        context.applyStrategy();
        context.setStrategy(new StrategyImp2());
        context.applyStrategy();
        context.setStrategy(new StrategyImp3());
        context.applyStrategy();
    }
}
