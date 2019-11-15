package ec.devsu.code.jam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compressor {

	private String unCompressedText;

	public Compressor(String unCompressedText) {
		
		this.unCompressedText = unCompressedText;
	}

	public String compress() {
		String compressedText = "";
		if (this.unCompressedText == null || this.unCompressedText.isEmpty()) {
			return unCompressedText;
		}
		validate(unCompressedText);
		char[] characters = unCompressedText.toCharArray();
		compressedText = compressText(compressedText, characters);
		return compressedText;
	}

	private String compressText(String compressedText, char[] characters) {
		char token = characters[0];
		int counter = 0;
		for (char c : characters) {
			if (c == token) {
				counter++;
			} else {
				compressedText += (counter == 1) ? String.valueOf(token)
						: String.valueOf(token) + String.valueOf(counter);
				counter = 1;
				token = c;
			}
		}
		compressedText += (counter == 1) ? String.valueOf(token) : String.valueOf(token) + String.valueOf(counter);
		return compressedText;
	}

	private void validate(String unCompressedText) throws RuntimeException {
		Stream<Character> stream = unCompressedText.chars().mapToObj(c -> (char) c);
		List<Character> listaNumero = stream.filter(c -> Character.isDigit(c)).collect(Collectors.toList());
		if (!listaNumero.isEmpty()) {
			throw new RuntimeException("The following text has numbers, therefore it's has an invalid format");
		}

	}

}
