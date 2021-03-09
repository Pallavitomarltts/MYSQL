package com.ltts.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.ltts.dao.Playerdao;
import com.ltts.dao.Teamdao;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class ProjectMain {

public static void main(String[] args) throws Exception, IOException {
Scanner sc= new Scanner(System.in);

System.out.println("***USER MENU***");
        System.out.println("1.SHOW TABLE");
        System.out.println("2. INSERT TABLE ");
        System.out.println("3. UPDATE TABLE ");
        System.out.println("4. DELETE TABLE "); 
        
        Teamdao td=new Teamdao();
		Playerdao pd=new Playerdao();
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int choice= sc.nextInt();
        
        if(choice==1)
        {
        	System.out.println("ENTER THE TABLE YOU WANT TO SEE");
        	System.out.println("1. SHOW PLAYER TABLE");
        	System.out.println("2. SHOW TEAM PLAYER");
        	int choice2= sc.nextInt();
        	if(choice2==1)
        	{
        		pd.showPlayer();
        	}
        	if(choice2==2)
        	{
        		td.showTeam();
        	}
        }
        
        if(choice==2)
        {
       
        System.out.println("WHICH TABLE YOU WANT TO INSERT");
        System.out.println("1. INSERT IN PLAYER TABLE");
        System.out.println("2. INSERT IN TEAM TABLE");
        int choice3 =sc.nextInt();
        if(choice3==1) {
        System.out.println("Enter the Player no");
            int pno1=Integer.parseInt(br.readLine());
            System.out.println("Enter the Player name");
            String name1=br.readLine();
            System.out.println("Enter the Player Skills");
            String skills1=br.readLine();
            System.out.println("Enter TeamID");
            int id1=Integer.parseInt(br.readLine());
            System.out.println("Enter Player Country");
            String country1=br.readLine();
            System.out.println("Enter Player DOB");
            String DOB=br.readLine();
            Player p =new Player(pno1,name1,skills1,id1,country1,DOB);            
              pd.insertPlayer(p);
              System.out.println("----------------");
              pd.showPlayer();
        }
       
        if(choice3==2) {
        System.out.println("Enter the Team name");
            String name2=br.readLine();
            System.out.println("Enter the Team owner");
            String owner2=br.readLine();
            System.out.println("Enter TeamID");
            int id2=Integer.parseInt(br.readLine());
            System.out.println("Enter Team Caption");
            String caption2=br.readLine();
                // System.out.println(t.toString());
            Team t= new Team(name2,owner2,id2,caption2);
            td.insertTeam(t);
            System.out.println("------------------");
            td.showTeam();    
        }
        }
        
        if(choice==3)
        {
        	System.out.println("WHICH TEAM YOU WANT TO UPDATE");
        	System.out.println("1. UPDATE PLAYER TABLE");
        	System.out.println("2. UPDATE TEAM PLAYER");
            int choice4= Integer.parseInt(br.readLine());
            if(choice4==1)
            {
            	System.out.println("SELECT THE UPDATE");
            	System.out.println("1. PLAYER NUMBER");
            	System.out.println("2. PLAYERNAME");
            	System.out.println("3. PALYER SKILLS");
            	System.out.println("4. TEAMID");
            	System.out.println("5. PLAYER COUNTRY");
            	
            	int choice5=Integer.parseInt(br.readLine());
				if(choice5==1)//update player no
				{
					 System.out.println("ENTER THE PLAYERNAME YOU WANT TO UPDATE - ");
			    	 String pname=br.readLine();
			    	System.out.println("ENTER NEW PLAYER NO - ");
			    	String pno=br.readLine();
			    	String sql=String.format("UPDATE PLAYER SET PLAYERNO='%s' WHERE PLAYERNAME='%s'",pno,pname);
			    	pd.updatePlayer(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					pd.showPlayer();
				}
				if(choice5==2)//update pname
				{
					System.out.println("ENTER THE PLAYERNAME YOU WANT TO UPDATE -  ");
			    	 String pname=br.readLine();
			    	System.out.println("ENTER NEW PLAYER NAME - ");
			    	String pname1=br.readLine();
			    	String sql=String.format("UPDATE PLAYER SET PLAYERNAME='%s' WHERE PLAYERNAME='%s'",pname1,pname);
			    	pd.updatePlayer(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					pd.showPlayer();
				}
				if(choice5==3)//update pskill
				{
					System.out.println("ENTER THE PLAYERNAME YOU WANT TO UPDATE - ");
			    	 String pname=br.readLine();
			    	System.out.println("ENTER NEW PLAYER SKILLS - ");
			    	String pskill=br.readLine();
			    	String sql=String.format("UPDATE PLAYER SET PLAYERSKILLS='%s' WHERE PLAYERNAME='%s'",pskill,pname);
			    	pd.updatePlayer(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					pd.showPlayer();
				}
				if(choice5==4)//update teamid
				{
					System.out.println("ENTER THE PLAYERNAME YOU WANT TO UPDATE -  ");
			    	 String pname=br.readLine();
			    	System.out.println("ENTER NEW TEAMID - ");
			    	String pid=br.readLine();
			    	String sql=String.format("UPDATE PLAYER SET TEAMID='%s' WHERE PLAYERNAME='%s''",pid,pname);
			    	pd.updatePlayer(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					pd.showPlayer();
				}
				if(choice5==5)//update pcountry
				{
					System.out.println("ENTER THE PLAYERNAME YOU WANT TO UPDATE -  ");
			    	 String pname=br.readLine();
			    	System.out.println("ENTER NEW PLAYER COUNTRY -");
			    	String pcon=br.readLine();
			    	String sql=String.format("UPDATE PLAYER SET PLAYERSCOUNTRY='%s' WHERE PLAYERNAME='%s'",pcon,pname);
			    	pd.updatePlayer(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					pd.showPlayer();
				}
			}
        
         
            if(choice4==2)
            {
            	System.out.println("SELECT THE UPDATE");
            	System.out.println("1. TEAM NAME");
            	System.out.println("2. TEAM OWNER");
            	System.out.println("3. TEAM ID");
            	System.out.println("4. TEAM CAPTION");
            	
            	int choice6=Integer.parseInt(br.readLine());
				if(choice6==1)//update player no
				{
					// Team t=new Team();
			    	 System.out.println("ENTER THE TEAMID  YOU WANT TO UPDATE - ");
			    	 int oteam=Integer.parseInt(br.readLine()); 
			    	System.out.println("ENTER THE NEW TEAM NAME - ");
			    	String tname=br.readLine();
			    	String sql=String.format("UPDATE TEAM SET TEAMNAME ='%s' WHERE TEAMID ='%s'",tname,oteam);
			    	td.updateTeam(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					td.showTeam();
			     }
			     if(choice6==2)
			     {
			    	 System.out.println("ENTER THE TEAMID  YOU WANT TO UPDATE - ");
			    	 int oteam=Integer.parseInt(br.readLine()); 
			    	System.out.println("ENTER THE OWNER NAME - ");
			    	String toname=br.readLine();
			    	String sql=String.format("UPDATE TEAM SET TEAMOWNER='%s' WHERE TEAMID='%s'",toname,oteam);
			    	td.updateTeam(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					td.showTeam();
			     }
			     if(choice6==3)
			     {
			    	 System.out.println("ENTER THE TEAMID  YOU WANT TO UPDATE - ");
			    	 int oteam=Integer.parseInt(br.readLine()); 
			    	System.out.println("ENTER THE NEW TEAM ID - ");
			    	String tid=br.readLine();
			    	String sql=String.format("UPDATE TEAM SET  TEAMID='%s' WHERE TEAMID='%s'",tid,oteam);
			    	td.updateTeam(sql); 
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					td.showTeam();
			     }
			     if(choice6==4)
			     {
			    	 System.out.println("ENTER THE TEAMID  YOU WANT TO UPDATE - ");
			    	 int oteam=Integer.parseInt(br.readLine()); 
			    	System.out.println("ENTER NEW NEW TEAM CAPTION - ");
			    	String tcapt=br.readLine();
			    	String sql=String.format("UPDATE TEAM SET TEAMCAPTION='%s' WHERE TEAMID='%s'",tcapt,oteam);
			    	td.updateTeam(sql);
			    	System.out.println("UPDATED SUCCESSFULLY");
					System.out.println("--------------------");
					td.showTeam();
			     }
		
	              }
        }
            if(choice==4)
			{
			//System.out.println("Delete");
				System.out.println("WHICH TEAM YOU WANT TO OPERATE DELETE");
				System.out.println("1.DELETE IN PLAYER TABLE");
				System.out.println("2.DELETE IN TEAM TABLE");
				int choice6=Integer.parseInt(br.readLine());
				if(choice6==1)//delete in Player
				{
					System.out.println("ENTER THE PLAYER NAME YOU WANT TO DELETE");
					String pname=br.readLine();
					String sql=String.format("DELETE FROM PLAYER WHERE PLAYERNAME ='%s'",pname);
			    	pd.deletePlayer(sql);
					System.out.println("--------------------");
					pd.showPlayer();
				}
				if(choice6==2)//delete in Team
				{
					System.out.println("ENTER THE TEAM YOU WANT TO DELETE");
					String tname=br.readLine();
					String sql=String.format("DELETE FROM TEAM WHERE TEAMNAME='%s'",tname);
			    	td.deleteTeam(sql);
					System.out.println("--------------------");
					td.showTeam();
					
				}      
            }

        
}
}


