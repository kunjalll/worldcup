import model.Group;
import model.Players;
import model.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Players> playerList=new ArrayList<Players>();
        Players p1=new Players("Neymar",12,31,9);
        Players p2=new Players("Messi",10,36,9);
        Players p3=new Players("Ronaldo",10,40,9);
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        System.out.println(playerList);

        ArrayList<Group> groupList=new ArrayList<Group>();
        Group g1=new Group("Brazil");
        Group g2=new Group("Argentina");
        Group g3=new Group("Portugal");
        groupList.add(g1);
        groupList.add(g2);
        groupList.add(g3);
        System.out.println(groupList);

        ArrayList<Team> teamList=new ArrayList<Team>();
        Team t1=new Team("Brazil","Yellow","Left Wing");
        Team t2=new Team("Argentina","Blue","Left Wing");
        Team t3=new Team("Portugal","White","Left Wing");
        teamList.add(t1);
        teamList.add(t2);
        teamList.add(t3);
        System.out.println(teamList);

    }
}