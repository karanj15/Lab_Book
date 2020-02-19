package com.cg.iter;

public class GenericTest {

	public static void main(String[] args) {
		GenericTest gt= new GenericTest();
		Integer[] intArr= {1,2,3,4,8,2,1};
		//auto-boxing takes care of int to integer conversion
		gt.printArr(intArr);
		System.out.println();
		Character[] charArr={'S','O','A',' ','I','T','E','R'};
		gt.printArr(charArr);
		System.out.println();
		Double[] doubleArr={2.1, 3.5, 8.3, 1.9};
		gt.printArr(doubleArr);

	}

	private<E> void printArr(E[] elemArr) {
		for (E elem : elemArr) 
		{
			System.out.print(elem+" ");
		}
	
		
	}

}
