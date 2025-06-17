
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_EffectContainerTypeModel;
import test._2001.XMLSchema.TokenModel;


public class CT_EffectContainerModel {


    private final ST_EffectContainerTypeModel type;
    private final TokenModel name;

    public CT_EffectContainerModel(ST_EffectContainerTypeModel type, TokenModel name) {
        this.type = type;
        this.name = name;
    }

    public ST_EffectContainerTypeModel getType() {
        return this.type;
    }
    public TokenModel getName() {
        return this.name;
    }
}
