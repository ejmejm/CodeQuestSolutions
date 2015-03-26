import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob02 {
	public static void main(String[] args){
		int handNum = 1;
		try {
			Scanner s = new Scanner(new File("Prob02.in.txt"));
			while(s.hasNextLine()){
				printStats(handNum, s);
				handNum++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void printIrreg(String abrev, String full, String[] hand){
		int counter = 0;
		for(String s : hand){
			if(s.contains(abrev)){
				counter++;
			}
		}
		if(counter == 1){
			System.out.println(counter + "-" + full);
		}
		else if(counter == 0){
		}else{
			System.out.println(counter + "-" + full + "S");
		}
	}
	
	public static void printStats(int hNum, Scanner scan){
		System.out.println("HAND " + hNum);
		String line = scan.nextLine();
		String[] sa = line.split(" ");
		int red = 0, black = 0, clubs = 0, diamonds = 0, hearts = 0, spades = 0;
		for(String s : sa){
			if(s.contains("C")){
				clubs += 1;
				black += 1;
			}
			else if(s.contains("D")){
				diamonds += 1;
				red += 1;
			}
			else if(s.contains("H")){
				hearts += 1;
				red += 1;
			}
			else if(s.contains("S")){
				spades += 1;
				black += 1;
			}
		}
		System.out.println(red + "-RED");
		System.out.println(black + "-BLACK");
		if(clubs == 1){
			System.out.println(clubs + "-CLUB");
		}
		else{
			System.out.println(clubs + "-CLUBS");
		}
		if(diamonds == 1){
			System.out.println(diamonds + "-DIAMOND");
		}
		else{
			System.out.println(diamonds + "-DIAMONDS");
		}
		if(hearts == 1){
			System.out.println(hearts + "HEART");
		}
		else{
			System.out.println(hearts + "-HEARTS");
		}
		if(spades == 1){
			System.out.println(spades + "-SPADE");
		}
		else{
			System.out.println(spades + "-SPADES");
		}
		for(int iv=2; iv<=10; iv++){
			int numI = 0;
			String i = Integer.toString(iv);
			for(String s : sa){
				if(s.contains(i)){
					numI++;
				}
			}
			if(numI == 1){
				System.out.println(numI + "-" + i + " card");
			}
			else if(numI == 0){
			}else{
				System.out.println(numI + "-" + i + " cards");
			}
		}
		printIrreg("J", "JACK", sa);
		printIrreg("Q", "QUEEN", sa);
		printIrreg("K", "KING", sa);
		printIrreg("A", "ACE", sa);
	}
}
