package com.fcs.services;

import java.io.IOException;
import java.sql.Timestamp;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import com.google.api.client.util.Sleeper;

public class Crawl {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		Document doc = Jsoup.connect("https://libraries.io/platforms").get();
		Elements elements = doc.select(".platform .blurb");
		for (Element element : elements) {
			System.out.println(element.selectFirst("a").text());
			System.out.println(element.selectFirst("small").text());
		}
		*/
		
		/*
		Document doc = Jsoup.connect("https://libraries.io/search?order=desc&page=1&platforms=Maven&sort=rank").get();
		Elements elements = doc.select(".project");
		for (Element element : elements) {
			System.out.println(element.selectFirst("a").text());
			System.out.println(element.children().select("div").text());
			System.out.println(element.selectFirst("small").text());
			System.out.println("===");
		}
		*/
		/*
		Document doc = Jsoup.connect("https://libraries.io/maven/io.dropwizard:dropwizard-metrics").get();
		String release = doc.selectFirst("h1 small").text();
		String description = doc.selectFirst(".col-md-8 p").text();		
		Elements links = doc.select(".col-md-8 .project-links a");
		Elements keywords = doc.select(".col-md-8 dl dd").first().select("a");
		Elements licenses = doc.select(".col-md-8 dl dd").last().select("a");

		String readme = doc.selectFirst("#readme article").removeAttr("class").outerHtml();
		
		Elements sidebar = doc.select(".sidebar");

		Element rank = sidebar.get(1);
		System.out.println(rank.select("dl").last());
		*/
		/*
		long time = 1421021237000000L;
		Timestamp stamp = new Timestamp(time/1000);		
		System.out.println(stamp);
		*/
		for (int i = 256; i < 260; i++) {
			Connection connection = Jsoup.connect("http://localhost:8080/welcome").data("page", String.valueOf(i));
			connection.method(Method.GET);
			Response response = connection.execute();
			System.out.println("page:"+i+"|response:"+response.statusCode());
			if(i%10==0) {
				System.out.println("sleep");
				Thread.sleep(60*1000*3);
			}
		}
		
	}
}
