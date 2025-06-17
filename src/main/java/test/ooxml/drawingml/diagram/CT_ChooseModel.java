
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_WhenModel;
import test.ooxml.drawingml.diagram.CT_OtherwiseModel;


public class CT_ChooseModel {


    private final StringModel name;
    private final CT_WhenModel _if;
    private final CT_OtherwiseModel _else;

    public CT_ChooseModel(StringModel name, CT_WhenModel _if, CT_OtherwiseModel _else) {
        this.name = name;
        this._if = _if;
        this._else = _else;
    }

    public StringModel getName() {
        return this.name;
    }
    public CT_WhenModel getIf() {
        return this._if;
    }
    public CT_OtherwiseModel getElse() {
        return this._else;
    }
}
