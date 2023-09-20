
package com.mycompany.mavenproject10;
      
import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.SourceVersion;

abstract class Car {
    protected String reg_no;
    protected String model;
    protected String reg_date;

    public Car(String reg_no, String model, String reg_date) {
        this.reg_no = reg_no;
        this.model = model;
        this.reg_date = reg_date;
    }

    public abstract void displayDetails();
}

class TransportVehicle extends Car {
    private String validity_no;
    private String start_date;
    private String period;

    public TransportVehicle(String reg_no, String model, String reg_date, String validity_no, String start_date, String period) {
        super(reg_no, model, reg_date);
        this.validity_no = validity_no;
        this.start_date = start_date;
        this.period = period;
    }

    @Override
    public void displayDetails() {
        System.out.println("Transport Vehicle Details:");
        System.out.println("Registration No: " + reg_no);
        System.out.println("Model: " + model);
        System.out.println("Validity No: " + validity_no);
        System.out.println("Start Date: " + start_date);
        System.out.println("Period: " + period);
    }
}

class PrivateVehicle extends Car {
    private String owner_name;
    private String owner_address;

    public PrivateVehicle(String reg_no, String model, String reg_date, String owner_name, String owner_address) {
        super(reg_no, model, reg_date);
        this.owner_name = owner_name;
        this.owner_address = owner_address;
    }

    @Override
    public void displayDetails() {
        System.out.println("Private Vehicle Details:");
        System.out.println("Registration No: " + reg_no);
        System.out.println("Model: " + model);
        System.out.println("Owner Name: " + owner_name);
        System.out.println("Owner Address: " + owner_address);
    }
}

public class Mavenproject10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        System.out.print("Enter the number of objects to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter 'T' for Transport Vehicle or 'P' for Private Vehicle: ");
            String choice = scanner.nextLine();
            System.out.print("Enter registration number: ");
            String reg_no = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter registration date: ");
            String reg_date = scanner.nextLine();

            if (choice.equalsIgnoreCase("T")) {
                System.out.print("Enter validity number: ");
                String validity_no = scanner.nextLine();
                System.out.print("Enter start date: ");
                String start_date = scanner.nextLine();
                System.out.print("Enter period: ");
                String period = scanner.nextLine();
                cars.add(new TransportVehicle(reg_no, model, reg_date, validity_no, start_date, period));
            } else if (choice.equalsIgnoreCase("P")) {
                System.out.print("Enter owner name: ");
                String owner_name = scanner.nextLine();
                System.out.print("Enter owner address: ");
                String owner_address = scanner.nextLine();
                cars.add(new PrivateVehicle(reg_no, model, reg_date, owner_name, owner_address));
            } else {
                System.out.println("Invalid choice. Skipping this object.");
            }
        }

        System.out.println("\nPrivate Vehicles:");
        for (Car car : cars) {
            if (car instanceof PrivateVehicle) {
                car.displayDetails();
            }
        }

        System.out.println("\nTransport Vehicles:");
        for (Car car : cars) {
            if (car instanceof TransportVehicle) {
                car.displayDetails();
            }
        }

        scanner.close();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}


package com.mycompany.Mavenproject10;

interface CreditCardInterface {
    void viewCreditAmount();
    void viewPin();
    void changePin(int newPin);
    void payBalance(double amount);
}

// Implement the interface in the Customer class
class Customer implements CreditCardInterface {
    private String name;
    private long cardNumber;
    private int pin;
    private double creditAmount;

    public Customer(String name, long cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditAmount = 0.0;
    }

    @Override
    public void viewCreditAmount() {
        System.out.println("Credit Amount for " + name + ": $" + creditAmount);
    }

    @Override
    public void viewPin() {
        System.out.println("PIN for " + name + ": " + pin);
    }

    @Override
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully for " + name);
    }

    @Override
    public void payBalance(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (amount > creditAmount) {
            System.out.println("Payment amount exceeds the credit balance.");
        } else {
            creditAmount -= amount;
            System.out.println("Payment of $" + amount + " made by " + name);
        }
    }
}

public class Mavenproject10{
    public static void main(String[] args) {
        // Create an array of customer objects
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Alice", 1234567890123456L, 1234);
        customers[1] = new Customer("Bob", 9876543210987654L, 5678);
        customers[2] = new Customer("Charlie", 4567890123456789L, 4321);

        // Perform actions on customer objects
        for (Customer customer : customers) {
            customer.viewCreditAmount();
            customer.viewPin();
            customer.payBalance(50.0);
            customer.changePin(5678);
            System.out.println();
        }
    }
}

