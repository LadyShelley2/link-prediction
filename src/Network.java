import java.util.ArrayList;

/**
 * @Author: lbb
 * @Description:
 * @Date: Created in 下午9:15 17-11-5
 * Modified By:
 */
public class Network {
    private Person A;
    private Person B;
    Network(Person _A, Person _B){
        this.A=_A;
        this.B=_B;
    }

    int CommonNeighbors(){
        ArrayList neighborOfA = A.getNeighbor();
        ArrayList neighborOfB = B.getNeighbor();

        //todo: get common neighbors of A and B;

        return 0;

    }
}
