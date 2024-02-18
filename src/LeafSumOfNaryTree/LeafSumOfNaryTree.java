package LeafSumOfNaryTree;

public class LeafSumOfNaryTree {
    //given a n-ary tree, get sum of all leaves

    public int getLeafSum(Node root) {
        // DFS recursion
        if(root == null) return 0;
        if(root.children.size() == 0) return root.val;

        int sum = 0;

        for(Node child : root.children) {
            sum += getLeafSum(child);
        }

        return sum;
    }
}
