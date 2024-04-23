package com.eightbits.shared.web.traverse;

import java.io.IOException;
import java.util.Set;

public class WebTraversal {
    private final TraverseStrategy strategy;

    WebTraversal(TraverseStrategy strategy) {
        this.strategy = strategy;
    }

    public Set<String> traverse(String url) throws IOException {
        return strategy.traverse(url);
    }
}

