package package1;


import package2.C;


public class A {


    public void msg() {

        System.out.println("A");

    }


    public static void main(String[] args) {

        new B().msg();

    }

}







 class B {


    String name;

    int age;


    void msg() {

        System.out.println("B");

    }

}
