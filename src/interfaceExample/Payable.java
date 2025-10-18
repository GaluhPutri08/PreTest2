package interfaceExample;

/**
 * Interface sederhana yang mewakili entitas yang dapat dibayar.
 */
public interface Payable {
    /**
     * Mengembalikan jumlah pembayaran yang harus diterima.
     * @return jumlah pembayaran
     */
    double getPaymentAmount();
}
