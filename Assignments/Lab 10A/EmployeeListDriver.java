import java.time.LocalDate;

public class EmployeeListDriver 
{
    public static void main(String[] args) 
    {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        // Populate EmployeeLinkedList with employee data
        employeeList.insertFirst(10,"Lyndel","Wittey",LocalDate.parse("2022-07-05"),26.69);
        employeeList.insertFirst(9,"Talbot","Borer",LocalDate.parse("2003-09-15"),46.41);
        employeeList.insertFirst(8,"Douglas","Kleeman",LocalDate.parse("2022-02-02"),20.33);
        employeeList.insertFirst(7,"Tanhya","Lob",LocalDate.parse("2021-11-09"),32.33);
        employeeList.insertFirst(6,"Kinny","Lowensohn",LocalDate.parse("2017-07-02"),40.83);
        employeeList.insertFirst(5,"Jake","Kimmins",LocalDate.parse("2018-05-16"),17.25);
        employeeList.insertFirst(4,"Letti","Mudge",LocalDate.parse("2022-01-12"),23.45);
        employeeList.insertFirst(3,"Gilly","Kitteridge",LocalDate.parse("2009-04-14"),33.11);
        employeeList.insertFirst(2,"Sauncho","Nowakowski",LocalDate.parse("2010-04-12"),41.74);
        employeeList.insertFirst(1,"Mikey","Edgerton",LocalDate.parse("2017-10-16"),47.27);

        // Find a specific employee 
        Employee searchResult = employeeList.find(7);

        // Display the values of the search result
        System.out.println("Employee ID: " + searchResult.id);
        System.out.println(" First Name: " + searchResult.firstName);
        System.out.println("  Last Name: " + searchResult.lastName);
        System.out.println("  Birthdate: " + searchResult.birthDate);
        System.out.println("   Pay Rate: $" + searchResult.payRate);
    }
}
