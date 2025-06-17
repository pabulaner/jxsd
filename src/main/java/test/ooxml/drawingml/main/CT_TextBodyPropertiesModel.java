
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextVertOverflowTypeModel;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_TextVerticalTypeModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextColumnCountModel;
import test.ooxml.drawingml.main.ST_AngleModel;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_PositiveCoordinate32Model;
import test.ooxml.drawingml.main.ST_TextWrappingTypeModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextHorzOverflowTypeModel;
import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_TextAnchoringTypeModel;
import test.ooxml.drawingml.main.CT_PresetTextShapeModel;
import test.ooxml.drawingml.main.CT_Scene3DModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_TextBodyPropertiesModel {


    private final BooleanModel compatLnSpc;
    private final ST_TextVertOverflowTypeModel vertOverflow;
    private final ST_Coordinate32Model bIns;
    private final ST_TextVerticalTypeModel vert;
    private final BooleanModel anchorCtr;
    private final ST_TextColumnCountModel numCol;
    private final ST_AngleModel rot;
    private final ST_Coordinate32Model tIns;
    private final ST_Coordinate32Model lIns;
    private final ST_PositiveCoordinate32Model spcCol;
    private final ST_TextWrappingTypeModel wrap;
    private final BooleanModel fromWordArt;
    private final BooleanModel spcFirstLastPara;
    private final BooleanModel upright;
    private final ST_TextHorzOverflowTypeModel horzOverflow;
    private final ST_Coordinate32Model rIns;
    private final BooleanModel rtlCol;
    private final BooleanModel forceAA;
    private final ST_TextAnchoringTypeModel anchor;
    private final CT_PresetTextShapeModel prstTxWarp;
    private final CT_Scene3DModel scene3d;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_TextBodyPropertiesModel(BooleanModel compatLnSpc, ST_TextVertOverflowTypeModel vertOverflow, ST_Coordinate32Model bIns, ST_TextVerticalTypeModel vert, BooleanModel anchorCtr, ST_TextColumnCountModel numCol, ST_AngleModel rot, ST_Coordinate32Model tIns, ST_Coordinate32Model lIns, ST_PositiveCoordinate32Model spcCol, ST_TextWrappingTypeModel wrap, BooleanModel fromWordArt, BooleanModel spcFirstLastPara, BooleanModel upright, ST_TextHorzOverflowTypeModel horzOverflow, ST_Coordinate32Model rIns, BooleanModel rtlCol, BooleanModel forceAA, ST_TextAnchoringTypeModel anchor, CT_PresetTextShapeModel prstTxWarp, CT_Scene3DModel scene3d, CT_OfficeArtExtensionListModel extLst) {
        this.compatLnSpc = compatLnSpc;
        this.vertOverflow = vertOverflow;
        this.bIns = bIns;
        this.vert = vert;
        this.anchorCtr = anchorCtr;
        this.numCol = numCol;
        this.rot = rot;
        this.tIns = tIns;
        this.lIns = lIns;
        this.spcCol = spcCol;
        this.wrap = wrap;
        this.fromWordArt = fromWordArt;
        this.spcFirstLastPara = spcFirstLastPara;
        this.upright = upright;
        this.horzOverflow = horzOverflow;
        this.rIns = rIns;
        this.rtlCol = rtlCol;
        this.forceAA = forceAA;
        this.anchor = anchor;
        this.prstTxWarp = prstTxWarp;
        this.scene3d = scene3d;
        this.extLst = extLst;
    }

    public BooleanModel getCompatLnSpc() {
        return this.compatLnSpc;
    }
    public ST_TextVertOverflowTypeModel getVertOverflow() {
        return this.vertOverflow;
    }
    public ST_Coordinate32Model getBIns() {
        return this.bIns;
    }
    public ST_TextVerticalTypeModel getVert() {
        return this.vert;
    }
    public BooleanModel getAnchorCtr() {
        return this.anchorCtr;
    }
    public ST_TextColumnCountModel getNumCol() {
        return this.numCol;
    }
    public ST_AngleModel getRot() {
        return this.rot;
    }
    public ST_Coordinate32Model getTIns() {
        return this.tIns;
    }
    public ST_Coordinate32Model getLIns() {
        return this.lIns;
    }
    public ST_PositiveCoordinate32Model getSpcCol() {
        return this.spcCol;
    }
    public ST_TextWrappingTypeModel getWrap() {
        return this.wrap;
    }
    public BooleanModel getFromWordArt() {
        return this.fromWordArt;
    }
    public BooleanModel getSpcFirstLastPara() {
        return this.spcFirstLastPara;
    }
    public BooleanModel getUpright() {
        return this.upright;
    }
    public ST_TextHorzOverflowTypeModel getHorzOverflow() {
        return this.horzOverflow;
    }
    public ST_Coordinate32Model getRIns() {
        return this.rIns;
    }
    public BooleanModel getRtlCol() {
        return this.rtlCol;
    }
    public BooleanModel getForceAA() {
        return this.forceAA;
    }
    public ST_TextAnchoringTypeModel getAnchor() {
        return this.anchor;
    }
    public CT_PresetTextShapeModel getPrstTxWarp() {
        return this.prstTxWarp;
    }
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
