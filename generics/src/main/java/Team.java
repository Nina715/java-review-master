import java.util.ArrayList;

public class Team<T extends Player> { //ASKING THE TEAM TO ONLY ACCEPT PLAYER OBJECT

    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName()+ " is already on this team");
            //casting ((Player)player).getName()
            return false;
        } else {
            System.out.println( player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
}
