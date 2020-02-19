package com.cg.iter.concurr;
import java.util.concurrent.Callable;  

public class MyCallable implements Callable<String>
{
        private int sno;

        public MyCallable(int sno){
            this.sno = sno;
        }
       @Override 
        public String call() throws Exception { 
           for(int i=0;i<10;i++)  {
              System.out.print(i+"[call"+sno+"] ");
              try {Thread.sleep(2);} catch(InterruptedException e) {}
           }
           String s=sno + ") MyCallable run at "+System.currentTimeMillis(); 
           return s; 
       }   

}