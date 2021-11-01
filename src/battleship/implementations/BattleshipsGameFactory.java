package battleship.implementations;

import battleship.interfaces.BattleshipsPlayer;
import tournament.game.GameFactory;
import tournament.game.GameInstance;


class BattleshipsGameFactory implements GameFactory<BattleshipsPlayer>
{
    private final int sizeX;
    private final int sizeY;
    private final int[] ships;
    private final int rounds;

    public BattleshipsGameFactory(int sizeX, int sizeY, int[] ships, int rounds)
    {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.ships = ships;
        this.rounds = rounds;
    }
    
    @Override
    public String getGameName()
    {
        return "Battleships";
    }

    @Override
    public GameInstance<BattleshipsPlayer> getNewGameInstance()
    {
        return new BattleshipsGameInstance(sizeX, sizeY, ships, rounds);
    }
    
}
