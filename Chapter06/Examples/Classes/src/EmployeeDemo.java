import java.util.Scanner;

/**
 * Created by nicholson on 5/24/2017.
 */
public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee("John Smith", 111, "Finance", "CFO");
        Employee emp2 = new Employee("Susan Meyers", 47899, "Accounting", "VP" );
        Employee emp3 = new Employee(input.nextLine(), input.nextInt(), input.nextLine(),input.nextLine());

        System.out.println(emp2.getName());

        emp2.setName("TAFKAP");

        System.out.println(emp2.getName());

      




    }
}
