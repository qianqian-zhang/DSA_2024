package AmazonOA.GetPrioritiesAfterExecution;
import java.util.*;
public class GetPriorityAfterExecution {

    public int[] getPrioritiesAfterExecution(int[] priority) {
        // write your code her

        //pick two largest elements with equal value
        //remove one, cut the other in half
        //keep in relative order

        HashMap<Integer, List<Integer>> map = new HashMap<>();
//(value, index of element)
        int n = priority.length;
        for(int i = 0; i < n; i++) {
            map.putIfAbsent(priority[i], new ArrayList<>());

            map.get(priority[i]).add(i);
        }

        while(true) {
            //find max priority
            int max_priority = 0;

            for(int val : map.keySet()) {
                //freq >= 2 and max
                if(map.get(val).size() > 1 && val > max_priority) {
                    max_priority = val;
                }
            }

            if(max_priority == 0) break; //termination condition

            List<Integer> list = map.get(max_priority);

            int process2 = list.get(1);

            //remove INDEX
            list.remove(0);
            list.remove(0);

            if(list.size() == 0) map.remove(max_priority);

            priority[process2] /= 2;
            map.putIfAbsent(priority[process2], new ArrayList<>());

            List<Integer> list2 = map.get(priority[process2]);

            if(list2.size() == 0) {
                list2.add(process2);
            }else{
                int idx = 0;
                //1,3,4
                while(idx < list2.size() && list2.get(idx) < process2) {
                    idx++;
                }

                if(idx == list2.size()) {
                    list2.add(process2);
                }else{
                    list2.add(idx, process2);
                }
            }
        }

        int[] temp = new int[n];
        Arrays.fill(temp, -1);
        int m = 0;
        for(int key : map.keySet()) {
            for(int index : map.get(key)) {
                temp[index] = key;
                m++;
            }
        }

        int[] ans = new int[m];
        int p = 0;

        for(int i = 0; i < n; i++) {
            if(temp[i] != -1) {
                ans[p++] = temp[i];
            }
        }

        return ans;
    }

//  I think you should use a treemap of treesets
// Twitch Recap 2023floofieDough: 🤔
// betsymp: basically, you keep one tree map of tree sets
// betsymp: where map[i] = set of indices with that priority i
// betsymp: and you also keep another tree map of ints
// betsymp: this is the inactive tree map
// betsymp: where inactive[i] = the single element with priority i
// betsymp: (if there was more than 1, it would be in the active tree map of sets instead)
// and you just shuffle these back and forth
// betsymp: all ops are log n
// so for example, at the start of each "move"
// betsymp: you look at the last element in your tree map of sets
// betsymp: these are the indices with the largest priority
// betsymp: you remove the smallest 2 from this set
//and update either the i / 2 priority entry in the active map/inactive map
//    betsymp: this way of doing it makes it so you don't have to resort things
//    betsymp: which would be n log n
//    betsymp: each time you move things around
}
