public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example: l1 = [2,4,3], l2 = [5,6,4] -> [7,0,8]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println(); // Expected: 7 0 8
    }
}
