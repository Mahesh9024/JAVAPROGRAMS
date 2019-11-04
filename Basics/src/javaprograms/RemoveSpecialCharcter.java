package javaprograms;

public class RemoveSpecialCharcter {

	public static void main(String[] args) {

		//this program is to remove a special, junk characters from a given string
		String str = "!@#$ Maddy selenium *^987%$#";
		//int n = str.length();
		String newstr = "";
		//We have to use regular expressions
		// [^a-zA-Z0-9] 
		//^ symbol , which removes all charcters
		
		newstr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newstr);
		
	}

}
