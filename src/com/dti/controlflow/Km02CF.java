
package com.dti.controlflow;

//Control Flow กลุ่มLoop การทำงานเดิมซ้ำ
//while , do-while  ,   for

public class Km02CF {
    public static void main(String[] args) {
        int a = 1;
        
        
        
        while(a<=5){
            System.out.println("Hello...");
            a=a+1; //a++ , ++a , a+=1
        }
        
        //-------------------------------------
        
        
        
        int b=1;
        do{
            System.out.println("Hi...");
            b=b+1;//++b , b++ ,b+=1
        }while(b<=5);
        
        //-----------------------------------
        
        
        
        
        for(int c=1; c<=5;c=c+1){
            System.out.println("Hey...");
        
            
        }
    }
    
}
