package MaxGrayness;

public class MaxGrayness {

    public int getMaxGrayness(String[] pixels) {
        // write your code here

        int m = pixels.length;
        int n = pixels[0].length();

        int[] row_black = new int[m];
        int[] col_black = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                char c = pixels[i].charAt(j);

                if(c == '1') {
                    row_black[i]++;
                    col_black[j]++;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int black = row_black[i] + col_black[j];
                int white = n - row_black[i] + m - col_black[j];

                ans = Math.max(ans, Math.abs(black - white));
            }
        }

        return ans;
    }

}
