
package test.ooxml.drawingml.main;

import test.ooxml.officeDocument.sharedTypes.ST_GuidModel;
import test.ooxml.drawingml.main.CT_TableStyleModel;


public class CT_TableStyleListModel {


    private final ST_GuidModel def;
    private final CT_TableStyleModel tblStyle;

    public CT_TableStyleListModel(ST_GuidModel def, CT_TableStyleModel tblStyle) {
        this.def = def;
        this.tblStyle = tblStyle;
    }

    public ST_GuidModel getDef() {
        return this.def;
    }
    public CT_TableStyleModel getTblStyle() {
        return this.tblStyle;
    }
}
