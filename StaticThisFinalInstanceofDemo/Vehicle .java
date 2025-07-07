package Keyword;

public class Vehicle {

        static double registrationFee = 1500.0;

        private final String registrationNumber;
        private String ownerName;
        private String vehicleType;

        public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }

        public void displayDetails() {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }

        public static void main(String[] args) {
            Vehicle v1 = new Vehicle("MH12AB1234", "Anil", "Car");
            Vehicle v2 = new Vehicle("MH14XY5678", "Pooja", "Bike");

            updateRegistrationFee(1800.0);

            if (v1 instanceof Vehicle) {
                v1.displayDetails();
            }

            System.out.println();

            if (v2 instanceof Vehicle) {
                v2.displayDetails();
            }
        }
    }


