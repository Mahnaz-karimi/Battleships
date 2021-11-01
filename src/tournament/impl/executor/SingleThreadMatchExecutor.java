

package tournament.impl.executor;

import java.util.List;


public class SingleThreadMatchExecutor implements MatchExecutor
{

    @Override
    public void executeAll(List<Runnable> matches)
    {
        for(Runnable r : matches)
        {
            r.run();
        }
    }
    
}
