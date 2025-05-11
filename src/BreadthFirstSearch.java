import java.util.List;

public class BreadthFirstSearch<V> implements Search<V>{
    @Override
    public boolean hasPathTo(Object vertex) {
        return false;
    }

    @Override
    public List pathTo(Object vertex) {
        return List.of();
    }
}
