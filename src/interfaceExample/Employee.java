package interfaceExample;

/**
 * Employee yang menerima gaji tetap.
 * Mengimplementasikan interface Payable.
 */
public class Employee implements Payable {
    private final double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        // Sesuai test: nilai yang dikembalikan = salary
        return salary;
    }

    // (Opsional) getter jika diperlukan di tempat lain
    public double getSalary() {
        return salary;
    }
}
