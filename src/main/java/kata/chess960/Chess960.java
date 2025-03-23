package kata.chess960;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

@Builder
@AllArgsConstructor
public class Chess960 {

	private final String pieceSet;
	private final Predicate<String> validationFunc;

	public List<String> run() {
		Set<String> result = new HashSet<>();
		permute("", pieceSet, result);
		return result.stream().filter(validationFunc).toList();
	}

	private static void permute(String prefix, String remaining, Set<String> result) {
		if (remaining.isEmpty()) {
			result.add(prefix);
		} else {
			for (int i = 0; i < remaining.length(); i++) {
				char ch = remaining.charAt(i);
				String newPrefix = prefix + ch;
				String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
				permute(newPrefix, newRemaining, result);
			}
		}
	}
}
