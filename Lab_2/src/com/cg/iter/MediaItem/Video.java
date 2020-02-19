package com.cg.iter.MediaItem;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearOfRelease;
	
	public Video() {
		super();
	}
	
	public Video(int uid, String title, int numberofcopies,String director, String genre, int yearOfRelease,int runTime) {
		super(uid,title,numberofcopies,runTime);
		this.director = director;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
	}
	
	public Video(int uid, String title, int numberofcopies,int runTime) {
		super(uid,title,numberofcopies,runTime);
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public int getUid(){
		return super.getUid();
	}
	
	public String title(){
		return super.getTitle();
	}
	
	public int getNumberofcopies(){
		return super.getNumberofcopies();
	}
	
	public int getRunTime() {
		return super.getRunTime();
	}
	
	public void checkIn(){
		  super.checkIn();
	}
	
	public void checkOut(){
		  super.checkOut();
	}
	
	public void addItem(){
		super.addItem();
	}
	
	public void print(){
		System.out.println("Information about the Video: ");
		System.out.println("Director : "+ director);
		System.out.println("Genre : "+ genre);
		System.out.println("Year of release : "+ yearOfRelease);
		super.print();
	}
	
}
