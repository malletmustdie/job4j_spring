package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {

    @Autowired
    private Store store;

    private ConsoleInput input;

    @Autowired
    public void setInput(ConsoleInput input) {
        this.input = input;
    }

    public void add() {
        String value = null;
        while (!"end".equals(value)) {
            value = input.askStr("Select..");
            store.add(value);
        }
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

}
