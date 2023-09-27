
    
package employee_data;

class Employee {
    String emp_name;
    int emp_id;
    String category; // "male" or "female"
    String address;
    String mail_id;
    String mobile_no;
    double basicPay;

    Employee(String emp_name, int emp_id, String category, String address, String mail_id, String mobile_no, double basicPay) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.category = category;
        this.address = address;
        this.mail_id = mail_id;
        this.mobile_no = mobile_no;
        this.basicPay = basicPay;
    }

    double calculateDA() {
        return 0.97 * basicPay;
    }

    double calculateHRA() {
        return 0.10 * basicPay;
    }

    double calculatePF() {
        return 0.12 * basicPay;
    }

    double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    double calculateGrossSalary() {
        return calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund() + basicPay;
    }

    double calculateIncomeTax() {
        double grossSalary = calculateGrossSalary();
        if (category.equalsIgnoreCase("male")) {
            if (grossSalary <= 190000) {
                return 0;
            } else if (grossSalary <= 200000) {
                return 0.10 * (grossSalary - 190000);
            } else if (grossSalary <= 500000) {
                return 0.20 * (grossSalary - 200000);
            } else {
                return 0.25 * (grossSalary - 500000);
            }
        } else if (category.equalsIgnoreCase("female")) {
            if (grossSalary <= 190000) {
                return 0;
            } else if (grossSalary <= 500000) {
                return 0.10 * (grossSalary - 190000);
            } else {
                return 0.20 * (grossSalary - 500000);
            }
        }
        return 0;
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculateIncomeTax();
    }

    void generatePaySlip() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("Income Tax: " + calculateIncomeTax());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1, "male", "123 Main St", "john@example.com", "1234567890", 300000);
        employee1.generatePaySlip();

        // Create and generate pay slips for more employees here...
    }
}
