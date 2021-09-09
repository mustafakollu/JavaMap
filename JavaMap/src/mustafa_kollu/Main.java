package mustafa_kollu;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {

    	ArrayList<Border> arrayBorder = new ArrayList<>();			//Create new Arraylist for x,y coordinates
		File f = new File("input/input1.txt");						//Open input file
		Scanner borderList = new Scanner(f);						//Scanning input file
		Border.readInput(borderList,arrayBorder);					//Read input.txt, assign elements from input to arrayOrder and equate width and height to global variables
    	
        MapInterface mapInterface = new Map();											//Create new element from MapInterface
        Dimension dimension = new Dimension(Border.globalWidth, Border.globalHeight);	//Create new element from Dimension
        ZoneCounterInterface zoneCounterInterface = new ZoneCounter();					//Create new element from ZoneCounterInterface
        
        mapInterface.SetSize(dimension);												//Creates / Allocates a map of given size.
        mapInterface = dimension.AddBorder(mapInterface,arrayBorder);					//First it throws false on all boolean maps. Then it sets the borders to true.
        mapInterface.Show();															//Show the map
        
        zoneCounterInterface.Init(mapInterface);
        System.out.println("| number of geographic regions: " + zoneCounterInterface.Solve()+" |"); //Print number of geographic regions
        System.out.println(" - - - - - - - - - - - - - - - - - ");
    }
}