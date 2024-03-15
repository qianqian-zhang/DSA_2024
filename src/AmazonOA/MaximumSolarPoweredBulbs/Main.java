package AmazonOA.MaximumSolarPoweredBulbs;

public class Main {
    public static void main(String[] args) {
        MaxSolarBulbs solution = new MaxSolarBulbs();

        System.out.println(solution.maximizeSolarPoweredBulbs2("00000010000000111000"));//11
        System.out.println(solution.maximizeSolarPoweredBulbs2("00100011000001110"));//10

        System.out.println(solution.maximizeSolarPoweredBulbs2("001"));
    }
}


//"[0]0110[0]0[0]010[0]0[0]"
//[0]0[0]0[0]01
// leading
//2 - 1
//3 - 1
//4 - 2
//5 - 2
//6 - 3