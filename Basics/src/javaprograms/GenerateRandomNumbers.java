package javaprograms;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {

		//to generate random numbers we have to use Random class
		
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(1000);
		int rand_int2 = rand.nextInt(1000);
		
		System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random numbers are: "+rand_int2);
		
		System.out.println("************");
		
		//To Generate Random Double numbers
		double rand_double1 = rand.nextDouble();
		double rand_double2 = rand.nextDouble();
		
		System.out.println("Double random numbers are: "+rand_double1);
		System.out.println("Double random numbers: "+rand_double2);
		
		
		
		
		
		
	}

}
