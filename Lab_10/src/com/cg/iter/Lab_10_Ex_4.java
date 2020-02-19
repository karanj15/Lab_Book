package com.cg.iter;

import java.util.function.Supplier;

public class Lab_10_Ex_4 {

	public static void main(String[] args) {
//		Consumer<Integer> c = ()->emp
		EmpInterface ei = empData::new;
		Supplier<EmpInterface> sup = () -> ei;
	}

}



class empData implements EmpInterface{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
	
}
