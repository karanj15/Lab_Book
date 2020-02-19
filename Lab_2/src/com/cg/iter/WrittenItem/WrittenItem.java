package com.cg.iter.WrittenItem;

import com.cg.iter.base.item;

public abstract class WrittenItem extends item {
	private String author;

	public WrittenItem(int uid, String title, int numberofcopies, String author) {
		super(uid,title,numberofcopies);
		this.author=author;
	}
	

	public WrittenItem() {
		super();
	}


	public WrittenItem(int uid, String title, int numberofcopies) {
		super(uid,title,numberofcopies);
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberofcopies(){
		return super.getNumberofcopies();
	}
	public String getTitle(){
		return super.getTitle();
	}
	public int getUid(){
		return super.getUid();
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
		}

	public void print(){
		System.out.println("Author : "+ author);
		super.print();
	}
	public void addItem() {
		super.addItem();
	}
}
