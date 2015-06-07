package com.msquirrel.bean;

import java.io.Serializable;

public class PageEntity  implements Serializable{

	private String title;
	private String[] choices;
	private int select=-1;
	
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String... choices) {
		this.choices = choices;
	}
	public PageEntity(String title){
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
