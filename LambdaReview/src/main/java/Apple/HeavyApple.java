package Apple;

public class HeavyApple implements Apple{
    @Override
    public boolean test(FindingApple apple) {
        return apple.getWeight()>150;
    }
}
