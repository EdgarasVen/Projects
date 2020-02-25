import java.util.List;

public class Informer {
    private List<Round> rounds;
    private String fileName;

    public Informer(CsvReader reader) {
        rounds=reader.read();
        fileName=reader.getFileName();
    }

    public void printResult(String team) {
        System.out.println("File: "+ fileName);
        System.out.println("Team: "+ team);
        System.out.println("Games: "+ howManyGames(team));
        System.out.println("Wins: "+ howManyWins(team));
        System.out.println("Losses: "+ howManyLooses(team));
    }

    private long howManyGames(String team){
        return rounds.stream()
                .filter(round -> round.getTeam1().equals(team) || round.getTeam2().equals(team))
                .count();
    }

    private long howManyWins(String team){
        return rounds.stream()
                .filter(round -> round.getTeam1().equals(team) || round.getTeam2().equals(team))
                .filter(round -> round.getTeam1().equals(team) && round.getCount1()>round.getCount2()
                || round.getTeam2().equals(team) && round.getCount2()>round.getCount1())
                .count();
    }

    private long howManyLooses(String team){
        return rounds.stream()
                .filter(round -> round.getTeam1().equals(team) || round.getTeam2().equals(team))
                .filter(round -> round.getTeam1().equals(team) && round.getCount1()<round.getCount2()
                        || round.getTeam2().equals(team) && round.getCount2()<round.getCount1())
                .count();
    }
}
