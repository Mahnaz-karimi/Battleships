
package e1;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;


public class E1 implements PlayerFactory<BattleshipsPlayer>
{

    public E1(){}
    
    
    @Override
    public BattleshipsPlayer getNewInstance()
    {
        return new RandomShooter();
    }

    @Override
    public String getID()
    {
        return "E1";
    }

    @Override
    public String getName()
    {
        return "Random shooter";
    }
    
}
