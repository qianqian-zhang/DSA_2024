package MaximumSolarPoweredBulbs;

public class MaxSolarBulbs {

//    public int maximizeSolarPoweredBulbs(String bulbs) {
//        int ans = 0;
//        int cur = 0;
//
//        //check leading 0s
//        int idx = 0;
//
//        while(bulbs.charAt(idx) == '0') {
//            idx++;
//        }
//
//        if(idx > 1) ans += idx / 3 + 1;
//
//        for(int i = idx; i < bulbs.length(); i++) {
//            char c = bulbs.charAt(i);
//
//            if(c == '1') {
//                ans += (cur + 1) / 3;
//                cur = 0;
//            }else{
//                cur++;
//            }
//        }
//        //check tail
//        if(cur > 1) ans += cur / 3 + 1;
//
//        return ans;
//
//
//    }
    public int maximizeSolarPoweredBulbs2(String bulbs) {
        //given a binary string
        //replace 0 with 1
        //can only replae 0 with 1 if on replacement , the new 1 is not adjacent to other 1s
        //try to flip maximum number of 0s to 1s
        //return total number of 1s

        bulbs = "0" + bulbs + "0";
        int conseqElectric = 0;
        int solarCount = 0;
        for (int i = 0; i < bulbs.length(); i++) {
            if (bulbs.charAt(i) == '0') {
                conseqElectric++;
            } else {
                solarCount++;
                // The first replacement bulb must leave a gap of 1 bulb
                // at the beginning of this sequence of electric bulbs (conseqElectric - 1).
                // After that, every 2nd bulb can be replaced with a solar bulb.
                solarCount += (conseqElectric - 1) / 2;
                conseqElectric = 0;
            }
        }
        solarCount += (conseqElectric - 1) / 2;
        return solarCount;
    }
//between two 1s 00000   n / 3

//start of array
//001 1
//0001 1
//00001 2
//000001 2
//0000001 3

//000 1
//0000 1
//00000 2
//010100 2

//1000

}

