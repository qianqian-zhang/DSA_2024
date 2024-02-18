package LeafSumOfNaryTree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        LeafSumOfNaryTree solution = new LeafSumOfNaryTree();
        System.out.println("Sum of leaves is: " + solution.getLeafSum(root));

        WeightedLeafSum solution2 = new WeightedLeafSum();
        System.out.println("Weighted Depth Sum of leaves is: " + solution2.weightedLeafSum(root));
    }
}

//       1             depth: 1
//    /     \
//    3   2   4        depth: 2   (2 + 4) * 2 = 12
//   / \
//  5   6               depth: 3   (5 + 6) * 3 = 33