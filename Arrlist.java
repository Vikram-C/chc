package com.chc.hds.arraylist;
import java.util.*;  
public class Arrlist{  
   public static void main(String args[]){  
      ArrayList<String> aliststr=new ArrayList<String>();  
      aliststr.add("AAA");
      aliststr.add("BBB");
      aliststr.add("CCC");
      aliststr.add("DDD");
      aliststr.add("EEE");
      aliststr.add("FFF");
      System.out.println("Initial String values entered:"+aliststr);
      aliststr.add(5,"HHH");
      System.out.println("Adding a String at index 5:"+aliststr);
      aliststr.remove(4);
      System.out.println("After removal"+aliststr);
      for(String alist1 : aliststr) {
    	  System.out.println(alist1);
      }  
      
      ArrayList<Integer> alistint = new ArrayList<Integer>();
      alistint.add(1);
      alistint.add(2);
      alistint.add(3);
      alistint.add(4);
      alistint.add(5);
      alistint.add(6);
      System.out.println("Integer values entered:"+alistint);
      
      ArrayList<Float> alistfloat = new ArrayList<Float>();
      alistfloat.add(1.11f);
      alistfloat.add(2.22f);
      alistfloat.add(3.33f);
      alistfloat.add(4.44f);
      alistfloat.add(5.55f);
      alistfloat.add(6.66f);
      System.out.println("Float values entered:"+alistfloat);
      
      ArrayList<Long> alistlong = new ArrayList<Long>();
      alistlong.add(1l);
      alistlong.add(12l);
      alistlong.add(123l);
      alistlong.add(1234l);
      alistlong.add(12345l);
      alistlong.add(123456l);
      System.out.println("LongInt values entered:"+alistlong);
   }  
}