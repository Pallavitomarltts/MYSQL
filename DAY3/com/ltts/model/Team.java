package com.ltts.model;

public class Team {
	private String teamname;
	private String teamowner;
	private int teamid;
	private String teamcaption;

	public Team() {
		super();
	}
	public Team(String teamname, String teamowner, int teamid, String teamcaption) {
		super();
		this.teamname = teamname;
		this.teamowner = teamowner;
		this.teamid = teamid;
		this.teamcaption = teamcaption;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamowner() {
		return teamowner;
	}
	public void setTeamowner(String teamowner) {
		this.teamowner = teamowner;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamcaption() {
		return teamcaption;
	}
	public void setTeamcaption(String teamcaption) {
		this.teamcaption = teamcaption;
	}
	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", teamowner=" + teamowner + ", teamid=" + teamid + ", teamcaption="
				+ teamcaption + "]";
	}
	
	

}
