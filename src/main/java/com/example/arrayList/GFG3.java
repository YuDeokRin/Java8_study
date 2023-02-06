package com.example.arrayList;

class Student2{
    String name;

    public Student2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GFG3 {
    public static void main(String[] args) {

        // declares an Array and initializing  the elements of the array
        Student2[] myStudent = new Student2[]{new Student2("Dharma"), new Student2("sanvi"), new Student2("Rupa"), new Student2("Ajay")};


        // accessing the elements of the specified array
        for (Student2 m : myStudent) {
            System.out.println(m);
        }
    }
}
