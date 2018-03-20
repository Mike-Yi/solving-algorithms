package difficulty.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Design_Hit_Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Design_Hit_Counter we = new Design_Hit_Counter();
		HitCounter s = we.new HitCounter();
		s.hit(2);
		s.hit(3);
		s.hit(4);
		s.getHits(300);
		s.getHits(301);
		s.getHits(302);
		s.getHits(303);
		s.getHits(304);
		s.hit(501);
		s.getHits(600);
	}
	class HitCounter {

	    /** Initialize your data structure here. */
	    LinkedList<Integer> list;
	    public HitCounter() {
	        this.list = new LinkedList<>();
	    }

	    /** Record a hit.
	        @param timestamp - The current timestamp (in seconds granularity). */
	    public void hit(int timestamp) {
	        list.add(timestamp);
	        /*
	        while(timestamp - list.peek() >= 300){
	            list.poll();
	        }
	        */
	    }

	    /** Return the number of hits in the past 5 minutes.
	        @param timestamp - The current timestamp (in seconds granularity). */
	    public int getHits(int timestamp) {
	        int i = 0;
	        while(i < list.size() && timestamp - list.get(i) >= 300) {
	            i++;
	        }
	        return list.size() - i;
	    }
	}

}
