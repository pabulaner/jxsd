
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_TextShapeTypeModel;
import test.ooxml.drawingml.main.CT_GeomGuideListModel;


public class CT_PresetTextShapeModel {


    private final ST_TextShapeTypeModel prst;
    private final CT_GeomGuideListModel avLst;

    public CT_PresetTextShapeModel(ST_TextShapeTypeModel prst, CT_GeomGuideListModel avLst) {
        this.prst = prst;
        this.avLst = avLst;
    }

    public ST_TextShapeTypeModel getPrst() {
        return this.prst;
    }
    public CT_GeomGuideListModel getAvLst() {
        return this.avLst;
    }
}
