package LeafSumOfNaryTree;

public class LeafSumOfNaryTree {
    //given a n-ary tree, get sum of all leaves

    //restriction: you cannot use extra space. Can't use recursion.

    public int getLeafSum(Node root) {
        // DFS recursion
        //tc: each node in the tree is traversed once, so o(N)
        //sc:
        if(root == null) return 0;
        if(root.children.size() == 0) return root.val;

        int sum = 0;

        for(Node child : root.children) {
            sum += getLeafSum(child);
        }

        return sum;
    }
}
