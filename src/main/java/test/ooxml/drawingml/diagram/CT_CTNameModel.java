
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.StringModel;


public class CT_CTNameModel {


    private final StringModel lang;
    private final StringModel val;

    public CT_CTNameModel(StringModel lang, StringModel val) {
        this.lang = lang;
        this.val = val;
    }

    public StringModel getLang() {
        return this.lang;
    }
    public StringModel getVal() {
        return this.val;
    }
}
