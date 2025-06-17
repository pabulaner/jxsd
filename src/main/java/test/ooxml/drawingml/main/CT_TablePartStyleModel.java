
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TableStyleTextStyleModel;
import test.ooxml.drawingml.main.CT_TableStyleCellStyleModel;


public class CT_TablePartStyleModel {


    private final CT_TableStyleTextStyleModel tcTxStyle;
    private final CT_TableStyleCellStyleModel tcStyle;

    public CT_TablePartStyleModel(CT_TableStyleTextStyleModel tcTxStyle, CT_TableStyleCellStyleModel tcStyle) {
        this.tcTxStyle = tcTxStyle;
        this.tcStyle = tcStyle;
    }

    public CT_TableStyleTextStyleModel getTcTxStyle() {
        return this.tcTxStyle;
    }
    public CT_TableStyleCellStyleModel getTcStyle() {
        return this.tcStyle;
    }
}
