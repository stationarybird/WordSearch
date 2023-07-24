import java.util.Arrays;

public class WordSearch
{
  char[][] thegrid;
	/** One 2D array instance variable */
	/*  You CANNOT add any additional instance variables */
	
	
	/** constructor used to set the number of rows and columns in the 2D array
		* @param row
		* @param col*/
	public WordSearch(int row, int col)
	{
		thegrid = new char[row][col];
	}
	
	/** method to set an element in the 2D array
		* @param s which is the value to store in the 2D array
		* @param row the row to use
		* @param col the column to use*/
	public void setSpot(String s, int row, int col)
	{

    thegrid[row][col] = s.charAt(0);
	}
	
	/** methods to check for the word in the 2D array
		* @param word the word to search for
		* @return return true or false*/
public boolean inGrid(String s)  {
            int colLength = thegrid[0].length;
            int rowLength = thegrid.length;
            String rowWords = new String("");
            String bwRowWords = new String("");
            String colWords = new String("");
            String bwColWords = new String("");
            String northEast = new String("");
            String northWest = new String("");
            String southEast = new String("");
            String southWest = new String("");
            String bwNorthEast = new String("");
            String bwNorthWest = new String("");
            String bwSouthEast = new String("");
            String bwSouthWest = new String("");
            for (int r=0; r < rowLength; r++) {
                rowWords = "";
                for(int c = 0; c < colLength; c++) {
                    rowWords += thegrid
      [r][c];
                }
                bwRowWords = "";
                for (int i = 0; i < rowWords.length(); i++) {
                    bwRowWords = rowWords.charAt(i) + bwRowWords;
                }
                if (rowWords.indexOf(s) != -1 || bwRowWords.indexOf(s) != -1) {
                    return true;
                }
    
            }
            for (int c1=0; c1 < colLength; c1++) {
                colWords = "";
                for(int r1 = 0; r1 < rowLength; r1++) {
                    colWords += thegrid
      [r1][c1];
                }
                bwRowWords = "";
                for (int j = 0; j < colWords.length(); j++) {
                    bwColWords = colWords.charAt(j) + bwColWords;
                }
                if (colWords.indexOf(s) != -1 || bwColWords.indexOf(s) != -1) {
                    return true;
                }
    
            }
    
            for (int i = 0; i < rowLength; i++) {
                for (int j = 0; j < colLength; j++) {
                    northEast = "";
                    northWest = "";
                    southEast = "";
                    southWest = "";
                    if(thegrid
        [i][j] == s.charAt(0)) {
                        for(int k = 0; k < s.length(); k++)   {
                            if (i + k < rowLength && j + k < colLength) {
                                northEast += thegrid
                  [i+k][j+k];
                              }
                            if(i - k > 0 && j + k < colLength) {
                                northWest += thegrid
                  [i-k][j+k];
                              }
                            if (i + k < rowLength && j - k >= 0) {
                                southWest += thegrid
                  [i+k][j-k];
                              }
                            if(i - k > 0 && j - k > 0) {
                                southEast += thegrid
                  [i-k][j-k];
                              }
                  
                        }

                    }
                    bwNorthEast = "";
                    for (int m = 0; m < northEast.length(); m++) {
                        bwNorthEast = northEast.charAt(m) + bwNorthEast;
                    }
                    bwNorthWest = "";
                    for (int n = 0; n < northWest.length(); n++) {
                        bwNorthWest = northWest.charAt(n) + bwNorthWest;
                    }
                    bwSouthEast = "";
                    for (int o = 0; o < southEast.length(); o++) {
                        bwSouthEast = southEast.charAt(o) + bwSouthEast;
                    }
                    bwSouthWest = "";
                    for (int p = 0; p < southWest.length(); p++) {
                        bwSouthWest = southWest.charAt(p) + bwSouthWest;
                    }
                    if (northEast.indexOf(s) != -1 || bwNorthEast.indexOf(s) != -1 || northWest.indexOf(s) != -1 || bwNorthWest.indexOf(s) != -1 || southEast.indexOf(s) != -1 || bwSouthEast.indexOf(s) != -1 || southWest.indexOf(s) != -1 || bwSouthWest.indexOf(s) != -1) {
                        return true;
                    }
                }
            
            
            }
        return false;
    }
}
