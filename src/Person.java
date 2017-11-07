import java.util.List;
import java.util.ArrayList;

public class Person {
    private String id;

    Person(String _id){
        this.id = _id;
    }

    public String getId(){
        return id;
    }

    List<Person> getNeighbors() {

        List<Person> neighbors = new ArrayList();

        for (Record r : Main.Records) {
            if (r.getCaller().getId() == this.id) {
                neighbors.add(r.getCaller());
            } else if (r.getCaller().getId() == this.id) {
                neighbors.add(r.getCallee());
            }
        }
        return neighbors;
    }
}
