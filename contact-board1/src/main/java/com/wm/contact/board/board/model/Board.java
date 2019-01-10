package com.wm.contact.board.board.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Board")
public class Board {
	private int id;
	private Date registerDate;
	private int count;
	private String title;
	private String contents;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public Board(int id, Date registerDate, int count, String title, String contents) {
		super();
		this.id = id;
		this.registerDate = registerDate;
		this.count = count;
		this.title = title;
		this.contents = contents;
	}
	
	public Board() {
		
	}
}
