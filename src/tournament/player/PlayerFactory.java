package tournament.player;

public interface PlayerFactory<PlayerType> extends PlayerInfo
{
    /**
     * Must return an instance of you BattleshipPlayer
     * Example:
     * 
     * @Override
     * public BattleshipsPlayer getNewInstance()
     * {
     *        return new RandomPlayer();
     * }
     * 
     * @return 
     */
    public PlayerType getNewInstance();
}
