package com.cg.iter;

import java.util.*;
public class Lab6_Ex_9 {
 public static void main(String[] args)
    {
       // Create a default calendar
        Calendar cal = Calendar.getInstance();
       // Get and display information of current date from the calendar:
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Year: " + cal.get(Calendar.YEAR));
    }
}
