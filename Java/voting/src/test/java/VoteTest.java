import lt.vote.Register;
import lt.vtvpmc.java.voting.AbstractVotingTest;
import lt.vtvpmc.java.voting.VoteRegistry;

public class VoteTest extends AbstractVotingTest {
    protected VoteRegistry getVoteRegistry() {
        return new Register();
    }
}
