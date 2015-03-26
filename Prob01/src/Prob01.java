import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args){
		List<Integer> inputList = new ArrayList<Integer>();
		try {
			Scanner s = new Scanner(new File("Prob01.in.txt"));
			while(s.hasNextInt()){
				inputList.add(s.nextInt());
			}
			Iterator it = inputList.iterator();
			while(it.hasNext()){
				int tempNum = (int)it.next();
				if(tempNum % 3 == 0 && tempNum % 7 == 0){
					System.out.println("CODEQUEST");
				}
				else if(tempNum % 3 == 0){
					System.out.println("CODE");
				}
				else if(tempNum % 7 == 0){
					System.out.println("QUEST");
				}else{
					System.out.println(tempNum);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
