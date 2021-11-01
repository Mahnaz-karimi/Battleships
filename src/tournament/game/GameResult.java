package tournament.game;


public class GameResult
{
    public final int majorPointsA;
    public final int minorPointsA;
    public final int majorPointsB;
    public final int minorPointsB;

    public GameResult(int majorPointsA, int minorPointsA, int majorPointsB, int minorPointsB)
    {
        this.majorPointsA = majorPointsA;
        this.minorPointsA = minorPointsA;
        this.majorPointsB = majorPointsB;
        this.minorPointsB = minorPointsB;
    }
    
    @Override
    public String toString()
    {
        return "A: (" + majorPointsA + ":" + minorPointsA + ") B: (" + majorPointsB + ":" + minorPointsB + ")";
    }
}
