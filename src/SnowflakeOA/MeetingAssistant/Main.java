package SnowflakeOA.MeetingAssistant;

public class Main {
    public static void main(String[] args) {
        MeetingAssistant solution = new MeetingAssistant();
        System.out.println(solution.getEarliestMeetTime(new String[]{"Alex sleep 00:00 08:00", "Sam sleep 07:00 13:00", "Alex lunch 12:30 13:59"}, 60));
        System.out.println(solution.getEarliestMeetTime(new String[]{"sam sleep 12:00 23:59", "alex sleep 00:00 13:00"}, 1));
        System.out.println(solution.getEarliestMeetTime(new String[]{"sam sleep 12:00 18:59", "alex gaming 00:00 11:00"}, 60));

    }
}
//    Implement a simple meeting assistant. A list of strings, events[n], in the form "<person_name> <action> <start> <end>" is provided where person_name performs action from start to end, both inclusive. Times are formatted HH:MM. Find the earliest time in the day, from "00:00" to "23:59", when all people mentioned in at least one event are available for a meeting of k minutes. Report the answer as "HH:MM" or the string "-1" if it is not possible.
//
//        Function Description
//
//        Complete the function getEarliestMeetTime in the editor below.
//
//        getEarliestMeetTime takes the following arguments:
//
//        1. String events[n]: event descriptors
//        2. int k: meeting duration
//        Returns
//
//        string: the earliest time for the meeting or "-1" if it is not possible
//
//        Example 1:
//
//        Input:  events = ["Alex sleep 00:00 08:00", "Sam sleep 07:00 13:00", "Alex lunch 12:30 13:59"], k = 60
//        Output: "14:00"
//        Explanation:
//
//        Alex is not available until 8:00. After that, Sam is not available until 13:00. Then Alex is busy until 13:59.
//
//        Return the earliest time they are both available, "14:00".
//
//
//        Example 2:
//
//        Input:  events = ["sam sleep 12:00 23:59", "alex sleep 00:00 13:00"], k = 1
//        Output: "-1"
//        Explanation:
//
//        There is no time when both are free. 😞
//
//        Example 3:
//
//        Input:  events = ["sam sleep 12:00 18:59", "alex gaming 00:00 11:00"], k = 60
//        Output: "19:00"
//        Explanation:
//
//        Alex plays games from 00:00 until 11:00. If the meeting starts at 11:01, it ends at 12:01. Sam is asleep from 12:00 to 18:59.
//