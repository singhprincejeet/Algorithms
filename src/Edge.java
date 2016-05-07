/**
 * @author Princejeet Singh Sandhu
 */
public class Edge {

    // To store the vertex at which the edge ends.
    private Vertex startingVertex;

    // To store the vertex at which the edge ends.
    private Vertex endingVertex;

    //To store the distance between two vertices.
    private float distance;

    public Edge(Vertex startingVertex, Vertex endingVertex, float distance) {
        this.startingVertex = startingVertex;
        this.endingVertex = endingVertex;
        this.distance = distance;
    }

    /**
     * To get distance between the two edges.
     *
     * @return The distance between two edges.
     */
    public float getDistance() {
        return distance;
    }

    /**
     * To know the vertex at which the edge starts.
     *
     * @return The vertex at which the edge starts.
     */
    public Vertex getStartingVertex() {
        return startingVertex;
    }

    /**
     * To change the starting vertex of edge.
     *
     * @param startingVertex Stores the starting vertex of an edge.
     */
    public void setStartingVertex(Vertex startingVertex) {
        this.startingVertex = startingVertex;
    }

    /**
     * To know the vertex at which the edge ends.
     *
     * @return The vertex at which the edge ends.
     */
    public Vertex getEndingVertex() {
        return endingVertex;
    }

    /**
     * To change the ending vertex of edge.
     *
     * @param endingVertex Stores the ending vertex of an edge.
     */
    public void setEndingVertex(Vertex endingVertex) {
        this.endingVertex = endingVertex;
    }

    /**
     * To change the distance between two vertices.
     *
     * @param distance Stores the distance between two vertices.
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return startingVertex + "" + endingVertex;
    }
}