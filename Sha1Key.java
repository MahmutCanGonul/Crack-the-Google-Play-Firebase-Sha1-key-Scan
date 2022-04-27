package HackerRank;

import java.util.Random;

public class Sha1Key {

	
	  public static String generateSha1Key() {
		 Random random = new Random();
		var keys = "0123456789abcdef";
		var digits = "0123456789";
		var sha1_key = "";
		var exampleKey = "61:d2:48:c7:13:53:c3:bd:58:5f:c0:09:06:c1:1d:eb:e2:be:3d:77";
	
		var count=0;
		for(int i=0; i<exampleKey.length();i++) {
			if(count == 2) {
				sha1_key = sha1_key + ":";
				count=0;
			}
			else {
				count++;
				if(i==0 || i == 1 || i== exampleKey.length()-1 || i== exampleKey.length()-2)
				    sha1_key = sha1_key + digits.charAt(random.nextInt(digits.length()));
				else
					sha1_key = sha1_key + keys.charAt(random.nextInt(keys.length()));
				
			}
			
			
		}
		return sha1_key;
		
	  }
	  public static void main(String[] args) {
	
		  for(int i=0; i<100;i++) {
			  System.out.println(generateSha1Key());
		  }
		  
		  
	  }
	
}
