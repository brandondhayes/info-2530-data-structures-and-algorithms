import java.time.LocalDate;

public class EmployeeLinkedList 
{
    private Employee first;

    public EmployeeLinkedList()
    {
        first = null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(int a, String b, String c, LocalDate d, double e)
    {
        Employee newEmployee = new Employee(a, b, c, d, e);
        newEmployee.next = first;
        first = newEmployee;
    }

    public Employee deleteFirst()
    {
        Employee temp = first;
        first = first.next;
        return temp;
    }

    public Employee find(int query)
    {
        Employee current = first;

        while (current.id != query)
        {
            if (current.next == null)   // Reached end, stop search
                return null;
            else
                current = current.next; // go to next link
        }

        // Found a match, return a copy of it
        return new Employee(current);
    }

}
