package io.github.pabulaner.jxsd.api.out;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.api.java.IJavaClass;

public interface IOutStage {

    TypeSpec.Builder process(IJavaClass java);
}
