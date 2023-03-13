import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String department = new String();
        System.out.println("Enter the choice : \n" +
                "1. Technical\n" +
                "2. Admin\n" +
                "3. Human Resource\n" +
                "4. Legal\n");
        int choice = sc.nextInt();
        switch (choice){
            case 1 : department = "tech";
                    break;
            case 2 : department = "admin";
                    break;
            case 3 : department = "HR";
                    break;
            case 4 : department = "legal";
                    break;
        }
        Employee employee = new Employee();
        System.out.println("Enter firstname");
        employee.setFirstname(sc.next());
        System.out.println("Enter lastname");
        employee.setLastname(sc.next());
        CredentialService generate = new CredentialService();
        generate.showCredentials(employee.getFirstname(), employee.getLastname(), department);
    }
}

/*

PROBLEM STATEMENT :


You are an IT Support Administrator and are charged with the task of creating credentials for
new hires
Your application should do the following:
a) Generate an email with the following syntax
firstNamelastName@department.company.com
b) Determine the department (Technical, Admin, Human Resource, Legal)
c) Generate a random password which will contain (number, capital letter, small letter &
special character)
d) Display the generated credentials
e) Use parameterized constructor of class Employee, to pass firstName, lastName.
f) Create a separate CredentialService which will have generatePassword,
generateEmailAddress, & showCredentials method.
 */