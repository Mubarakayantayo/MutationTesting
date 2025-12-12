package com.williamfiset.algorithms.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

  @Test
  public void testAddFirstLastAndPeek() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.addFirst(2);
    list.addFirst(1);
    list.addLast(3);

    assertEquals(1, list.peekFirst());
    assertEquals(3, list.peekLast());
    assertEquals(3, list.size());
  }

  @Test
  public void testRemoveFirstAndLast() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    assertEquals(1, list.removeFirst());
    assertEquals(3, list.removeLast());
    assertEquals(1, list.size());
  }

  @Test
  public void testAddAtAndIndexOf() throws Exception {
    DoublyLinkedList<String> list = new DoublyLinkedList<>();
    list.add("A");
    list.add("C");
    list.addAt(1, "B");

    assertEquals(1, list.indexOf("B"));
    assertEquals(3, list.size());
  }

  @Test
  public void testRemoveAtMiddle() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    assertEquals(20, list.removeAt(1));
    assertEquals(2, list.size());
  }

  @Test
  public void testRemoveEmptyThrows() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    assertThrows(RuntimeException.class, list::removeFirst);
  }

  @Test
  public void testInvalidIndexThrows() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    assertThrows(IllegalArgumentException.class, () -> list.removeAt(0));
  }
}
