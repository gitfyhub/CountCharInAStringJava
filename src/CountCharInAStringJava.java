public class CountCharInAStringJava {

	public static void main(String[] args) {

		String str = "Ibraheem";
		// String str = "cat";
		// String str = "Missisippi";
		// String str = "John";
		String Json = "{";

		str = str.toLowerCase();
		char[] wordCountTheLettersArray = str.toCharArray();
		char[] array = new char[26];
		int index = 0;

		for (char c = 'a'; c <= 'z'; c++) {
			array[index++] = c;
		}

		int wordCount = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < wordCountTheLettersArray.length; j++) {

				if (wordCountTheLettersArray[j] == array[i]) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				Json = Json + "\"" + array[i] + "\":\"" + wordCount + "\",";
			}
			wordCount = 0;
		}

		Json = (Json.substring(0, Json.length() - 1));
		Json = Json + "}";
		System.out.println(Json);
	}
}
