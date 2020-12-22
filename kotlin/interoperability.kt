@file:JvmName("MyCustomFileName")

package com.kotlin

import com.myjava.myJavaFile

fun main() {
    //you can call java and kotlin files
    //how java code runs
    //mydemo.java -> mydemo.class(contains the byte code) ->java virtual machine ->running code
    //how kotlin code runs
//mydemo.kt->Mydemokt.class(byte code) ->java virtual machine ->program running
    val area = myJavaFile.getArea(20, 10)
    println("from kotlin file$area")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
/* public class MyCustomFileName
{
     public static void com.kotlin.com.extensionFx.main(String [] args){
       public static int com.kotlin.add(int a,int b)
       {
       return a+b
       }
     }

}
 */