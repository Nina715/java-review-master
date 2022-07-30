public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer( "Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("BeckHam");

        //Team livepool = new Team("LivePool");
        Team<SoccerPlayer> liverpool=new Team<>("Liverpool");
        //Team<String> brokenTeam = new Team<String>("THIS WONT WORK");
        // TEAM CAN ONLY ACCEPT PLAYER TYPE
        //liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());
    }
}
