public class payrollCalculator {
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate){
        if (hoursWorked < 0 || hourlyRate <0){
            System.out.println("Invalid input. please enter a positive numeric value");
        }
        switch (employeeType){
            case "FULL_TIME":
                if (hoursWorked < 40){
                    return (hoursWorked * hourlyRate);
                } else {
                    double overtime = hoursWorked - 40;
                    return (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
                }

            case "PART_TIME":
                if (hoursWorked > 25){
                    System.out.println("Maximum working hours is 25. No overtime allowed");
                    hoursWorked = 25;
                } else {
                    return hoursWorked * hourlyRate;
                }

            case "CONTRACTOR":
                return hourlyRate * hoursWorked;

            case "INTERN":
                if (hoursWorked > 20){
                    System.out.println("Maximum working hours is 20. No overtime allowed");
                    hoursWorked = 20;
                } else {
                    return ((0.8 * hourlyRate) * hoursWorked);
                }
            default:
                System.out.println("Invalid input. Please provide a valid employee type");
                return 0;
        }
    }
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double tax;

        if (grossPay <= 500) {
            tax = grossPay * 0.10;
        } else if (grossPay <= 1000) {
            tax = grossPay * 0.15;
        } else if (grossPay <= 2000) {
            tax = grossPay * 0.20;
        } else {
            tax = grossPay * 0.25;
        }

        if (hasHealthInsurance) {
            tax -= 50;
            if (tax < 0) tax = 0; // Prevent negative tax
        }

        return tax;
    }
    public static void processPayroll (String[] employeeTypes, double[] hours, double[] rates, String[] names){

        double max = -1;
        int n=0;
        int maxId = 0, minId = 0, overtimeCount = 0;
        double total = 0;
        double min = calculateWeeklyPay(employeeTypes[0], hours[0], rates[0]);

        for (int i=0; i<5;i++){
            n++;
            double pay = calculateWeeklyPay(employeeTypes[i], hours[i],rates[i]);
            System.out.println(names[i]+" has a weekly pay of  :  " + pay);
            total += pay;

            if (pay > max){
                max = pay;
                maxId = i;
            }
            if (pay < min){
                min = pay;
                minId = i;
            }
            if (hours[i] > 40){
                overtimeCount++;
            }

        }
        System.out.println("\n --------- Payout Summary --------\n");
        System.out.println("Highest paid      :" + names[maxId]);
        System.out.println("Lowest paid       :" + names[minId]);
        System.out.println("Average pay       :" + total/n );
        System.out.println("Overtime Worker   :" + overtimeCount);
    }
    public static void main(String[] args){
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        processPayroll(types, hours, rates, names);
    }
}
