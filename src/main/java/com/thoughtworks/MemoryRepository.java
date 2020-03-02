package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository<E> implements Repository<E>{
    Map<String, E> obj = new HashMap<>();

    public MemoryRepository() {
    }

    public MemoryRepository(Map<String, E> map) {
        this.obj = map;
    }

    @Override
    public void save(String id, E entity) {
        obj.put(id, entity);
    }

    @Override
    public E get(String id) {
        return obj.get(id);
    }

    @Override
    public void delete(String id) {
        obj.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        obj.replace(id,entity);
    }

    @Override
    public List<E> list() {
        List<E> objList = new ArrayList<>();
        for (String id : obj.keySet()) {
            objList.add(obj.get(id));
        }
        return objList;
    }
}
