package AmazonOA.GetAverageStanding;

import java.util.HashMap;
import java.util.PriorityQueue;

public class GetAverageStanding {

    public int[][] getAverageStanding(int d, int[][] records) {
        // [race id, player's id, player's time].
        //players [0, d - 1]
        //If two players have the same finish time, the one with a lower id is ranked lower.

        int[][] ans = new int[d][2];

        //for every race, store players info in pq
        HashMap<Integer, PriorityQueue<int[]>> map = new HashMap<>();
        //key: race id
        //value:  List<int[]> players
        //int[] = {player_id, player_time}

        //*******get postion of each player in each race
        for(int[] record : records) {
            int race_id = record[0];
            int player_id = record[1];
            int time = record[2];

//fill out q value, numbe of games player has participated in
            ans[player_id][1]++;

            if(!map.containsKey(race_id)) {
                PriorityQueue<int[]> players = new PriorityQueue<>((a, b) -> {
                    if(a[1] == b[1]) {
                        return b[0] - a[0];
                    }else{
                        return a[1] - b[1];
                    }
                });
                players.offer(new int[]{player_id, time});
                map.put(race_id, players);
            }else{
                map.get(race_id).offer(new int[]{player_id, time});
            }
        }


        //iterate every game
        for(int race : map.keySet()) {
            PriorityQueue<int[]> pq = map.get(race);

            //get positio of each playre

            int position = 1;

            while(!pq.isEmpty()) {
                int[] info = pq.poll();

                int id = info[0];
                ans[id][0] += position; //accumulate player's position
                position++;
            }

        }

//for players that have not participated in any games [-1, -1]

        for(int[]player : ans) {
            int p = player[0];
            int q = player[1];
        //The average standing: average of positions of races
            //p sould be sum of position
            //q should be number of races
            if(q == 0) {
                player[0] = -1;
                player[1] = -1;
            }else{
                //streamline the fraction p / q
                int gcd = findGCD(p, q);

                player[0] /= gcd;
                player[1] /= gcd;
            }
        }

        return ans;
    }

    public int findGCD(int p, int q) {
        //find greatest common divisor of p and q
        if(p == 0) return q;

        return findGCD(q % p, p);
    }

}
