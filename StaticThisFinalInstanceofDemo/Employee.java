package Keyword;

public class Employee {

    static String companyName ="ABC Company";
    static  int totalEmployees =0;

    private final int id ;
    private String name;
    private String designation;


    public Employee(int id, String name,String designation){
        this.id= id;
        this.name= name;
        this.designation=designation;
        totalEmployees++;
    }

    public static  int displayTotalEmployees(){
        return totalEmployees;
    }

    public void displayDetails(){
        System.out.println("companyName : "+companyName);
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Designation : "+designation);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Sneha Gupta", "Software Engineer");
        Employee emp2 = new Employee(102, "Rohan Mehta", "Project Manager");



        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        System.out.println();


        Employee.displayTotalEmployees();




    }





}
