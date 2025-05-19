package io.github.pabulaner.jxsd.api.input;

import java.math.BigInteger;

public interface IElement extends IHasType {

    BigInteger getMinOccurs();

    BigInteger getMaxOccurs();
}
