package Apple;

public class GreenApple implements Apple{

    @Override
    public boolean test(FindingApple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
