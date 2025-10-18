package classRelationships;

/**
 * Manager adalah jenis Employee.
 * Punya komposisi dengan Task (lihat setTask/getTaskName).
 */
public class Manager extends Employee {

    // Komposisi: Manager "memiliki" Task
    private Task task;

    public Manager(String name) {
        super(name);
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTaskName() {
        return (task == null) ? null : task.getName();
    }
}
