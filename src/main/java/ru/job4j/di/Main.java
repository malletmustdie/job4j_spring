package ru.job4j.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.print();
    }

}
