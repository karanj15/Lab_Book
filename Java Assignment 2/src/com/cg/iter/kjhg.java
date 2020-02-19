package com.cg.iter;
import java.util.Arrays;
public class kjhg

 {
  public static void main(String[] args) {
	  String[][] names = {
			     {"A", "B", "C"}, {"M", "N", "O"}, {"X", "Y"}
			   };
			   Arrays.asList(names).stream()
			     .forEach((a)->{Arrays.asList(a)
			     .stream().forEach(System.out::print);});

  }
}