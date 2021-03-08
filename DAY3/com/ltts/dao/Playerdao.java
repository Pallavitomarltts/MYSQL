package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ltts.config.Myconnection;
import com.ltts.model.Player;

public class Playerdao {

	
		
		public void showPlayer() throws Exception
		{
			Connection mc =Myconnection.getConnection();
				Statement stmt=mc.createStatement();
				ResultSet rs=stmt.executeQuery("select * from player");
				
				while(rs.next())
				{
	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
				}
				mc.close();
		}
	public Player getPlayerById(int id)
	{
		Player p =new Player();
		return p;
	}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection mc= Myconnection.getConnection();
		PreparedStatement ps =mc.prepareStatement("Insert into Player values(?,?,?,?,?)");
		ps.setInt(1, p.getPlayernumber());
		ps.setString(2, p.getPlayername());
		ps.setString(3,p.getPlayerskill());
		ps.setInt(4,p.getTeamid());
		ps.setString(5, p.getCountry());
		return ps.execute();	
	}
	
	public void updatePlayer(String sql) throws Exception
	{
		Connection mc= Myconnection.getConnection();
	    Statement stmt = mc.createStatement();
	    int count= stmt.executeUpdate(sql);
	}
	
	public void deletePlayer(String sql) throws Exception 
	{
		Connection mc= Myconnection.getConnection();
		Statement stmt = mc.createStatement();
		int count= stmt.executeUpdate(sql);
	}
	
}
