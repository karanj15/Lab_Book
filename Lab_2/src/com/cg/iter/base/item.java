package com.cg.iter.base;

public abstract class item {
	private int uid;
	private String title;
	private int numberofcopies;
	public item() 
	{
		uid=0;
		title="";
		numberofcopies=0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		if (numberofcopies != other.numberofcopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}


	public item(int uid, String title, int numberofcopies) 
	{
			this.uid = uid;
			this.title = title;
			this.numberofcopies = numberofcopies;
		}
	
	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", numberofcopies=" + numberofcopies + "]";
	}
	
	public int getUid() 
	{
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumberofcopies() 
	{
		return numberofcopies;
	}
	
	public void setNumberofcopies(int numberofcopies) 
	{
		this.numberofcopies = numberofcopies;
	}
	public void print()
	{
		System.out.println("Identification number: "+ uid);
		System.out.println("Title: "+ title);
		System.out.println("Number of copies: "+ numberofcopies );
		
		}
	public void checkIn()
	{
		numberofcopies=numberofcopies+1;
		
	}
	public void checkOut()
	{
		numberofcopies=numberofcopies-1;
	}
	public void addItem(int uid, String title, int numberofcopies)
	{
		setUid(uid);
		setTitle(title);
		setNumberofcopies(numberofcopies);
	}

	public void addItem() {
		
	}
		
}
