package example1.helloworld.controller;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class HelloWorldActionIT {
	@Test
	public void test1() throws Exception {
		String url = "http://localhost:8080/hello.do";
		Document doc = Jsoup.parse(new URL(url), 5000);
		Elements elements = doc.select("body");
		String expected = elements.get(0).text();

		assertEquals("Hello World", expected);
	}

}
