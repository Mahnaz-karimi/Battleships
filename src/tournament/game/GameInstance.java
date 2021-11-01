package tournament.game;


public interface GameInstance<PlayerType>
{
    public GameResult run(PlayerType playerA, PlayerType playerB);
}
