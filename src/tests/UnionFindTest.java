package tests;

public class UnionFindTest {
    
}
package com.williamfiset.algorithms.datastructures.unionfind;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UnionFindTest {

  @Test
  void testInitialComponents() {
    UnionFind uf = new UnionFind(5);
    assertEquals(5, uf.components());
    assertEquals(5, uf.size());
  }

  @Test
  void testUnionReducesComponents() {
    UnionFind uf = new UnionFind(5);
    uf.unify(0, 1);
    assertTrue(uf.connected(0, 1));
    assertEquals(4, uf.components());
  }

  @Test
  void testMultipleUnions() {
    UnionFind uf = new UnionFind(5);
    uf.unify(0, 1);
    uf.unify(1, 2);
    assertTrue(uf.connected(0, 2));
    assertEquals(3, uf.components());
  }

  @Test
  void testComponentSize() {
    UnionFind uf = new UnionFind(5);
    uf.unify(0, 1);
    uf.unify(1, 2);
    assertEquals(3, uf.componentSize(0));
  }

  @Test
  void testInvalidSizeThrowsException() {
    assertThrows(IllegalArgumentException.class, () -> new UnionFind(0));
  }
}
