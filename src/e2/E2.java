package e2;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;


public class E2 implements PlayerFactory<BattleshipsPlayer>
{
    public E2(){}
    
    
    @Override
    public BattleshipsPlayer getNewInstance()
    {
        return new SystematicShotPlayer();
    }

    @Override
    public String getID()
    {
        return "E2";
    }

    @Override
    public String getName()
    {
        return "Systematic shooter";
    }
    
}
