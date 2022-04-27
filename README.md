# Crack-the-Google-Play-Firebase-Sha1-key-Scan
Google Play Firebase want SHA1 fingerprint key but you can easily generate key with  just a little and sample code 

What is Fingerprint SHA1 Key

SHA1, short for Secure Hash Algorithm 1, is typically used to verify whether a file has been altered. 
We require publishers to provide an SHA1 value when registering new Android apps on Pangle in order to verify the ownership and authenticity of apps registered on the platform.


How to get it?


           keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android 

using this code on your keytool.exe application folder area


How to crack the Google Firebase SHA1 fingerprint scan area?

Well all keys length 59 and first and last characters are digits and alphabets are 'abcdef' so by this knowledge we will generate a random sha1 keys.

Example:


         47:62:42:86:46:c1:f8:98:b0:1d:5e:e7:2a:88:7e:58:d0:4e:b7:28
         50:38:5d:ed:d8:07:71:fc:b2:8f:8f:99:ee:80:ae:49:0e:af:83:83
         34:90:2d:9b:ea:c7:49:b1:20:1f:1e:4a:cd:96:31:52:58:fc:93:97
         53:02:f4:56:35:cb:7e:17:62:0d:8c:f5:65:d3:e7:25:4e:1f:22:67
         26:f8:cc:cd:f1:4a:fa:b0:4b:a9:ab:dd:a0:4e:b9:1b:7f:af:a4:90
         51:11:eb:72:33:52:36:22:ca:f2:e8:e8:10:86:24:0d:63:6e:3d:85
         16:79:7a:a9:91:5f:d7:49:d4:6a:3b:d7:ea:da:88:ec:d5:e2:ad:61


After that result like this:


![fakeFingerPrint](https://user-images.githubusercontent.com/75094927/165592375-dd1a26dd-3985-4096-a53e-c19eee598e51.png)


Fake and Real SHA1 Fingerprint key:



![fakeFingerPrint2](https://user-images.githubusercontent.com/75094927/165592468-948d9ae5-f923-4f0e-80c8-48ad164381fb.png)




Algorithm:


           public static String generateSha1Key() {
		 Random random = new Random();
		var keys = "0123456789abcdef"; //Random keys
		var digits = "0123456789"; // Digits chars
		var sha1_key = ""; // Sha key
		var keyLength = 59; // length of key
	
		var count=0;
		for(int i=0; i<keyLength;i++) {
			if(count == 2) { // Every 2 count add ':' this char on key
 				sha1_key = sha1_key + ":";
				count=0;
			}
			else {
				count++;
				if(i==0 || i == 1 || i== keyLength-1 || i== keyLength-2) // If the first chars and last chars add random digits
				    sha1_key = sha1_key + digits.charAt(random.nextInt(digits.length()));
				else
					sha1_key = sha1_key + keys.charAt(random.nextInt(keys.length())); // Otherwise add random other chars
				
			}
			
			
		}
		   return sha1_key;
		
	        }


