package classRelationships;

/** Objek sederhana untuk kebutuhan komposisi pada Manager. */
public class Task {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}