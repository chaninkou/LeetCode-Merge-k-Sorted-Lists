package leetcode23;

import java.util.PriorityQueue;

public class MergeKSortedListFunction {
	// At least n(logn) since we sorted all the number in the sorted lists
	 public ListNode mergeKLists(ListNode[] lists) {
	        if(lists.length == 0 || lists == null ){
	            return null;
	        }
	        
	        // Have to use the lamdas for the comparator since it doesn't know which to complete
	        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);
	        
	        ListNode dummyNode = new ListNode(0);

	        ListNode current = dummyNode;
	        
	        for(ListNode list : lists){
	            if(list != null){
	                queue.add(list);
	            }
	        }
	        
	        while(!queue.isEmpty()){
	        	// queue.poll() will get the next biggest
	            current.next = queue.poll();
	            
	            current = current.next;
	            
	            // current.next will check if there is any other node after current
	            if(current.next != null){
	                queue.add(current.next);
	            }
	        }
	        
	        
	        return dummyNode.next;
	    }
}
