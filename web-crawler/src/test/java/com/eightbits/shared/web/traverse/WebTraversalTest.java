package com.eightbits.shared.web.traverse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

class WebTraversalTest {

    private static final String BASE_URL = "http://www.gdsregistry.org/3.1/schemas/";

    private WebTraversal webTraversal = new WebTraversal(new BreadthFirstTraverseStrategy());

    @Test
    void shouldDownloadGS1Schema() throws IOException {
        URL url = new URL(BASE_URL);
        url.openConnection();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    @Test
    void givenJsoup_when_then() throws IOException {
        webTraversal.traverse(BASE_URL);
    }
}
