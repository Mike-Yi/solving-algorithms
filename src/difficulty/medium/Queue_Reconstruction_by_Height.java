package difficulty.medium;

import java.util.Arrays;
import java.util.LinkedList;

public class Queue_Reconstruction_by_Height {

	public static void main(String[] args) {
		Queue_Reconstruction_by_Height s = new Queue_Reconstruction_by_Height();
		s.reconstructQueue(new int[][]{{1,2} , {2,1} , {4,0}});

	}
	
    public int[][] reconstructQueue(int[][] people) {    
    	if(people.length == 0) return new int[][]{};
        Arrays.sort(people , (p1,p2) -> (p1[0] == p2[0])? p1[1] - p2[1] :p2[0] - p1[0]);
        LinkedList<int[]> list = new LinkedList<>();

        
        for(int i = 0; i < people.length; i++){
        	list.add(people[i][1], people[i]);
        }
        
        return list.toArray(new int[people.length][2]);
    }
}
