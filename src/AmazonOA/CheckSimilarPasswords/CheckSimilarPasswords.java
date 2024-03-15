package AmazonOA.CheckSimilarPasswords;

public class CheckSimilarPasswords {


    public String[] checkSimilarPasswords(String[] newPasswords, String[] oldPasswords) {

        //[ac]b[ab] new --> bd bc
        //abdbc old

        //take out chars from new password
        //map it to next cyclic char
        //new chars are a subsequnce of oldpassword

        //subsequence length [1, n]

        int n = newPasswords.length;
        String[] ans = new String[n];
        //char hashing
        for (int i = 0; i < n; i++) {
            String newPassword = newPasswords[i];
            String oldPassword = oldPasswords[i];

            int[] newHash = getHash(newPassword);
            int[] oldHash = getHash(oldPassword);

            int p = 0; //old
            for (int j = 0; j < newHash.length; j++) {
                int index = newHash[j];
                int index_incremented = index == 25 ? 0 : index + 1;

                if (oldHash[p] == index || oldHash[p] == index_incremented) {
                    p++;
                }

                if(p == oldHash.length) break;
            }

            if (p == oldHash.length) {
                ans[i] = "YES";
            } else {
                ans[i] = "NO";


            }


        }


        return ans;
    }



    public int[] getHash (String s){
        int n = s.length();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            int index = c - 'a';

            arr[i] = index;
        }
        return arr;

    }
}