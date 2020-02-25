package lt.vote;

public class Candidate {
    private String name;
    private int votes=0;

    public Candidate(String name) {
        this.name = name;
        votes++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote(){
        votes++;
    }
}
