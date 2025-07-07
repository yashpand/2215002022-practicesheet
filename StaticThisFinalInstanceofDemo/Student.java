package Keyword;

public class Student {


        static String universityName = "National University";
        static int totalStudents = 0;

        private final int rollNumber;
        private String name;
        private String grade;

        public Student(int rollNumber, String name, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
            totalStudents++;
        }

        public static void displayTotalStudents() {
            System.out.println("Total Students: " + totalStudents);
        }

        public void displayDetails() {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }

        public static void main(String[] args) {
            Student s1 = new Student(101, "Sneha", "A");
            Student s2 = new Student(102, "Raj", "B+");

            if (s1 instanceof Student) {
                s1.displayDetails();
            }

            System.out.println();

            if (s2 instanceof Student) {
                s2.displayDetails();
            }

            System.out.println();
            Student.displayTotalStudents();
        }
    }





