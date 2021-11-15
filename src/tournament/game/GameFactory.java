
package tournament.game;


public interface GameFactory<PlayerType>
{
    public String getGameName();
    public GameInstance<PlayerType> getNewGameInstance();
}
