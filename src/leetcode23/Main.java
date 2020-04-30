package leetcode23;

public class Main {
	public static void main(String[] args) {
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		
		int[] input = {1,4,5};
		
		int[] input2 = {1,3,4};
		
		int[] input3 = {2,6};
		
		ListNode head = list.insertNode(input);
		ListNode head1 = list.insertNode(input2);
		ListNode head2 = list.insertNode(input3);
		
		ListNode[] lists = {head,head1,head2};
		
		MergeKSortedListFunction solution = new MergeKSortedListFunction();
		
		list.displayLinkedList(solution.mergeKLists(lists));
	}
}
