package com.ltts.model;

public class Player 
{
private int playernumber;
private String playername;
private String playerskill;
private int teamid;
private String country;
private String DOB;

public Player() {
	super();
}
public Player(int playernumber, String playername, String playerskill, int teamid, String country, String DOB) {
	super();
	this.playernumber = playernumber;
	this.playername = playername;
	this.playerskill = playerskill;
	this.teamid = teamid;
	this.country = country;
	this.DOB=DOB;
}
public int getPlayernumber() {
	return playernumber;
}
public void setPlayernumber(int playernumber) {
	this.playernumber = playernumber;
}
public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getPlayerskill() {
	return playerskill;
}
public void setPlayerskill(String playerskill) {
	this.playerskill = playerskill;
}
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Player [playernumber=" + playernumber + ", playername=" + playername + ", playerskill=" + playerskill
			+ ", teamid=" + teamid + ", country=" + country + "]";
}


}
