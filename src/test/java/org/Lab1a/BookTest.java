package org.Lab1a;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
  private Book hamlet;
  public Person author;

  @Before
  public void setUp() {
    author = new Person("William", "Shakespeare", 1564);
    hamlet = new Book("Hamlet", author, 10);
  }

  @Test
  public void testTitle() {
    assertEquals("Hamlet", hamlet.getTitle());
  }

  @Test
  public void testPrice() {
    assertEquals(10, hamlet.getPrice(), 0);
  }

  @Test
  public void testAuthor() {
    assertEquals("William Shakespeare (born 1564)", hamlet.getAuthor().toString());
  }

}