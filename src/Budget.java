package project1;

public class Budget {
    public static void main(String[] args) {

        // Items:
        int monthlyRent = 625;
        int monthlyInternetService = 27;
        int monthlyGrocery = 250;
        int monthlyFunAllowance = 150;
        int hrlywage = 10;

        // Information of items:
        System.out.println("The hourly wage is " + hrlywage + " dollars.");
        System.out.println("The monthly rent is " + monthlyRent + " dollars.");
        System.out.println("The monthly internet service is " + monthlyInternetService + " dollars.");
        System.out.println("The monthly grocery expense is " + monthlyGrocery + " dollars.");
        System.out.println("The monthly fun allowance is " + monthlyFunAllowance + " dollars.");

        // Calculation:
        double combinedExpenses = (monthlyRent + monthlyInternetService + monthlyGrocery + monthlyFunAllowance);
        double hoursStudentNeedsToWork = (combinedExpenses / hrlywage);

        // Print information of calculations:
        System.out.println("The total monthly expenses are " + combinedExpenses + " dollars.");
        System.out.println(
                "The total hours the student needs to work to break even is " + hoursStudentNeedsToWork + " hours.");

        // More calculations (Save $100 a month):
        double extraHours = 10;
        double totalHours = hoursStudentNeedsToWork + extraHours;

        // Print total hours
        System.out.println(
                "The total hours the student will have to work to include an additional savings of $100 per month after paying all expenses are "
                        + totalHours + " hours.");

    }
}
