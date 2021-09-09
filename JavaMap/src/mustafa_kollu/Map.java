package mustafa_kollu;

public class Map implements MapInterface {

    public boolean[][] boolMap;
    
    @Override
    public void SetSize(Dimension dimension) {			//Set size of boolean map
        boolMap = new boolean[dimension.getWidth()][dimension.getHeight()];
    }

    @Override
    public void GetSize(Dimension dimension) {
        System.out.println(dimension.getWidth());
        System.out.println(dimension.getHeight());
    }
    
    @Override
    public void SetBorder(int x, int y) {				//Set border to true
        boolMap[x][y] = true;
    }

    @Override
    public void ClearBorder(int x, int y) {				//Set border to false
        boolMap[x][y] = false;
    }

    @Override
    public boolean IsBorder(int x, int y) {				//Check it is border
        if (x >= 0 && y >= 0 && x < boolMap.length && y < boolMap[0].length) {
            return boolMap[x][y];
        } 
        else {
            return true;
        }
    }

    @Override
    public void Show() {								//Print map to console
        int width = boolMap.length;
        int height = boolMap[0].length;
        for (int i = 0; i < width; i++) {
            System.out.print(" -");
        }
        System.out.println();
        for (int j = 0; j < height; j++) {
            System.out.print("|");
            for (int i = 0; i < width; i++) {
                System.out.print((boolMap[i][j] ? "# " : "  "));
            }
            System.out.print("|");
            System.out.println();
        }

        for (int i = 0; i < width; i++) {
            System.out.print(" -");
        }
        System.out.println();
    }

}