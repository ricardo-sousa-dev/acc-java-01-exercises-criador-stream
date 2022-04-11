package com.trybe.acc.java;

import java.util.List;
import java.util.stream.Stream;

/** Created by Ricardo Sousa. */
public class CriadorStream {

  // 1: <T> Stream<T> criarDoItem(T item)
  // Cria um método que recebe um objeto e retorna um Stream de um único elemento.
  public <T> Stream<T> criarDoItem(T item) {
    return Stream.of(item);
  }

  // 2: <T> Stream<T> criarDoArray(T[] array)
  // Cria um método que recebe um array e retorna um Stream de todos os elementos.
  public <T> Stream<T> criarDoArray(T[] array) {
    return Stream.of(array);
  }

  // 3: <T> Stream<T> criarDaLista(List<T> lista)
  // Cria um método que recebe uma lista e retorna um Stream de todos os
  // elementos.
  public <T> Stream<T> criarDaLista(List<T> lista) {
    return lista.stream();
  }
}
