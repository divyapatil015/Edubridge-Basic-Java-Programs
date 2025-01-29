package com.edu.Multitreading;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class A extends Thread{
  @Override
 public void run()
 {
     //Keep the task to be performed here
      for (int i = 1; i <= 10; i++) 
     {
         System.out.println(i);
     }
 }
}   
class B extends Thread
{
 @Override
 public void run() 
 {
     for (int i = 11; i <= 20; i++) 
     {
         System.out.println(i);
     }
 }
}

class MulT {
 
 public static void main(String[] args) {
     System.out.println("Try programiz.pro");
     A ao = new A();
     B bo = new B();
     ao.start();
     bo.start();
 }
}