package difficulty.medium;

public class Shortest_Word_Distance_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shortest_Word_Distance_III s = new Shortest_Word_Distance_III ();
		s.shortestWordDistance(new String[]{"a","c","a","a"}, "a", "a");

	}
	
    public int shortestWordDistance(String[] words, String word1, String word2) {
        
        int w1 = -1;
        int w2 = -1;
        int minCount = Integer.MAX_VALUE;
        
        for(int i = 0; i < words.length; i++){

            if(word1.equals(words[i])) {
                w1 = i;
            }
            if(w1 != -1 && w2 != -1 && w1 != w2) {
                minCount = Math.min(minCount, Math.abs(w1-w2));
            }
            if(word2.equals(words[i])) {
                w2 = i;
            }
        }
        if(w1 != -1 && w2 != -1 && w1 != w2) {
            minCount = Math.min(minCount, Math.abs(w1-w2));
        }
        return (minCount==Integer.MAX_VALUE)? 0 : minCount;
    }
}
