

//1.Students aatendance mark
package com.mycompany.javaapplication3;

import java.util.Scanner;
import static javax.management.Query.and;

public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        String regNumber = scanner.nextLine();

        System.out.print("Enter total number of working days in the semester: ");
        int totalWorkingDays = scanner.nextInt();

        System.out.print("Enter number of days present: ");
        int daysPresent = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = (double) daysPresent / totalWorkingDays * 100;

        // Award attendance mark based on attendance percentage
        int attendanceMark;
        if (attendancePercentage >= 90) {
            attendanceMark = 5;
        } 
        else if (attendancePercentage >= 80&& attendancePercentage<90)
        {
            attendanceMark = 4;
        } 
        else if (attendancePercentage >= 75&& attendancePercentage<80) {
            attendanceMark = 3;
        } 
        else {
            attendanceMark = 0;
        }

        // Print the result
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Attendance Mark: " + attendanceMark);
    }
}

//2.book details
package com.mycompany.javaapplication3;

import java.util.Scanner;

public class Javaapplication3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        String bookName;
        String author;
        double price;
        int qty = 0;
        String email;
        char gender;
        float total;
        // Prompt the user to enter the book details
        System.out.print("Enter the book name: ");
        bookName = input.nextLine();

        System.out.print("Enter the author name: ");
        author = input.nextLine();

        System.out.print("Enter the price: ");
        price = input.nextDouble();

        System.out.print("Enter the quantity: ");
        qty = input.nextInt();

        input.nextLine(); // Consume the newline character

        System.out.print("Enter your email: ");
        email = input.nextLine();

        System.out.print("Enter your gender (M/F): ");
        gender = input.next().charAt(0);
        //calculate the total
        total=(float) (price*qty);
        // Display the entered values
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("total:" +total);

        input.close();
    }
}
