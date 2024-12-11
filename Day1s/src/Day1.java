
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();

		
		try {
			Scanner scanner = new Scanner(new File("input.txt"));
			
			while(scanner.hasNext()) {
				
				//call nextInt 2x each iteration
				//add to the respective lists
				leftList.add(scanner.nextInt());
				rightList.add(scanner.nextInt());
			}
			
			int sum = 0;
			
			while(leftList.size() > 0) {
				int smallest =  leftList.get(0);
				int smallestIndex = 0;
				for(int i = 0; i < leftList.size(); i++) {
					if(leftList.get(i) < smallest) {
						smallest = leftList.get(i);
						smallestIndex = i;
					}
				}
				
				//remove the smallest from that list
				leftList.remove(smallestIndex);
				
				int smallestRight = rightList.get(0);
				smallestIndex = 0;
				for(int i = 0; i < rightList.size(); i++) {
					if(rightList.get(i) < smallestRight) {
						smallestRight = rightList.get(i);
						smallestIndex = i;
					}
				}
				
				rightList.remove(smallestIndex);
				
				sum += Math.abs(smallestRight - smallest);
			}
			
			System.out.println("Sum is " + sum);
			
			//look for the smallest element in left
			//same for right
			//find their diff
			//remove the smallest each time
			//repeat
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}


