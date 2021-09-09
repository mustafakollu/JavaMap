package mustafa_kollu;

public class ZoneCounter implements ZoneCounterInterface {
    MapInterface boolMap;

    @Override
    public void Init(MapInterface map) {
        this.boolMap = map;
    }

    @Override
    public int Solve() throws Exception {	//This function checks if there is a true booleanmap value. If not, it increases the region by one.
        
        int width = Border.globalWidth;	
        int height = Border.globalHeight;
        
        // Map elements are False by default so I didn't redefine variable
        boolean[][] boolMapVisited = new boolean[width][height];
        
        int regions = 0;
        
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (!boolMap.IsBorder(x, y) && !boolMapVisited[x][y]) {
                    Search(x, y, width, height, boolMapVisited);
                    regions++;
                }
            }
        }
        
        return regions;
    }

    private void Search(int x, int y, int width, int height, boolean[][] boolMapVisited) throws Exception {
        if (!boolMap.IsBorder(x, y) && !boolMapVisited[x][y]) {
            boolMapVisited[x][y] = true;							//Recursive function checks if there is a true value around it.
            Search(x, y + 1, width, height, boolMapVisited);
            Search(x, y - 1, width, height, boolMapVisited);
            Search(x + 1, y, width, height, boolMapVisited);
            Search(x - 1, y, width, height, boolMapVisited);
        }
    }
}
