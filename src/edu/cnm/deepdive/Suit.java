package edu.cnm.deepdive;

/**
 * Encapsulates the suits of standard playing cards. Each instance
 * an return (using the {@link #symbol()} symbol method)
 * the unicode symbol for that suit.
 */
public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  /**
   *Returns the Unicode symbol for the current instance.
   *
   * @return One of the four symbols: ♠;, ♥;, ♦;, ♣;
   */
  public char symbol() {
    switch (this) {
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case HEARTS:
        return '\u2661';
      default:
        return '\u2660';
    }
  }

}


