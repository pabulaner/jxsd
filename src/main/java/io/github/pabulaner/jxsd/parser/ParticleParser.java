package io.github.pabulaner.jxsd.parser;

import com.sun.xml.xsom.XSElementDecl;
import com.sun.xml.xsom.XSModelGroup;
import com.sun.xml.xsom.XSTerm;
import io.github.pabulaner.jxsd.parser.model.FieldModel;
import io.github.pabulaner.jxsd.parser.model.Model;
import io.github.pabulaner.jxsd.parser.model.Name;

public class ParticleParser extends Parser<XSTerm>  {

    public ParticleParser(ParserMap map) {
        super(map);
    }

    @Override
    public Result parse(XSTerm xs) {
        Model model = null;

        if (xs.isElementDecl()) {
            XSElementDecl decl = xs.asElementDecl();
            model = new FieldModel(
                    new Name(decl.getName()),
                    ParserUtil.toName(decl.getType()),
                    ParserUtil.toName(decl.getDefaultValue()));
        }

        if (xs.isModelGroup()) {
            XSModelGroup group = xs.asModelGroup();
        }

        return new Result(model);
    }
}
