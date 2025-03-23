package kata.chess960.rules;

import java.util.function.Predicate;

public class KingAndRooksRule implements Predicate<String> {

	@Override
	public boolean test(String position) {
		int firstRook = position.indexOf("R");
		int secondRook = position.indexOf("R", firstRook + 1);
		int king = position.indexOf("K");

		return firstRook < king && king < secondRook;
	}
}
