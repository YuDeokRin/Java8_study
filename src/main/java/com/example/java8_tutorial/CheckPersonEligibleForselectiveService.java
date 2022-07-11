package com.example.java8_tutorial;


class CheckPersonEligibleForselectiveService implements RosterTest.CheckPerson {
    public boolean test(Person p) {
        return p.gender == p.Sex.MALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 25;
    }
}
