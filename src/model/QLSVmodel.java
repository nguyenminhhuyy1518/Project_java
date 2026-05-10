package model;

import java.util.ArrayList;

public class QLSVmodel {
	
	private ArrayList<thisinh> dsThisinh;
	private String luachon;

	public QLSVmodel() {
		this.dsThisinh = new ArrayList<thisinh>();
		this.luachon = "";
	}

	public QLSVmodel(ArrayList<thisinh> dsThisinh) {
		this.dsThisinh = dsThisinh;
	}

	public ArrayList<thisinh> getDsThisinh() {
		return dsThisinh;
	}

	public void setDsThisinh(ArrayList<thisinh> dsThisinh) {
		this.dsThisinh = dsThisinh;
	}
	
	public void inset(thisinh ts) {
		this.dsThisinh.add(ts);
	}
	
	public void delete(thisinh ts) {
		this.dsThisinh.remove(ts);
	}
	
	public void update(thisinh ts) {
		this.dsThisinh.remove(ts);
		this.dsThisinh.add(ts);
	}

	public String getLuachon() {
		return luachon;
	}

	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}
	
	
	
	
	

}
