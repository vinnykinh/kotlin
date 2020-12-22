package com.myjava;

public class java {
    public static  void main(String[] args){
        Student student =new Student();
        student.addTwoNumbers(2, 7, new addInterface() {
            @Override
            public void execute(int sum) {
                System.out.println(sum);
            }
        });
    }
    static class Student {
        public void addTwoNumbers(int a,int b,addInterface addInterface){
            int sum =a+b;
            addInterface.execute(sum);
        }

    }
    interface addInterface{
        public  void execute (int sum);
    }
}
