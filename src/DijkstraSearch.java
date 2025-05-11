import java.util.List;

public class DijkstraSearch<V> implements Search<V> {

    @Override
    public boolean hasPathTo(V vertex) {
        return false;
    }

    @Override
    public List<V> pathTo(V vertex) {
        return List.of();
    }
}
