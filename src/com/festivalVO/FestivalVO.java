package com.festivalVO;

import java.sql.Date;

public class FestivalVO {
	int fnum;
	String fname;
	String city;
	Date sdate;
	Date edate;
	int capa;
	String ftel;
	String home;
	
	public FestivalVO(){ }
	public FestivalVO(int fnum, String fname, String city, Date sdate, Date edate, int capa, String ftel, String home) {
		super();
		this.fnum = fnum;
		this.fname = fname;
		this.city = city;
		this.sdate = sdate;
		this.edate = edate;
		this.capa = capa;
		this.ftel = ftel;
		this.home = home;
	}
	
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public int getCapa() {
		return capa;
	}
	public void setCapa(int capa) {
		this.capa = capa;
	}
	public String getFtel() {
		return ftel;
	}
	public void setFtel(String ftel) {
		this.ftel = ftel;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}

}
