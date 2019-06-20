package day46;

import java.util.ArrayList;

public class SlackAction {

	public static void main(String[] args) {
		
		
		
		
		 SlackUser s1 = new SlackUser(); 
		    System.out.println( s1.toString() );
		    // below code will be seen as above code for compiler
		    System.out.println( s1 );
		    
		    SlackUser s = new SlackUser ("magician", "akbar@cybertek.com", 0);
		    SlackUser s2 = new SlackUser ("instructor", "instructor@cybertek.com", 0);
		    SlackUser s3 = new SlackUser ("student", "student@cybertek.com", 29);
		    SlackUser s4 = new SlackUser ("mentor", "mentor@cybertek.com", 20);
		    
		    ArrayList <SlackUser> userList = new ArrayList <>();
		    userList.add(s1);
		    userList.add(s2);
		    userList.add(s3);
		    userList.add(s4);
		    
		    for (SlackUser each : userList) {
		      System.out.println(each);
		      each.sendMessage("general", "Good morning!" );
		    }
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		/*
		SlackUser slack1 = new SlackUser();
		SlackUser slack2 = new SlackUser("Superman", "superman@heroes.com", 1);
		SlackUser slack3 = new SlackUser("Batman", "batman@heroes.com", 1);
		SlackUser slack4 = new SlackUser("Spiderman", "spiderman@heroes.com", 2);
		SlackUser slack5 = new SlackUser("Ironman", "ironman@heroes.com", 2);
		
		ArrayList <SlackUser> slackList = new ArrayList <>();
		
		slackList.add(slack1);
		slackList.add(slack2);
		slackList.add(slack3);
		slackList.add(slack4);
		slackList.add(slack5);
		
		
		for (SlackUser each : slackList) {
			System.out.println(each);
			each.SendMessage("ClassChat", "Hello everyone");
		}
		
		*/
	}

}
