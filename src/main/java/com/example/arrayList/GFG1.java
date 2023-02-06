package com.example.arrayList;

// Java program to illustrate creating
//  an array of objects


class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
           this.roll_no = roll_no;
           this.name = name;
    }

}



public class GFG1 {

    // Elements of the array are objects of a class Student.(배열의 요소는 Student 클래스의 객체이다.
    public static void main(String[] args) {

        // declares an Array of integers. (정수의 배열을 선언)
        Student[] arr;


        // allocating memory for 5 objects of type Student.(Student 타입의 5개의 객체에 대한 메모리 할당
        arr = new Student[5];

        // initialize the first elements of the array (배열의 첫 번째 요소를 초기화)
        arr[0] = new Student(1, "aman");

        // initialize the second elements of the array
        arr[1] = new Student(2, "vaibhav");


        // so on..."shikar", "dharmesh", "mohit"
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");


        // accessing the elements of the specified array (지정된 배열의 요소에 액세스)
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at" +" " + i + ": " + arr[i].roll_no + " " + arr[i].name);
            System.out.println(arr[i]);
        }
    }


}
