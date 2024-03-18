package AmazonOA.DroppedRequests;

import java.util.List;
import java.util.Objects;

public class DroppedRequests {

    public int droppedRequests(List<Integer> requestTime) {
        int n  = requestTime.size();
        int count = 0;

        for(int i = 0; i < n; i++) {
            //if else to not recount requests that violate more than 1 regulations
            //start to i
            //requests = i - start + 1;

            //check 1 second rule, at most 3 requests
            if(i >= 3 && Objects.equals(requestTime.get(i - 3), requestTime.get(i))) {
                count++;
            }else if(i >= 20 && requestTime.get(i) - requestTime.get(i - 20) <= 9){
                //check 10 second rule
                //i - 19, i: 20 requests
                //1 to 10
                count++;
            }else if(i >= 60 && requestTime.get(i) - requestTime.get(i - 60) <= 59){
                //check 1 min rule
                count++;
            }

        }

        return count;
    }

}
