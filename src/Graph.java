import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Princejeet Singh Sandhu
 */
public class Graph {

    public static void main(String[] args) {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Edge m1 = new Edge(a,b,7);
        Edge m2 = new Edge(b,a,7);
        Edge n1 = new Edge(a,c,14);
        Edge n2 = new Edge(c,a,14);
        Edge o1 = new Edge(a,d,9);
        Edge o2 = new Edge(d,a,9);
        Edge p1 = new Edge(b,d,10);
        Edge p2 = new Edge(d,b,10);
        Edge q1 = new Edge(c,d,2);
        Edge q2 = new Edge(d,c,2);
        Edge r1 = new Edge(c,e,9);
        Edge r2 = new Edge(e,c,9);
        Edge s1 = new Edge(e,f,6);
        Edge s2 = new Edge(f,e,6);
        Edge t1 = new Edge(d,f,11);
        Edge t2 = new Edge(f,d,11);
        Edge u1 = new Edge(b,f,15);
        Edge u2 = new Edge(f,b,15);
        LinkedList<Edge> aEdges = new LinkedList<>();
        aEdges.add(m1);
        aEdges.add(n1);
        aEdges.add(o1);
        LinkedList<Edge> bEdges = new LinkedList<>();
        bEdges.add(m2);
        bEdges.add(p1);
        bEdges.add(u1);
        LinkedList<Edge> cEdges = new LinkedList<>();
        cEdges.add(n2);
        cEdges.add(q1);
        cEdges.add(r1);
        LinkedList<Edge> dEdges = new LinkedList<>();
        dEdges.add(t1);
        dEdges.add(q2);
        dEdges.add(p2);
        dEdges.add(o2);
        LinkedList<Edge> eEdges = new LinkedList<>();
        eEdges.add(s1);
        eEdges.add(r2);
        LinkedList<Edge> fEdges = new LinkedList<>();
        fEdges.add(s2);
        fEdges.add(t2);
        fEdges.add(u2);
        HashMap<Vertex,LinkedList<Edge>> adjacentVertices = new HashMap<>(6);
        adjacentVertices.put(a,aEdges);
        adjacentVertices.put(b,bEdges);
        adjacentVertices.put(c,cEdges);
        adjacentVertices.put(d,dEdges);
        adjacentVertices.put(e,eEdges);
        adjacentVertices.put(f,fEdges);
        shortestPath(a,adjacentVertices);
    }

    private static void shortestPath(Vertex a, HashMap<Vertex, LinkedList<Edge>> adjacentVertices) {
        LinkedList<Vertex> toVisit = new LinkedList<>();
        HashMap<Vertex, Vertex> previous = new HashMap<>(6);
        HashMap<Vertex, Float> distance = new HashMap<>(6);
        for (Vertex vertex : adjacentVertices.keySet()){
            distance.put(vertex,Float.POSITIVE_INFINITY);
            previous.put(vertex, null);
            toVisit.add(vertex);
        }
        distance.put(a,new Float(0));
        int count = 0;
        while (count < adjacentVertices.size()){
            Vertex v = new Vertex("");
            Float minValue = Float.POSITIVE_INFINITY;
            for (Vertex vertex : toVisit){
                Float value = distance.get(vertex);
                if(value < minValue) {
                    minValue = value;
                    v = vertex;
                }
            }
            toVisit.remove(v);
            for (Edge edge : adjacentVertices.get(v)) {
                if (distance.get(edge.getEndingVertex()) > edge.getDistance() + distance.get(v)){
                    distance.replace(edge.getEndingVertex(), edge.getDistance() + distance.get(v));
                    previous.put(edge.getEndingVertex(),v);
                }
            }
            count++;
        }
        System.out.println(previous);
    }
}