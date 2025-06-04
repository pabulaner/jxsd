package io.github.pabulaner.jxsd.impl.out2;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaType;

import java.util.List;

public class Out2Parser {

    public void parse(List<IJavaModel> models) {
        models.forEach(model -> {
            switch (model) {
                case IJavaClass java -> parseClass(java);
                default -> {}
            }
        });
    }
    
    private void parseClass(IJavaClass java) {
        if (java.type().kind() == IJavaType.Kind.RESTRICTION) {
            System.out.println(java);
        }
    }
}
