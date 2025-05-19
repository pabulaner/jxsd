package io.github.pabulaner.jxsd.parser;

import com.sun.xml.xsom.XSAttributeUse;
import com.sun.xml.xsom.XSComplexType;
import com.sun.xml.xsom.XSContentType;
import com.sun.xml.xsom.XSParticle;
import com.sun.xml.xsom.XSTerm;
import io.github.pabulaner.jxsd.parser.model.FieldModel;
import io.github.pabulaner.jxsd.parser.model.Name;

import java.math.BigInteger;
import java.util.Collection;
import java.util.stream.Collectors;

public class ComplexParser extends Parser<XSComplexType> {

    public ComplexParser(ParserMap map) {
        super(map);
    }

    @Override
    public Result parse(XSComplexType xs) {
        XSContentType content = xs.getExplicitContent();
        Collection<FieldModel> fields = parseAttributes(xs.getAttributeUses());

        return null;
    }

    private Collection<FieldModel> parseAttributes(Collection<? extends XSAttributeUse> xs) {
        return xs.stream()
                .map(XSAttributeUse::getDecl)
                .map(decl -> new FieldModel(
                        new Name(decl.getName()),
                        ParserUtil.toName(decl.getType()),
                        ParserUtil.toName(decl.getDefaultValue())))
                .collect(Collectors.toList());
    }

    private Result parseParticle(XSParticle particle) {
        BigInteger min = particle.getMinOccurs();
        BigInteger max = particle.getMaxOccurs();
        XSTerm term = particle.getTerm();


    }
}
