package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  IllegalAccessException, InstantiationException {
        Context context=new Context();
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("entrer le nombre de le strategie a appliquer");
            String className=sc.nextLine();
            IStrategy iStrategy;
            try {
                iStrategy= (IStrategy) Class.forName("com.company."+className).newInstance();
            }catch (ClassNotFoundException exp){
                iStrategy=new StrategyImpl1();
            }
            context.setStrategy(iStrategy);
            context.applyStrategy();
            }

        }

}

