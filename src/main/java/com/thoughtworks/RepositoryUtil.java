package com.thoughtworks;

import java.util.Collection;
import java.util.List;

public class RepositoryUtil<E> {
    public static<E> void printList(List<E> list) {
        for (E obj: list) {
            System.out.println(obj);
        }
    }
}
