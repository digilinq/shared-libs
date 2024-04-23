package com.eightbits.shared.web.traverse;

import java.io.IOException;
import java.util.Set;

public interface TraverseStrategy {

    Set<String> traverse(String url) throws IOException;

}
