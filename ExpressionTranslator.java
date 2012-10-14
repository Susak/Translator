
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExpressionTranslator {
	URL url;
	String inputLine;
	String answer = "";
	
	String getTranslation(String expression) throws IOException {

		url = new URL(
				"http://translate.yandex.ru/tr.json/translate?lang=en-ru&text="
						+ expression);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				url.openStream(), "UTF-8"));

		if ((inputLine = in.readLine()) != null) {
			for (int i = 1; i < inputLine.length() - 1; i++) {
				answer += inputLine.charAt(i);
			}
		}

		in.close();

		return answer;
	}
}
