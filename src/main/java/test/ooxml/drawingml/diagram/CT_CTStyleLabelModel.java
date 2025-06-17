
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.diagram.CT_ColorsModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_CTStyleLabelModel {


    private final StringModel name;
    private final CT_ColorsModel fillClrLst;
    private final CT_ColorsModel linClrLst;
    private final CT_ColorsModel effectClrLst;
    private final CT_ColorsModel txLinClrLst;
    private final CT_ColorsModel txFillClrLst;
    private final CT_ColorsModel txEffectClrLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_CTStyleLabelModel(StringModel name, CT_ColorsModel fillClrLst, CT_ColorsModel linClrLst, CT_ColorsModel effectClrLst, CT_ColorsModel txLinClrLst, CT_ColorsModel txFillClrLst, CT_ColorsModel txEffectClrLst, CT_OfficeArtExtensionListModel extLst) {
        this.name = name;
        this.fillClrLst = fillClrLst;
        this.linClrLst = linClrLst;
        this.effectClrLst = effectClrLst;
        this.txLinClrLst = txLinClrLst;
        this.txFillClrLst = txFillClrLst;
        this.txEffectClrLst = txEffectClrLst;
        this.extLst = extLst;
    }

    public StringModel getName() {
        return this.name;
    }
    public CT_ColorsModel getFillClrLst() {
        return this.fillClrLst;
    }
    public CT_ColorsModel getLinClrLst() {
        return this.linClrLst;
    }
    public CT_ColorsModel getEffectClrLst() {
        return this.effectClrLst;
    }
    public CT_ColorsModel getTxLinClrLst() {
        return this.txLinClrLst;
    }
    public CT_ColorsModel getTxFillClrLst() {
        return this.txFillClrLst;
    }
    public CT_ColorsModel getTxEffectClrLst() {
        return this.txEffectClrLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
