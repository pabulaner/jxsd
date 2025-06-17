
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TablePropertiesModel;
import test.ooxml.drawingml.main.CT_TableGridModel;
import test.ooxml.drawingml.main.CT_TableRowModel;


public class CT_TableModel {


    private final CT_TablePropertiesModel tblPr;
    private final CT_TableGridModel tblGrid;
    private final CT_TableRowModel tr;

    public CT_TableModel(CT_TablePropertiesModel tblPr, CT_TableGridModel tblGrid, CT_TableRowModel tr) {
        this.tblPr = tblPr;
        this.tblGrid = tblGrid;
        this.tr = tr;
    }

    public CT_TablePropertiesModel getTblPr() {
        return this.tblPr;
    }
    public CT_TableGridModel getTblGrid() {
        return this.tblGrid;
    }
    public CT_TableRowModel getTr() {
        return this.tr;
    }
}
