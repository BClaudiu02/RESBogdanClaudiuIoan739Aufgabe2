package Controller;

import Model.Charaktere;
import Model.Produkte;
import Repository.CharaktereRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class CharaktereController implements IController<Charaktere, Integer> {
    private final CharaktereRepository charaktereRepository;

    public CharaktereController(CharaktereRepository charaktereRepository) {
        this.charaktereRepository = charaktereRepository;
    }

    public List<Charaktere> filterByHerkunftsort(String x) {
        return getAll().stream()
                .filter(charaktere -> Objects.equals(charaktere.getHerkunftsort(), x))
                .toList();
    }

    public List<Charaktere> produkteAusDorf(String x) {
        return getAll().stream()
                .filter(charaktere -> charaktere.getProdukte().stream()
                        .anyMatch(produkte -> Objects.equals(produkte.getHerkunftsregion(), x)))
                .toList();
    }


    @Override
    public void add(Charaktere entity) {
        charaktereRepository.add(entity);
    }

    @Override
    public void delete(Integer entity) {
        charaktereRepository.delete(entity);
    }

    @Override
    public void update(Charaktere entity1, Charaktere entity2) {
        charaktereRepository.update(entity1, entity2);
    }

    @Override
    public Charaktere get(Integer entity) {
        return charaktereRepository.get(entity);
    }

    @Override
    public List<Charaktere> getAll() {
        return charaktereRepository.getAll();
    }
}
