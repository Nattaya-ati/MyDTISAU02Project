
package com.dti.controlflow;

//คำสั่ง Break; และ คำสั่ง Continue;ในLoop
//break ในLoop ทำงานเมื่อไหร่ คือ จบ Loop ทันที

public class Km03CF {
    
    
    public static void main(String[] args) {
      for  (int c = 1;c<=5;c=c+1){
        if(c==3){
            break;
            
            }
          System.out.println(c+"Hey...");
      }
        System.out.println("+++++++++++++++++++++");
        for (int c=1;c<=5;c=c+1){
            if(c==3){
                continue;
            }
            System.out.println(c+"___Hum...");
            }
      }
    }

