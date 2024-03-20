package AmazonOA.CountFaults;

import java.util.HashMap;

public class CountFaults {

    public int countFaults (int n, String[] logs) {
        //int put is string array logs
        //for each String log: server name + status
        //"s1 error"  "s2 success"
        //for a server id, 3 consecutive errors will be replaced with a new one,
        //count how many times will be replaced

        //o(n)
        HashMap<String, Integer> map = new HashMap<>();
        //id, number of times failed
        //fail + 1
        //sucess reset to 0
        int count = 0;
        for(String log : logs) {
            String[] arr = log.split(" ");
            String id = arr[0];
            String status = arr[1];

            map.putIfAbsent(id, 0);

            if(status.equals("error")) {
                map.put(id, map.get(id) + 1);
            }else{
                map.put(id, 0);
            }

            if(map.get(id) == 3) count++;
        }

        return count;
    }

}


//    Implement a prototype service to automate the detection and replacement of faulty servers to improve the availabity of an application.
//
//        There are n servers with its s1, s2,...,sn, and an array of strings, logs, of size m. Log format is "<server_id> <success/error>", the id of the server and the status of the processed request. If a perticular server id logs an error for three consecutive requests, it is considered faulty and is replaced with a new server with the same id.
//
//        Given n and a the array logs, find the number of times a faulty server was replace.
//
//        Function Description
//
//        Complete the function countFaults in the editor 👉.
//
//        countFaults has the following parameter:
//
//        int n: the number of servers
//        String logs[m]: the application logs
//        Returns
//
//        int: the number of times servers were replaced
//
//        Example 1:
//
//        Input:  n = 2, logs = ["s1 error", "s1 error", "s2 error", "s1 error", "s1 error", "s2 success"]
//        Output: 1