package difficulty.medium;

import java.util.Stack;

public class Decode_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decode_String s = new Decode_String();
		s.decodeString("2[abc]3[cd]ef");
	}
	
    public String decodeString(String s) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        
        Stack<String> stackWord = new Stack<>();
        stackWord.push("");
        
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                int p = i;
                while(Character.isDigit(s.charAt(i))){
                    i++;
                }
                String numInString = s.substring(p, i);
                stack.push(Integer.valueOf(numInString));

            } else if(s.charAt(i) == '['){
                String temp = "";
                i++;
                while(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    temp += s.charAt(i++);
                }
                stackWord.push(temp);
            } else if(s.charAt(i) == ']') {
                int r = stack.pop();
                String spop = stackWord.pop();
                String sto = stackWord.pop();
                for(int a = 0; a < r ; a++) {
                    sto += spop;
                }
                stackWord.push(sto);
                i++;
            } else {
                String temp = s.substring(i,i+1);
                String sto = stackWord.pop();
                sto += temp;
                stackWord.push(sto);
                i++;
            } 
        }
        
        return stackWord.pop();
    }
}
