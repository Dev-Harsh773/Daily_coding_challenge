/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        while (temp != null) {
            String wo = String.valueOf(temp.val); 
            arr.add(wo);
            word.append(wo);
            temp = temp.next;
        }

        int len1 = word.length();

        for (int i = len1 - 1; i >= 0; i--) {
            result.append(arr.get(i)); 
        }

        return result.toString().equals(word.toString());
    }
}
