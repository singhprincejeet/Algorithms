/**
 * @author Princejeet Singh Sandhu
 */
public class Vertex {

    private float value;
    private String name;

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
