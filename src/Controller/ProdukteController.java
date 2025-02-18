package Controller;

import Model.Produkte;
import Repository.ProdukteRepository;

import java.util.List;

public class ProdukteController implements IController<Produkte, String> {
    private final ProdukteRepository produkteRepository;

    public ProdukteController(ProdukteRepository produkteRepository) {
        this.produkteRepository = produkteRepository;
    }

    @Override
    public void add(Produkte entity) {
        produkteRepository.add(entity);
    }

    @Override
    public void delete(String entity) {
        produkteRepository.delete(entity);
    }

    @Override
    public void update(Produkte entity1, Produkte entity2) {
        produkteRepository.update(entity1, entity2);
    }

    @Override
    public Produkte get(String entity) {
        return produkteRepository.get(entity);
    }

    @Override
    public List<Produkte> getAll() {
        return produkteRepository.getAll();
    }
}
