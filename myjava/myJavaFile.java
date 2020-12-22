package com.myjava;

import com.kotlin.MyCustomFileName;

public class myJavaFile {


    public  static void main(String [ ] args)
    {
        int sum = MyCustomFileName.add(3,4);
        System.out.println("printing sum from java file"+ sum);

    }
    public static int getArea(int l ,int b){
        return  l*b;
    }
}
