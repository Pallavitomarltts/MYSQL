package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.Myconnection;
import com.ltts.model.Team;

public class Teamdao {

	public void showTeam() throws Exception
	{
		Connection mc =Myconnection.getConnection();
			Statement stmt=mc.createStatement();
			ResultSet rs=stmt.executeQuery("select * from player");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			}

			mc.close();
	}
	
	public Team getTeamById(int id)
	{
		Team t =new Team();
		return t;
	}
	
	public boolean insertTeam(Team t) throws Exception
	{
		Connection mc= Myconnection.getConnection();
		PreparedStatement ps =mc.prepareStatement("Insert into Team values(?,?,?,?)");
		ps.setString(1, t.getTeamname());
		ps.setString(2, t.getTeamowner());
		ps.setInt(3, t.getTeamid() );
		ps.setString(4,t.getTeamcaption());
		return ps.execute();	
	}
	public void updateTeam(String sql) throws Exception
	{
		Connection mc= Myconnection.getConnection();
	Statement stmt = mc.createStatement();
	int count= stmt.executeUpdate(sql);
	}
	
	public void deleteTeam(String sql) throws Exception 
	{
		Connection mc= Myconnection.getConnection();
		Statement stmt = mc.createStatement();
		int count= stmt.executeUpdate(sql);
	}
}
