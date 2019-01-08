/**
 * Created by MalhotR1 on 04/26/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5},
                {1,3,4},
                {2,6}
        };
        ListNode[] listNodes = new ListNode[3];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            ListNode ln = new ListNode(arr[i][0]);
            listNodes[k++] = ln;
            for (int j = 1; j < arr[i].length; j++) {
                ln.next = new ListNode(arr[i][j]);
                ln = ln.next;
            }

        }
        ListNode ln = mergeKLists(listNodes);
        while (ln != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        else if (lists.length == 1) return lists[0];
        else {
            TreeNode root = null;;

            for (int i = 0; i < lists.length; i++) {
                ListNode list = lists[i];

                while (list != null) {
                    root = insertIntoBST(root, list.val);
                    list = list.next;
                }
            }


            Stack<TreeNode> stk = new Stack<>();
            ListNode sol = null;
            ListNode head = null;
            stk.push(root);
            while (!stk.empty()) {
                TreeNode node = stk.pop();
                if (node.visited) {
                    int cnt = node.total;

                    if (sol == null) {
                        cnt--;
                        sol = new ListNode(node.val);
                        if (head == null) head = sol;
                    }

                    while (cnt-- > 0) {
                        sol.next = new ListNode(node.val);
                        sol = sol.next;
                    }
                }

                if (!node.visited) {
                    if (node.right != null) stk.push(node.right);
                    stk.push(node);
                    if (node.left != null) stk.push(node.left);
                    node.visited = true;
                }
            }
            return head;
        }
    }


    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (root.val == val) {
            root.total++;
        } else if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

}

class TreeNode {
    int val;
    int total;
    TreeNode left;
    TreeNode right;
    boolean visited;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
        total = 1;
        left = null;
        right = null;
        visited = false;
    }
}

class ListNode {
  int val;
  ListNode next;
  public ListNode() {}
  public ListNode(int x) { val = x; }
}