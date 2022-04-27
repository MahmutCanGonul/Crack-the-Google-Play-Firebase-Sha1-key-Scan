package HackerRank;

import java.util.Random;

public class Sha1Key {

	
	  public static String generateSha1Key() {
		 Random random = new Random();
		var keys = "0123456789abcdef";
		var digits = "0123456789";
		var sha1_key = "";
		var keyLength = 59;
	
		var count=0;
		for(int i=0; i<keyLength;i++) {
			if(count == 2) {
				sha1_key = sha1_key + ":";
				count=0;
			}
			else {
				count++;
				if(i==0 || i == 1 || i== keyLength-1 || i== keyLength-2)
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
