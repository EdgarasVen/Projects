public class Round {
    private String team1;
    private String team2;
    private int count1;
    private int count2;

    public Round(String team1, String team2, String count1, String count2) {
        checkNullOrEmpty(team1,team2,count1,count2);
        this.team1 = team1;
        this.team2 = team2;
        this.count1 = Integer.parseInt(count1);
        this.count2 = Integer.parseInt(count2);
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getCount1() {
        return count1;
    }

    public int getCount2() {
        return count2;
    }

    private void checkNullOrEmpty(String team1, String team2, String count1, String count2){
        if (team1==null || team2==null || count1==null || count2==null) throw new NullPointerException();
        if (team1.isEmpty() || team2.isEmpty() || count1.isEmpty() || count2.isEmpty()) throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return " Round{ "  +
                "team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", count1=" + count1 +
                ", count2=" + count2 +
                '}' + "\n";
    }


}
