package Collections.Card;

import java.util.Objects;

public class Card {
    private int hashCode;
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;

        hashCode = 10;
        hashCode = 31 * hashCode + (suit != null ? suit.hashCode() : 0);
        hashCode = 31 * hashCode + (rank != null ? rank.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "{ Rank: " + rank + " Suit: " + suit + " }";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Card card = (Card) object;
        return suit.equals(card.suit) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

}
