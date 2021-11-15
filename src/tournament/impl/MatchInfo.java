
package tournament.impl;

import tournament.game.GameResult;


public interface MatchInfo
{
    public ParticipantInfo getParticipantA();
    public ParticipantInfo getParticipantB();
    public GameResult getResult();
}
