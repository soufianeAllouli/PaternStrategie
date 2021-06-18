package com.company;

public class Context {
    private IStrategy strategy;
    public void applyStrategy(){
        if(strategy==null)
            //apply the default strategy if none is specified
            strategy=new StrategyImpl1();
        strategy.applyStrategy();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
