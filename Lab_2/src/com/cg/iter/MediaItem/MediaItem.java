package com.cg.iter.MediaItem;

import com.cg.iter.base.item;

public abstract class MediaItem extends item{
	private int runTime;
	
	public void print(){
		System.out.println("Run time : "+ runTime+" min");
		super.print();
	}
	
	public MediaItem(int uid, String title, int numberofcopies, int runTime) {
		super(uid,title,numberofcopies);
		this.runTime=runTime;
	}
	public MediaItem() {
		super();
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
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
	public void addItem() {
		super.addItem();
	}
}
