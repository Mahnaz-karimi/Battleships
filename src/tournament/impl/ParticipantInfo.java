

package tournament.impl;

import tournament.player.PlayerInfo;


public interface ParticipantInfo extends PlayerInfo, Comparable<ParticipantInfo>
{
    public int getMatchesWon();
    public int getMatchesLost();
    public int getMatchesDraw();
    public int getMajorPoints();
    public int getMinorPoints();
}
