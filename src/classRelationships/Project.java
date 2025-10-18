package classRelationships;

/**
 * ASSOCIATION: Project “berasosiasi” dengan seorang leader (Employee)
 * yang diteruskan dari luar lewat konstruktor.
 */
public class Project {
    private final String name;
    private final Employee leader;

    public Project(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getLeaderName() {
        return (leader == null) ? null : leader.getName();
    }

    public String getName() {
        return name;
    }
}