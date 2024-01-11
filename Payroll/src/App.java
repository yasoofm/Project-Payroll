import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Employee yousef = new Employee("123", "yousef", "dev", 500);

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        Calendar date3 = Calendar.getInstance();

        date1.set(2023, 3, 15);
        date2.set(2023, 9, 2);

        yousef.addPayment(date1.getTime(), 500, "cash");
        yousef.addPayment(date2.getTime(), 1000, "cheque");
        yousef.addPayment(date3.getTime(), 1100, "transaction");

        System.out.println("\tEmployee: " + yousef.getName());
        yousef.paymentHistory();
        System.out.println("\tTotal salary: " + yousef.calculateSalary(100, 30, 20));

    }
}
