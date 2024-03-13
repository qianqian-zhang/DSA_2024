package FindMinPages;

public class FindMinPages {

    public int findMinimumPagesPerDay(int[] pages, int days) {
        // binary search on answer

        //n chapters
        //everyday, maximum read x pages
        //every day only one chapter (even if x > pages[i])
        //have to finish in days
        //return minimum page limit

        int n = pages.length;

        if(days < n) return -1;

        int max_pages = 0;

        for(int i = 0; i < n; i++) {
            if(pages[i] > max_pages) {
                max_pages = pages[i];
            }
        }

        //x range [1, max_pages]
        int left = 1;
        int right = max_pages;
        //find smallest element that meets condition, close from right
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(canFinish(pages, mid, days)) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        if(canFinish(pages, right, days)) return right;

        return -1;

    }

    public boolean canFinish(int[] pages, int limit, int days) {
        //calculate days needed to finish with daily limit
        int needed = 0;
        //page 5 l 6
        for(int page : pages) {
//            if(page % limit == 0) {
//                needed += page / limit;
//            }else{
//                needed += page / limit + 1;
//            }

            needed += (page - 1) / limit + 1;

        }


        return needed <= days;
    }

}
