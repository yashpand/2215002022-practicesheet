package Keyword;

public class Patient {



        static String hospitalName = "Sunrise Hospital";
        static int totalPatients = 0;

        private final int patientID;
        private String name;
        private int age;
        private String ailment;

        public Patient(int patientID, String name, int age, String ailment) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            totalPatients++;
        }

        public static void getTotalPatients() {
            System.out.println("Total Patients: " + totalPatients);
        }

        public void displayDetails() {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }

        public static void main(String[] args) {
            Patient p1 = new Patient(301, "Arjun", 45, "Fever");
            Patient p2 = new Patient(302, "Maya", 29, "Cough");

            if (p1 instanceof Patient) {
                p1.displayDetails();
            }

            System.out.println();

            if (p2 instanceof Patient) {
                p2.displayDetails();
            }

            System.out.println();
            getTotalPatients();
        }
    }



