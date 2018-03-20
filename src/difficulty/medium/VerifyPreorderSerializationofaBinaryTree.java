package difficulty.medium;

public class VerifyPreorderSerializationofaBinaryTree {

	public static void main(String[] args) {
		VerifyPreorderSerializationofaBinaryTree s = new VerifyPreorderSerializationofaBinaryTree();
		s.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
		
	}
	
    public boolean isValidSerialization(String preorder) {
        
        int countLeave = 0;
        int countNode = 0;
        int count = 0;
        
        String[] list = preorder.split(",");
        
        for(String s : list){
            count++;
            if(s.equals("#")) {
                countLeave++;
            } else {
                countNode++;
            }
            
            if(countLeave > countNode) break;   
        }
        
        return countLeave - 1 == countNode && count == list.length;
    }
}
