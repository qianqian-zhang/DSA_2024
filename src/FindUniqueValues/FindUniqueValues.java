package FindUniqueValues;
import java.util.*;
public class FindUniqueValues {

        public int findUniqueValues(int[] experience) {
            // write your code here
            Arrays.sort(experience);
            int n = experience.length;

            int left = 0;
            int right = n - 1;
            HashSet<Double> set = new HashSet<>();
            while(left < right) {
                int n1 = experience[left];
                int n2 = experience[right];

                double avg = (0.0 + n1 + n2) / 2;

                set.add(avg);


                left++;
                right--;
            }

            return set.size();
        }


}
