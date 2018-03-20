package difficulty.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Course_Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course_Schedule s = new Course_Schedule();
		s.canFinish(2, new int[][] {
			
			{1,0}
			
			
		});
	}
	
    public boolean canFinish(int numCourses, int[][] prerequisites) {

    	HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int[] course : prerequisites) {
            map.put(course[0], map.getOrDefault(course[0] , 0) + 1 );  
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(!map.containsKey(i)) {
                q.add(i);
                count++;
            }
        }
        
        while(!q.isEmpty()) {
            int currentC = q.poll();
            
            for(int[] course: prerequisites) {
                if(course[1] == currentC) {
                    map.put(course[0] , map.get(course[0]) - 1);   
                    if(map.get(course[0]) == 0) {
                        q.add(course[0]);
                        count++;
                    }
                }
            }
        }
        
        return numCourses == count;
    }
}
