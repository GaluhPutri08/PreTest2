package classRelationships;

/**
 * AGGREGATION: Department “memiliki” referensi ke Manager,
 * tetapi Manager diciptakan/dimiliki di luar Department.
 */
public class Department {
    private final String name;
    private Manager manager; // agregasi: referensi long-lived ke objek eksternal

    public Department(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getManagerName() {
        return (manager == null) ? null : manager.getName();
    }

    public String getName() {
        return name;
    }
}
