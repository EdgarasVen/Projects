package lt.vote;

import lt.vtvpmc.java.voting.Vote;
import lt.vtvpmc.java.voting.VoteRegistry;

import java.util.*;

public class Register implements VoteRegistry {
    private Set<Vote> votes = new HashSet<>();
    private Map<String,Candidate> candidates = new HashMap<>();
    private boolean voting =true;


    public boolean registerVote(Vote vote) {
        checkNullAndEmpty(vote);
        if (!voting) return false;
        if (votes.contains(vote)) return false;
        if(candidates.containsKey(vote.getVoteCastFor())) candidates.get(vote.getVoteCastFor()).addVote();
        else candidates.putIfAbsent(vote.getVoteCastFor(),new Candidate(vote.getVoteCastFor()));
        votes.add(vote);
        return true;
    }

    public String getAWinner() {
        if (votes.isEmpty()) throw new IllegalStateException();
        String winner = candidates.values().stream()
                .max(Comparator.comparing(Candidate::getVotes))
                .orElseThrow( null).getName();
        if(checkIfAreSame(winner)) throw new IllegalStateException();
        return winner;
    }

    public int getNumberOfVotesCast() {
        return votes.size();
    }

    public void stopVotingProcess() {
        voting=false;
    }

    private void checkNullAndEmpty (Vote vote){
        if(vote == null ) throw new NullPointerException();
    }
    private boolean checkIfAreSame(String winner){
        int votes = candidates.get(winner).getVotes();
        long check = candidates.values().stream()
                .filter(candidate -> candidate.getVotes()==votes)
                .count();
        return check>1;

    }
}
