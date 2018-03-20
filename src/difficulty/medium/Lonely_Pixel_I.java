package difficulty.medium;

public class Lonely_Pixel_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findLonelyPixel(char[][] picture) {
        int countRes = 0;
        int[] rowDp = new int[picture.length];
        int[] colDp = new int[picture[0].length];
        
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[0].length; j++) {
                if(picture[i][j] == 'B') {
                    rowDp[i]++;
                    colDp[j]++;
                }                
            }
        }
        
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[0].length; j++) {
                if(picture[i][j] == 'B' && rowDp[i] == 1 && colDp[j] == 1) {
                    countRes++;
                }                
            }
        }
        
        return countRes;
    }

}
