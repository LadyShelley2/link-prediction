import java.util.ArrayList;

public class Person {
    private int id;

    int getId(){
        return id;
    }

    ArrayList getNeighbor() {

        ArrayList neighbors = new ArrayList();

        for (Record r : Main.Records) {
            if (r.getCaller() == this.id) {
                neighbors.add(r.getCaller());
            } else if (r.getCaller() == this.id) {
                neighbors.add(r.getCallee());
            }
        }
        return neighbors;
    }
}
