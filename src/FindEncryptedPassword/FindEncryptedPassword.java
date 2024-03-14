package FindEncryptedPassword;

public class FindEncryptedPassword {

    public String findEncryptedPassword(String password) {
        // write your code here
        //given a palindrome
        //rearrange the string
        //it is also a palindrome, lexcographically smallest

        //store frequency of each char
        int[] freq = new int[26];
        int n = password.length();
        for(int i = 0; i < n; i++) {
            freq[password.charAt(i) - 'a']++;
        }

        //put smaller chars first
        StringBuilder sb = new StringBuilder();
        //aab b baa
        char single = 'a';
        boolean hasSingle = false;
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                char c = (char)(i + 'a');
                if(freq[i] % 2 == 1) {
                    hasSingle = true;
                    single = c;
                }

                //append half of chars
                for(int j = 0; j < freq[i] / 2; j++) {
                    sb.append(c);
                }
            }
        }

        String firstHalf = sb.toString();
        String secondHalf = sb.reverse().toString();

        if(hasSingle) {
            firstHalf += single;
        }

        return firstHalf + secondHalf;
    }

}
