
package tournament.impl.executor;

import java.util.List;

public interface MatchExecutor
{
    public void executeAll(List<Runnable> matches);
}
