
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_LineWidthModel;
import test.ooxml.drawingml.main.ST_LineCapModel;
import test.ooxml.drawingml.main.ST_CompoundLineModel;
import test.ooxml.drawingml.main.ST_PenAlignmentModel;
import test.ooxml.drawingml.main.CT_LineEndPropertiesModel;
import test.ooxml.drawingml.main.CT_LineEndPropertiesModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_LinePropertiesModel {


    private final ST_LineWidthModel w;
    private final ST_LineCapModel cap;
    private final ST_CompoundLineModel cmpd;
    private final ST_PenAlignmentModel algn;
    private final CT_LineEndPropertiesModel headEnd;
    private final CT_LineEndPropertiesModel tailEnd;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_LinePropertiesModel(ST_LineWidthModel w, ST_LineCapModel cap, ST_CompoundLineModel cmpd, ST_PenAlignmentModel algn, CT_LineEndPropertiesModel headEnd, CT_LineEndPropertiesModel tailEnd, CT_OfficeArtExtensionListModel extLst) {
        this.w = w;
        this.cap = cap;
        this.cmpd = cmpd;
        this.algn = algn;
        this.headEnd = headEnd;
        this.tailEnd = tailEnd;
        this.extLst = extLst;
    }

    public ST_LineWidthModel getW() {
        return this.w;
    }
    public ST_LineCapModel getCap() {
        return this.cap;
    }
    public ST_CompoundLineModel getCmpd() {
        return this.cmpd;
    }
    public ST_PenAlignmentModel getAlgn() {
        return this.algn;
    }
    public CT_LineEndPropertiesModel getHeadEnd() {
        return this.headEnd;
    }
    public CT_LineEndPropertiesModel getTailEnd() {
        return this.tailEnd;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
