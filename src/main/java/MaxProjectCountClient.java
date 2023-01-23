public class MaxProjectCountClient {
    private String name;
    private int project_count;

    public MaxProjectCountClient(String name, int project_count) {
        this.name = name;
        this.project_count = project_count;
    }

    @Override
    public String toString() {
        return "MaxProjectCountClient{" +
                "name='" + name + '\'' +
                ", project_count=" + project_count +
                '}';
    }
}
