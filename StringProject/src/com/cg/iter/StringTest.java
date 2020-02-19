package com.cg.iter;

public class StringTest 
{
	public StringTest()
	{
		String str = "Hello";//String literal
		modify(str);
		System.out.println("after modify: " +str);
		StringBuilder sb = new StringBuilder("Hello");
		modify(sb);
		System.out.println("sb : " + sb);
		
	}

	
	private void modify(StringBuilder sb) {
		sb.append(" guys");//overloaded method - static polymorphism - checked by compiler
		// TODO Auto-generated method stub
		
	}


	private void modify(String str) 
	{
		//str= str + " guys";
		str = str.concat(" guys");
		System.out.println("inside modify: " +str);
		
	}


	public static void main(String[] args) 
		{
			new StringTest();
		}

}
