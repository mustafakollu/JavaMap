package mustafa_kollu;

import java.util.ArrayList;

public class Dimension {
    private int width;							//I changed variable public to private. Thus, it cannot be changed directly.
    private int height;
    
    public Dimension(int width, int height) {	//constructor function
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {						//Getter, setter functions that allow us to access and change private variables.
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean CheckWithin(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }
	
	//Function to remark borders on the map
	public MapInterface AddBorder(MapInterface map, ArrayList<Border> arrayBorder) throws Exception{
		
		//We are assigning false value to all of our Boolean Map variable.
		for (int i = 0; i < Border.globalWidth; ++i) {			
			for (int j = 0; j < Border.globalHeight; ++j) {
                map.ClearBorder(i, j);
            }
        }
		
		for(Border temp:arrayBorder) {
			map.SetBorder(temp.getX(), temp.getY());
		}
		
    	return map;
	}
	
	
}
	
