package Services;

import java.util.List;

public interface GenericService <T,ID>{
    List<T> retrieveAll();
    void add(T t);
    void update(T t);
    void remove(ID id);
    T retrieve(ID id);
}

