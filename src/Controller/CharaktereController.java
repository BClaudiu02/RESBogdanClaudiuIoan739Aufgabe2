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

    public List<Charaktere> filterByX(String x) {
        return getAll().stream()
                .filter(charaktere -> Objects.equals(charaktere.getHerkunftsort(), x))
                .toList();
    }

    public List<Charaktere> aufgabe4(String x) {
        return getAll().stream()
                .filter(charaktere -> charaktere.getProdukte().stream()
                        .anyMatch(produkte -> Objects.equals(produkte.getHerkunftsregion(), x)))
                .toList();
    }

    public List<Produkte> aufgabe5(int id, int sort) {
        Charaktere selectedCharaktere = charaktereRepository.get(id);

        List<Produkte> produkte = selectedCharaktere.getProdukte();
        if(sort == 1) {
            produkte.sort(Comparator.comparingInt(Produkte::getPreis));
        } else {
            produkte.sort((p1, p2) -> Integer.compare(p2.getPreis(), p1.getPreis()));
        }
        return produkte;
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
