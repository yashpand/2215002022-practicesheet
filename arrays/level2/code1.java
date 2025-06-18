package level2;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;
        double[][] empData = new double[EMPLOYEE_COUNT][2]; // 
        double[][] resultData = new double[EMPLOYEE_COUNT][2]; 
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee #" + (i + 1));
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years >= 0. Please re-enter.");
                i--;
                continue;
            }
            empData[i][0] = salary;
            empData[i][1] = years;
        }

   
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            resultData[i][0] = bonus;
            resultData[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

     
        System.out.println("\nEmployee\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t\t%.2f\n",
                    (i + 1), empData[i][0], empData[i][1], resultData[i][0], resultData[i][1]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}