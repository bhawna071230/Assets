package com.example.Assests;

public class Assets {
	int id;
	String laptop;
	String table;
	String chair;
	String version;
	String date;
	String name;
	String designation;

	public Assets(int id,String name,String designation, String laptop, String version, String date,String table, String chair) {
		super();
		this.id = id;
		this.name = name;
		this.designation=designation;
		this.laptop = laptop;
		this.table = table;
		this.chair = chair;
		this.version = version;
		this.date = date;
	}

	public String getVersion() {
		return version;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}

	public String getChair() {
		return chair;
	}
	public void setChair(String chair) {
		this.chair = chair;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
