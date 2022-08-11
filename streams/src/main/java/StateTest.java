import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {
        State va = new State();
        va.addCity("Mclean");
        va.addCity("Alington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

        //print all the cities
        //first stream then get list of state
        // flat map it, basically, take the stuff out of the list
        //print each
        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);

        //OR
        list.stream()
                .flatMap(state -> state.getCities().stream())
                .forEach(System.out::println);
    }
}
