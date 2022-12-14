//1. Создайте HashSet, заполните его следующими числами:
// {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами:
// {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами:
// {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

package ru.geekbrains;

import java.util.*;

public class Task001 {
    public static void main(String[] args) {
        Set<Integer> setHash = new HashSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : setHash) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");
        Set<Integer> setLink = new LinkedHashSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : setLink) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");
        Set<Integer> setTree = new TreeSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        for (Integer integer : setLink) {
            System.out.print(integer + " ");
        }
    }
}
