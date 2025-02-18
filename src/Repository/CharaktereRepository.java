package Repository;

import Model.Charaktere;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CharaktereRepository implements IRepository<Charaktere, Integer> {
    private final List<Charaktere> charaktere;

    public CharaktereRepository(List<Charaktere> charaktere) {
        this.charaktere = charaktere;
    }

    public CharaktereRepository() {
        this.charaktere = new ArrayList<>();
    }

    @Override
    public void add(Charaktere entity) {
        charaktere.add(entity);
    }

    @Override
    public void delete(Integer entity) {
        charaktere.removeIf(charakter -> Objects.equals(charakter.getId(), entity));
    }

    @Override
    public void update(Charaktere entity1, Charaktere entity2) {
        if(charaktere.remove(entity1)) {
            charaktere.add(entity2);
        }
    }

    @Override
    public Charaktere get(Integer entity) {
        for(Charaktere charakter : charaktere) {
            if(Objects.equals(charakter.getId(), entity)) {
                return charakter;
            }
        }
        return null;
    }

    @Override
    public List<Charaktere> getAll() {
        return charaktere;
    }
}
