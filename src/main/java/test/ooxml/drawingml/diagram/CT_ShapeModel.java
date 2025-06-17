
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.diagram.ST_LayoutShapeTypeModel;
import test._2001.XMLSchema.IntModel;
import test.ooxml.officeDocument.relationships.ST_RelationshipIdModel;
import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.DoubleModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.diagram.CT_AdjLstModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_ShapeModel {


    private final BooleanModel hideGeom;
    private final ST_LayoutShapeTypeModel type;
    private final IntModel zOrderOff;
    private final ST_RelationshipIdModel blip;
    private final BooleanModel lkTxEntry;
    private final DoubleModel rot;
    private final BooleanModel blipPhldr;
    private final CT_AdjLstModel adjLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ShapeModel(BooleanModel hideGeom, ST_LayoutShapeTypeModel type, IntModel zOrderOff, ST_RelationshipIdModel blip, BooleanModel lkTxEntry, DoubleModel rot, BooleanModel blipPhldr, CT_AdjLstModel adjLst, CT_OfficeArtExtensionListModel extLst) {
        this.hideGeom = hideGeom;
        this.type = type;
        this.zOrderOff = zOrderOff;
        this.blip = blip;
        this.lkTxEntry = lkTxEntry;
        this.rot = rot;
        this.blipPhldr = blipPhldr;
        this.adjLst = adjLst;
        this.extLst = extLst;
    }

    public BooleanModel getHideGeom() {
        return this.hideGeom;
    }
    public ST_LayoutShapeTypeModel getType() {
        return this.type;
    }
    public IntModel getZOrderOff() {
        return this.zOrderOff;
    }
    public ST_RelationshipIdModel getBlip() {
        return this.blip;
    }
    public BooleanModel getLkTxEntry() {
        return this.lkTxEntry;
    }
    public DoubleModel getRot() {
        return this.rot;
    }
    public BooleanModel getBlipPhldr() {
        return this.blipPhldr;
    }
    public CT_AdjLstModel getAdjLst() {
        return this.adjLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
