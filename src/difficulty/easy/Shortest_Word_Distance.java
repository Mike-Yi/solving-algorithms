package difficulty.easy;

public class Shortest_Word_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int shortestDistance(String[] words, String word1, String word2) {
        int one = -1;
        int two = -1;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < words.length; i++) {
            
            if(words[i].equals(word1)){
                one =  i;
            }
            
            if(words[i].equals(word2)){
                two =  i;
            }
            
            if(one != -1 && two != -1) {
                min = Math.min(min, Math.abs(one - two));
                
            }
            
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
        
        
    }
}
