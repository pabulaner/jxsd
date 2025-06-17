
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_TextVerticalTypeModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextHorzOverflowTypeModel;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_TextAnchoringTypeModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_LinePropertiesModel;
import test.ooxml.drawingml.main.CT_Cell3DModel;
import test.ooxml.drawingml.main.CT_HeadersModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_TableCellPropertiesModel {


    private final ST_Coordinate32Model marR;
    private final ST_Coordinate32Model marB;
    private final ST_TextVerticalTypeModel vert;
    private final BooleanModel anchorCtr;
    private final ST_TextHorzOverflowTypeModel horzOverflow;
    private final ST_Coordinate32Model marL;
    private final ST_Coordinate32Model marT;
    private final ST_TextAnchoringTypeModel anchor;
    private final CT_LinePropertiesModel lnL;
    private final CT_LinePropertiesModel lnR;
    private final CT_LinePropertiesModel lnT;
    private final CT_LinePropertiesModel lnB;
    private final CT_LinePropertiesModel lnTlToBr;
    private final CT_LinePropertiesModel lnBlToTr;
    private final CT_Cell3DModel cell3D;
    private final CT_HeadersModel headers;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TableCellPropertiesModel(ST_Coordinate32Model marR, ST_Coordinate32Model marB, ST_TextVerticalTypeModel vert, BooleanModel anchorCtr, ST_TextHorzOverflowTypeModel horzOverflow, ST_Coordinate32Model marL, ST_Coordinate32Model marT, ST_TextAnchoringTypeModel anchor, CT_LinePropertiesModel lnL, CT_LinePropertiesModel lnR, CT_LinePropertiesModel lnT, CT_LinePropertiesModel lnB, CT_LinePropertiesModel lnTlToBr, CT_LinePropertiesModel lnBlToTr, CT_Cell3DModel cell3D, CT_HeadersModel headers, CT_OfficeArtExtensionListModel extLst) {
        this.marR = marR;
        this.marB = marB;
        this.vert = vert;
        this.anchorCtr = anchorCtr;
        this.horzOverflow = horzOverflow;
        this.marL = marL;
        this.marT = marT;
        this.anchor = anchor;
        this.lnL = lnL;
        this.lnR = lnR;
        this.lnT = lnT;
        this.lnB = lnB;
        this.lnTlToBr = lnTlToBr;
        this.lnBlToTr = lnBlToTr;
        this.cell3D = cell3D;
        this.headers = headers;
        this.extLst = extLst;
    }

    public ST_Coordinate32Model getMarR() {
        return this.marR;
    }
    public ST_Coordinate32Model getMarB() {
        return this.marB;
    }
    public ST_TextVerticalTypeModel getVert() {
        return this.vert;
    }
    public BooleanModel getAnchorCtr() {
        return this.anchorCtr;
    }
    public ST_TextHorzOverflowTypeModel getHorzOverflow() {
        return this.horzOverflow;
    }
    public ST_Coordinate32Model getMarL() {
        return this.marL;
    }
    public ST_Coordinate32Model getMarT() {
        return this.marT;
    }
    public ST_TextAnchoringTypeModel getAnchor() {
        return this.anchor;
    }
    public CT_LinePropertiesModel getLnL() {
        return this.lnL;
    }
    public CT_LinePropertiesModel getLnR() {
        return this.lnR;
    }
    public CT_LinePropertiesModel getLnT() {
        return this.lnT;
    }
    public CT_LinePropertiesModel getLnB() {
        return this.lnB;
    }
    public CT_LinePropertiesModel getLnTlToBr() {
        return this.lnTlToBr;
    }
    public CT_LinePropertiesModel getLnBlToTr() {
        return this.lnBlToTr;
    }
    public CT_Cell3DModel getCell3D() {
        return this.cell3D;
    }
    public CT_HeadersModel getHeaders() {
        return this.headers;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
