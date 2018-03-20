package difficulty.medium;

public class Sentence_Screen_Fitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sentence_Screen_Fitting s = new Sentence_Screen_Fitting();
		s.wordsTyping(new String[]{"ab", "f", "dd", "ee"}, 5, 4);
		
	}
	
    public int wordsTyping(String[] sentence, int rows, int cols) {
        String s = String.join(" ", sentence) + " ";
        int start = 0, l = s.length();
        for (int i = 0; i < rows; i++) {
            start += cols;
            if (s.charAt(start % l) == ' ') {
                start++;
            } else {
                while (start > 0 && s.charAt((start-1) % l) != ' ') {
                    start--;
                }
            }
        }
        
        return start / s.length();
    }

}
