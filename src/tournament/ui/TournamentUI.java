package tournament.ui;

import java.util.List;
import tournament.impl.MatchInfo;
import tournament.impl.ParticipantInfo;


public interface TournamentUI
{
    public void tournamentReady(String gameName, ParticipantInfo[] participants, MatchInfo[] matches);
    public void matchStarted(int matchIndex);
    public void matchFinished(int matchIndex);
    public void tournamentFinished(List<ParticipantInfo> sortedParticipants);
}
