package com.company.week1;
import java.util.*;

/**
 * Created by 016308 on 3/5/2019.
 */
public class Collection {
    private ArrayList<Person> list = new ArrayList<>();

    public Collection() {
    }

    public ArrayList<Person> getList() {
        return list;
    }

    public void addContact(Person person) {
        list.add(person);
    }
}
