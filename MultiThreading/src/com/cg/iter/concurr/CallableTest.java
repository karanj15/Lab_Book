package com.cg.iter.concurr;

import java.util.Date;
import java.util.concurrent.Callable; 
import java.util.concurrent.ExecutionException; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
import java.util.concurrent.Future;  

public class CallableTest
{
      public static void main(String[] args) { 
         System.out.println(new Date());
         Callable call1 = new MyCallable(1); 
         Callable call2 = new MyCallable(2); 
         ExecutorService es = Executors.newFixedThreadPool(2); 
         // Callable returns a Future object after completion of task
         Future<String> future1 = es.submit(call1); 
         Future<String> future2 = es.submit(call2); 
         for(int i=0;i<10;i++)  {
            System.out.print(" [main] ");
            try {Thread.sleep(2);} catch(InterruptedException e) {}
         }
         boolean listen1=true, listen2 = true; 
         while (listen1 || listen2) { 
             //System.out.print(" * ");
             if (listen1) { 
                String result; 
                try { 
                   result = future1.get(); 
                   listen1 = !future1.isDone(); 
                   System.out.println("\nfuture1 : "+result); 
                } 
                catch(InterruptedException | ExecutionException e)  {
                    e.printStackTrace(); 
                 }   
             } 
             if (listen2) { 
                String result; 
                try { 
                   result = future2.get(); 
                   listen2 = !future2.isDone(); 
                   System.out.println("\nfuture2 : "+result); 
                } 
                catch(InterruptedException | ExecutionException e)  {
                    e.printStackTrace(); 
                 }   
             } 
         }   
         while(true) {
           //System.out.print(" . ");
           if (!listen1 && !listen2) {
               System.out.print(" shutting down jobs");
               es.shutdown(); 
               break;
           }
         }
      }   
}
/*
java com.abc.concurr.CallableTest
*/