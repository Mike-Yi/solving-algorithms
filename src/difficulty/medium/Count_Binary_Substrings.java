package difficulty.medium;

public class Count_Binary_Substrings {

	public static void main(String[] args) {
	
		Count_Binary_Substrings s = new Count_Binary_Substrings();
		s.countBinarySubstrings("00110011");
		
	}
    public int countBinarySubstrings(String s) {
        int i = 0;
        int j = 0;
        int leftNum = 0;
        int rightNum = 0;
        int count = 0;
        
        while(j < s.length()){
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                j++;
            }
            rightNum = j - i ;
            if(leftNum != 0) {
                count += Math.min(leftNum,rightNum);    
            }
            leftNum = rightNum;
            i = j;
        }
        
        return count;
        
    }

}
