package com.eightbits.shared.web.traverse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BreadthFirstTraverseStrategy implements TraverseStrategy {

    private final Logger log = LoggerFactory.getLogger(BreadthFirstTraverseStrategy.class);

    private final Set<String> visited = new HashSet<>();

    @Override
    public Set<String> traverse(String url) throws IOException {

        log.info("Traversing: " + url);

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");
        links.forEach(link -> {
            String href = link.attr("href");
            log.info("Link: " + href);
            if (href.endsWith(".xsd")) {
                log.info("Downloading: " + href);
//                try {
//                    Jsoup.connect(url + href).ignoreContentType(true).execute().bodyAsBytes();
//                } catch (IOException e) {
//                    getLog().error("Error downloading: " + href, e);
//                }
            }
        });
        return null;
    }
}
