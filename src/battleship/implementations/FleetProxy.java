package battleship.implementations;

import battleship.interfaces.Fleet;
import battleship.interfaces.Ship;
import java.util.Iterator;


class FleetProxy implements Fleet
{
    private final Fleet fleet;

    public FleetProxy(Fleet fleet)
    {
        this.fleet = fleet;
    }
    
    @Override
    public int getNumberOfShips()
    {
        return fleet.getNumberOfShips();
    }

    @Override
    public Ship getShip(int index)
    {
        return fleet.getShip(index);
    }
    
    @Override
    public String toString()
    {
        return "Nothing to see here.";
    }

    @Override
    public Iterator<Ship> iterator()
    {
        return fleet.iterator();
    }
    
}
