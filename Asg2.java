import java.util.ArrayList;

import java.util.Iterator;

import poker.Card;
import poker.PokerDeck;

public class Asg2 {

	public static void main(String[] args) {
		PokerDeck pk = new PokerDeck();
		ArrayList<Card> b = new ArrayList<Card>();
		Card card2;
		Card card;
		pk.shuffle();

		ArrayList<Card> a = pk.toArrayList();
		System.out.println(a);

		Iterator<Card> aiter = a.listIterator();
		/**
		 * Goes through the original shuffle deck and add all the D suits to the
		 * array card2
		 */
		while (aiter.hasNext()) {
			card2 = aiter.next();
			if (card2.getSuit() == 'D') {

				b.add(card2);
			}
		}

		System.out.println(b);
		card = b.get(0);
		int count = 0;
		/**
		 * reverse the 13 cards of one suit
		 */
		while (b.get(0).getKind() != 1) {
			int p = 0;
			int j = b.get(0).getKind() - 1;
			while (p < j) {
				card = b.get(p);
				b.set(p, b.get(j));
				b.set(j, card);
				p++;
				j--;
			}
			count++;
			System.out.println(b);
		}
		if (b.get(0).getKind() != 1)
			System.out.println(b);
		System.out.println("Reverse " + count + " Times.");
		/**
		 * start from the deck beginning after all the suit H are picked out
		 */
		aiter = a.listIterator();
		b = new ArrayList<Card>();
		/**
		 * Goes through the original shuffle deck and add all the H suits to the
		 * array card2
		 */
		while (aiter.hasNext()) {
			card2 = aiter.next();
			if (card2.getSuit() == 'H')

				b.add(card2);

		}

		System.out.println(b);
		card = b.get(0);
		count = 0;
		/**
		 * reverse the 13 cards of one suit
		 */
		while (b.get(0).getKind() != 1) {
			int p = 0;
			int j = b.get(0).getKind() - 1;
			while (p < j) {
				card = b.get(p);
				b.set(p, b.get(j));
				b.set(j, card);
				p++;
				j--;
			}
			count++;
			System.out.println(b);
		}
		if (b.get(0).getKind() != 1)
			System.out.println(b);
		System.out.println("Reverse " + count + " Times.");
		/**
		 * start from the deck beginning after all the suit H are picked out
		 */
		aiter = a.listIterator();

		b = new ArrayList<Card>();
		/**
		 * Goes through the original shuffle deck and add all the C suits to the
		 * array card2
		 */
		while (aiter.hasNext()) {
			card2 = aiter.next();
			if (card2.getSuit() == 'C')

				b.add(card2);

		}

		System.out.println(b);
		card = b.get(0);
		count = 0;
		/**
		 * reverse the 13 cards of one suit
		 */
		while (b.get(0).getKind() != 1) {
			int p = 0;
			int j = b.get(0).getKind() - 1;
			while (p < j) {
				card = b.get(p);
				b.set(p, b.get(j));
				b.set(j, card);
				p++;
				j--;
			}
			count++;
			System.out.println(b);
		}
		if (b.get(0).getKind() != 1)
			System.out.println(b);
		System.out.println("Reverse " + count + " Times.");
		/**
		 * start from the deck beginning after all the suit H are picked out
		 */
		aiter = a.listIterator();

		b = new ArrayList<Card>();
		/**
		 * Goes through the original shuffle deck and add all the S suits to the
		 * array card2
		 */
		while (aiter.hasNext()) {
			card2 = aiter.next();
			if (card2.getSuit() == 'S')

				b.add(card2);

		}

		System.out.println(b);
		card = b.get(0);
		count = 0;
		/**
		 * reverse the 13 cards of one suit
		 */
		while (b.get(0).getKind() != 1) {
			int p = 0;
			int j = b.get(0).getKind() - 1;
			while (p < j) {
				card = b.get(p);
				b.set(p, b.get(j));
				b.set(j, card);
				p++;
				j--;
			}
			count++;
			System.out.println(b);
		}
		if (b.get(0).getKind() != 1)
			System.out.println(b);
		System.out.println("Reverse " + count + " Times.");

	}
}
