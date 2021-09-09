package mustafa_kollu;

import java.util.ArrayList;
import java.util.Scanner;

public class Border {
	
	public static int globalWidth;		//map width
	public static int globalHeight;		//map height
	
	private int x;						//x coordinates of map
	private int y;						//y coordinates of map
	
	public Border(int x, int y) {		//constructor
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {					//getter setter
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static void readInput(Scanner path, ArrayList<Border> array) throws NumberFormatException, Exception {
											//read path, assign global variables and add x,y coordinates to array
		boolean temp = true; 
		while(path.hasNextLine()==true) {
			String l1 = path.nextLine();
			String[] arr=l1.split(" ");
			if(temp) {
				globalWidth = Integer.parseInt(arr[0]);
				globalHeight = Integer.parseInt(arr[1]);
				temp=!temp;
			}
			else {
				array.add(new Border(Integer.parseInt(arr[0]),Integer.parseInt(arr[1])));
			}
		}
	}
}
