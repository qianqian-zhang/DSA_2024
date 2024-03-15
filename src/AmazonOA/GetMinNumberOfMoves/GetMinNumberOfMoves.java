package AmazonOA.GetMinNumberOfMoves;

public class GetMinNumberOfMoves {

    public int getMinNumMoves(int[] blocks) {
        // write your code here

        //given an array
        //op: swap adjacent elements
        //min op needed to move min to first pos, max to the end

        //get index of min and max
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        int max = Integer.MIN_VALUE;
        int max_index = 0;

        for(int i = 0; i < blocks.length; i++) {
            if(blocks[i] > max) {
                max = blocks[i];
                max_index = i;
            }

            if(blocks[i] < min) {
                min = blocks[i];
                min_index = i;
            }
        }

        int ans = 0;

        ans += min_index;

        //check if max is before min
        //no duplicates
        if(max_index < min_index) {
            max_index++;
        }

        ans += blocks.length - 1 - max_index;

        return ans;
    }

}
