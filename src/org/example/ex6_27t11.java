package org.example;

public class ex6_27t11 {
    public static void main(String[] args) {
        String str = "hello world" ;
        String[] w = str.split("\\s+");
        for(int index=w.length-1 ; index >= 0 ;index --){
            System.out.print(w[index]);
        }
    }
}

