package Array;
import java.util.Scanner;
public class BusyPerson {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of messages
            int initialCharge = sc.nextInt(); // Initial phone charge
            int consumptionPerUnit = sc.nextInt(); // Charge consumption per unit of time
            int consumptionTurnOffOn = sc.nextInt(); // Consumption when turned off and on sequentially

            int[] moments = new int[n];
            for (int i = 0; i < n; i++) {
                moments[i] = sc.nextInt();
            }

            String result = solve(n, initialCharge, consumptionPerUnit, consumptionTurnOffOn, moments);
            System.out.println(result);
        }
    }

    private static String solve(int n, int initialCharge, int consumptionPerUnit, int consumptionTurnOffOn, int[] moments) {
        int remainingCharge = initialCharge;

        for (int i = 0; i < n; i++) {
            int moment = moments[i];

            int chargeNeeded = i == n - 1 ? moment * consumptionPerUnit : (moment - moments[i + 1]) * consumptionPerUnit;
            chargeNeeded = Math.min(chargeNeeded, remainingCharge);

            remainingCharge -= chargeNeeded;

            if (remainingCharge <= 0) {
                return "NO";
            }

            remainingCharge -= consumptionTurnOffOn;
            remainingCharge = Math.max(remainingCharge, 0);
        }

        return "YES";
    }
}
