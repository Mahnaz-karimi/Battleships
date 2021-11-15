package Dungeon.Controler;
import dungenModel.Items;
import dungenModel.mapRooms;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class GameControlerTest {
    
    public GameControlerTest() {
    }
    
    @Before
    public void setUp() {
    }


    @Test
    public void testGoNorth() {
       
        GameControler instance = new GameControler("User") ;
        instance.goNorth();
        assertTrue(instance.rMap.getCurrentRoom()==instance.rMap.getR4());
       
    }

    
}
