package com.thoughtworks;

import java.util.Collection;

public class RepositoryUtil<E> {
    public static<E> void printList(MemoryRepository<E> memoryRepository) {
        Collection<E> list = memoryRepository.list();
        for (E obj: list) {
            System.out.println(obj);
        }
    }
}
