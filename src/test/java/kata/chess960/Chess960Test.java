package kata.chess960;

import kata.chess960.rules.BishopRule;
import kata.chess960.rules.KingAndRooksRule;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Chess960Test {

	static final String KQRRNNBB = "KQRRNNBB";

	@Test
	void test_960() {
		// Arrange
		var chess960 = Chess960.builder().pieceSet(KQRRNNBB)
			.validationFunc(new KingAndRooksRule().and(new BishopRule()))
			.build();

		// Act
		var result = chess960.run();

		// Assert
		assertThat(result).hasSize(960);
	}
}