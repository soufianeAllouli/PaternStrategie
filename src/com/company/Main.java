package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Context context=new Context();
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("entrer le nombre de le strategie a appliquer");
            String className=sc.nextLine();
            IStrategy iStrategy= (IStrategy) Class.forName("com.company."+className).newInstance();
            context.setStrategy(iStrategy);
            context.applyStrategy();
            }

        }

}

