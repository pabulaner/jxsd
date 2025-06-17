
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_CoordinateModel;
import test.ooxml.drawingml.main.CT_TableCellModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_TableRowModel {


    private final ST_CoordinateModel h;
    private final CT_TableCellModel tc;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableRowModel(ST_CoordinateModel h, CT_TableCellModel tc, CT_OfficeArtExtensionListModel extLst) {
        this.h = h;
        this.tc = tc;
        this.extLst = extLst;
    }

    public ST_CoordinateModel getH() {
        return this.h;
    }
    public CT_TableCellModel getTc() {
        return this.tc;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
