package practice;

import java.util.Collection;


public abstract class Team<T> {

    private Collection<T> players;
    private int budget;
    private String teamName;
    private String headCoachName;

    public abstract T buyPlayer(T newPlayer);
    public abstract T sellPlayer(T delPlayer);

    public Team(int budget, String teamName, String headCoachName) {
        this.budget = budget;
        this.teamName = teamName;
        this.headCoachName = headCoachName;
    }
    public void addbudget(int budget){
        this.budget+=budget;
    }
    public void reducebudget(int budget){
        this.budget-=budget;
    }

    public Collection<T> getPlayers() {
        return players;
    }

public boolean removePlayer(T player){
       return players.remove(player);
}

    public boolean addPlayer(T player){
        return players.add(player);
    }









}
