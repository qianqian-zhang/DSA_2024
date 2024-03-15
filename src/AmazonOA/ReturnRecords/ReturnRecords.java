package AmazonOA.ReturnRecords;

import java.util.HashMap;
import java.util.HashSet;

public class ReturnRecords {

    public String[] returnRecords(String[] attempts) {
        // write your code here

        //ood
        final String success = "Successfully";
        final String fail = "Unsuccessfully";

        final String register = "Registered";
        final String login = "Logged In";
        final String logout = "Logged Out";

        HashSet<String> loggedIn = new HashSet<>(); //currently logged in users

        HashMap<String, String> data = new HashMap<>(); //all users and their password

        int n = attempts.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++) {
            String[] attempt = attempts[i].split(" ");
            String op = attempt[0];
            String username = attempt[1];
            String password = "";
            if(attempt.length > 2) password = attempt[2];

            String res = new String();

            if(op.equals("register")) {
                if(loggedIn.contains(username)) {
                    res = register + " " + fail;
                }else{
                    //new user register
                    data.put(username, password);
                    res = register + " " + success;
                }
            }else if(op.equals("login")) {
                //new user log in
                if(!data.containsKey(username) || !data.get(username).equals(password) || loggedIn.contains(username)) {
                    res = login + " " + fail;
                }else{
                    loggedIn.add(username);
                    res = login + " " + success;
                }

                //old use log in
                //password wrong
                //is already logged in
            }else{
                //logout
                //unknow username
                //old user but already logged out

                if(!data.containsKey(username) || !loggedIn.contains(username)) {
                    res = logout + " " + fail;
                }else{
                    loggedIn.remove(username);
                    res = logout + " " + success;
                }
            }

            ans[i] = res;
        }

        return ans;


    }

}
