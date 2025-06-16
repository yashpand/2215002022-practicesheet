import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.printf("Distance in yards: %.2f yards\n", distanceInYards);
        System.out.printf("Distance in miles: %.4f miles\n", distanceInMiles);

        scanner.close();
    }
}
