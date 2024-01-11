import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double basicSalary;

    private ArrayList<Double> payments = new ArrayList<Double>();
    private ArrayList<Date> dates = new ArrayList<Date>();
    private ArrayList<String> methods = new ArrayList<String>();

    public Employee(String employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(double overtime, double bonuses, double deduction) {
        return basicSalary + overtime + bonuses - deduction;
    }

    public void paymentHistory() {
        System.out.println("\t\tPayments received");
        System.out.println("\t\tdate\t\t\tamount\tmethod");
        for (int i = 0; i < payments.size(); i++) {
            System.out.println("\t" + dates.get(i) + "\t" + payments.get(i) + "\t" + methods.get(i));
        }
    }

    public void addPayment(Date date, double amount, String method) {
        dates.add(date);
        payments.add(amount);
        methods.add(method);
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
