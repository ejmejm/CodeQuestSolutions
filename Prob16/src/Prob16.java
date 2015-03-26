import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob16 {
	public static void main(String[] args){
		//int startSteps = 15;
		//char[][] map;
		int rows = 0;
		Scanner sMap;
		try {
			sMap = new Scanner(new File("Prob16.in.txt"));
			while(sMap.hasNextLine()){
				sMap.nextLine();
				rows++;
			}
			sMap.useDelimiter("");
			
			
			
			
			
			
			
			
			sMap.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
