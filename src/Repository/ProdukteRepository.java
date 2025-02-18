package Repository;

import Model.Produkte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProdukteRepository implements IRepository<Produkte, String> {
    private final List<Produkte> produkte;
    public ProdukteRepository(List<Produkte> produkte) {
        this.produkte = produkte;
    }

    public ProdukteRepository() {this.produkte = new ArrayList<>();}

    @Override
    public void add(Produkte entity) {
        produkte.add(entity);
    }

    @Override
    public void delete(String entity) {
        produkte.removeIf(medkament -> Objects.equals(medkament.getName(), entity));
    }

    @Override
    public void update(Produkte entity1, Produkte entity2) {
        if(produkte.remove(entity1)) {
            produkte.add(entity2);
        }
    }

    @Override
    public Produkte get(String entity) {
        for(Produkte p : produkte) {
            if(Objects.equals(p.getName(), entity)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produkte> getAll() {
        return produkte;
    }
}
