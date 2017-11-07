import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: lbb
 * @Description:
 * @Date: Created in 下午9:15 17-11-5
 * Modified By:
 */
public class Link {
    private Person A;
    private Person B;

    Link(Person _A, Person _B) {
        this.A = _A;
        this.B = _B;
    }

    public List<Person> getCommonNeighbors() {
        List<Person> neighbors = A.getNeighbors();
        neighbors.addAll(B.getNeighbors()); //combine A and B's neighbors into a List
        return getDuplicateElements(neighbors);
    }

    public List<Person> getUnionNeighbors(){
        List<Person> neighbors = A.getNeighbors();
        neighbors.addAll(B.getNeighbors());
        return  getDistinctElements(neighbors);
    }

    private  <E> List<E> getDuplicateElements(List<E> list) {
        return list.stream() //list Stream
                .collect(Collectors.toMap(e -> e, e -> 1, (a, b) -> a + b)) //get map of frequency: key is element,value is frequency.
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    private <E> List<E> getDistinctElements(List<E> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public double adamicAdar() {
        List<Person> neighbors = getCommonNeighbors();
        return neighbors.stream()
                .map((e) -> 1.0 / Math.log(e.getNeighbors().size()))
                .reduce(0.0, (a, b) -> a + b);
    }

    public double jaccardsCoefficient(){
        return getCommonNeighbors().size()/getCommonNeighbors().size();
    }

    public double Katz(){
        //todo:get different length paths between x,y,get K(x,y) due to the formation in paper.
        return 0.0;
    }

    private Map getPaths(){
        Map paths = new HashMap() {};
        // todo: get paths bwtween two nodes in network
        return paths;
    }
}
