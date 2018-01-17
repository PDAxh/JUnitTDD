package TDDLessons.Lesson2;

import java.util.Scanner;

public class Bank {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public void createCustomer() {

        Customer customer = new Customer();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        customer.setName(name);
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        customer.setAge(age);
        System.out.println("enter SSN, 10 digits ");
        int ssn = scanner.nextInt();
        customer.setSsn(ssn);

    }


}
