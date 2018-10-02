public class Team implements Comparable<Team> {
    private String team;
    private int wins;
    private int losses;
    private int draws;

    public Team() {

    }

    public Team(String name, int win, int loss, int draw) {
        this.team = name;
        this.wins = win;
        this.losses = loss;
        this.draws = draw;
    }
    public String toString() {
        return this.team;
    }
    public int getWins() {
        return this.wins;
    }
    public int getLosses() {
        return this.losses;
    }

    public int getDraws() {
        return this.draws;
    }

    public int compareTo(Team that) {
        if (this.getWins() > that.getWins()) {
            return 1;
        } else if (this.getWins() < that.getWins()) {
            return -1;
        } else if (this.getLosses() < that.getLosses()) {
            return 1;
        } else if (this.getLosses() > that.getLosses()) {
            return -1;
        } else if (this.getDraws() > that.getDraws()) {
            return 1;
        } else if (this.getDraws() < that.getDraws()) {
            return -1;
        } else {
            return 0;
        }
    }
}