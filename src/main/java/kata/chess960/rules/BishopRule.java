package kata.chess960.rules;

import java.util.function.Predicate;

public class BishopRule implements Predicate<String> {

	@Override
	public boolean test(String position) {
		int firstBishop = position.indexOf("B");
		int secondBishop = position.indexOf("B", firstBishop + 1);

		return firstBishop % 2 != secondBishop % 2;
	}
}
