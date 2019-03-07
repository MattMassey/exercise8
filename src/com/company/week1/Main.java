package com.company.week1;

//Matt Massey, 3/5/19
//Program demonstrates extending classes

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Matt", "dummy-email@somewhere.com");
        System.out.println(me.toString());
        Person alsoMe = new BusinessContact("Matthew", "professional@here.rr.com", "614-000-1234");
        System.out.println(alsoMe.toString());
        Collection myCollection = new Collection();
        myCollection.addContact(me);
        myCollection.addContact(alsoMe);
        System.out.println(myCollection.getList());
    }
}
