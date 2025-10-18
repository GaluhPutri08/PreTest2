package classesnObjects;

public class Car {
    private String brand;
    private String model;
    private int year;

    /** Konstruktor penuh. */
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /** Mengembalikan info mobil dalam format yang diharapkan unit test. */
    public String getCarInfo() {
        return brand + " " + model + " (" + year + ")";
    }

    // (Opsional) getter/setter jika dibutuhkan di tempat lain
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
}