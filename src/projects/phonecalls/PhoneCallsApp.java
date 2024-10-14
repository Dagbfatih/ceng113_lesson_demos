package projects.phonecalls;

/*
The Given Problem:
The monthly telephone bills are calculated as follows: Each customer must pay 9.2 YTL as
the constant fee. If the cost of the telephone calls the customer made in that month does not
exceed that amount, the customer only pays that constant fee. However, if the customer
makes too many calls, and the cost exceeds that amount, he/she pays the cost of his/her
calls. The cost for one-minute of in-town calls is 0.25 YTL, of out-town calls is 0.35 YTL.
Given the durations for the in-town and out-town calls of a customer, calculate the bill he/she
has to pay.
*/

import abstracts.DemoApp;

public class PhoneCallsApp extends DemoApp {

    public PhoneCallsApp() {
        super("Phone Calls Application");
    }

    @Override
    protected void program() {
        final double IN_TOWN_UNIT_FEE = 0.25;
        final double OUT_TOWN_UNIT_FEE = 0.25;

        final double constFee = 9.2;

        System.out.print("Enter the minutes of your calls made in town: ");
        double durationOfInTownInMinutes = scanner.nextDouble();
        System.out.print("Enter the minutes of your calls made out town: ");
        double durationOfOutTownInMinutes = scanner.nextDouble();
        double totalCost = constFee;

        double costOfPhoneCalls = durationOfInTownInMinutes * IN_TOWN_UNIT_FEE
                + durationOfOutTownInMinutes * OUT_TOWN_UNIT_FEE;


        System.out.printf("In town cost --> %.0f mins X %.2f YTL = %.2f\n",
                durationOfInTownInMinutes,
                IN_TOWN_UNIT_FEE,
                durationOfInTownInMinutes * IN_TOWN_UNIT_FEE);

        System.out.printf("Out town cost --> %.0f mins X %.2f YTL = %.2f\n",
                durationOfOutTownInMinutes,
                OUT_TOWN_UNIT_FEE,
                durationOfOutTownInMinutes * OUT_TOWN_UNIT_FEE);

        if (costOfPhoneCalls > constFee) {
            totalCost = costOfPhoneCalls + constFee;

            System.out.printf("Cost of phone calls is %.2f + %.2f = %.2f\n",
                    durationOfInTownInMinutes * IN_TOWN_UNIT_FEE,
                    durationOfOutTownInMinutes * OUT_TOWN_UNIT_FEE,
                    costOfPhoneCalls);
        } else {
            System.out.println("Cost of phone calls is less than "
                    + constFee
                    + ". Due to fee schedule it will not be calculated.");
        }

        System.out.println("The bill makes totally " + totalCost + " YTL (The constant fee was " + constFee + ")");
    }
}
