package Controller;

import java.util.List;

public interface IController<T, ID> {
    void add(T entity);
    void delete(ID entity);
    void update(T entity1, T entity2);
    T get(ID entity);
    List<T> getAll();
}
