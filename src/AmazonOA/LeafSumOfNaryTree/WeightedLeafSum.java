package AmazonOA.LeafSumOfNaryTree;

public class WeightedLeafSum {

    public int weightedLeafSum(Node root) {

        return dfs(root, 1);

    }

    public int dfs(Node root, int depth) {
        if(root == null) return 0;
        if(root.children.size() == 0) {
            return depth * root.val;
        }

        int sum = 0;

        for(Node child : root.children) {
             sum += dfs(child, depth + 1);
        }

        return sum;
    }
}
