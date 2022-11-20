import java.time.LocalDate;

public class Employee
{
    public int id;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public double payRate;

    public Employee next;

    public Employee(int a, String b, String c, LocalDate d, double e)
    {
        id = a;
        firstName = b;
        lastName = c;
        birthDate = d;
        payRate = e;
    }

    // Copy constructor
    Employee(Employee employee)
    {
        
        id = employee.id;
        firstName = employee.firstName;
        lastName = employee.lastName;
        birthDate = employee.birthDate;
        payRate = employee.payRate;
    }
}