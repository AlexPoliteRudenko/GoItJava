package core.module08.homework;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<>();
    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> tList) {
        list.removeAll(tList);
    }

    @Override
    public void saveAll(List<T> tList) {
        list.addAll(tList);
    }

    @Override
    public List<T> getList() {
        return this.list;
    }
}
