
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_CTNameModel;
import test.ooxml.drawingml.diagram.CT_CTDescriptionModel;
import test.ooxml.drawingml.diagram.CT_CTCategoriesModel;
import test.ooxml.drawingml.diagram.CT_CTStyleLabelModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_ColorTransformModel {


    private final StringModel uniqueId;
    private final StringModel minVer;
    private final CT_CTNameModel title;
    private final CT_CTDescriptionModel desc;
    private final CT_CTCategoriesModel catLst;
    private final CT_CTStyleLabelModel styleLbl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ColorTransformModel(StringModel uniqueId, StringModel minVer, CT_CTNameModel title, CT_CTDescriptionModel desc, CT_CTCategoriesModel catLst, CT_CTStyleLabelModel styleLbl, CT_OfficeArtExtensionListModel extLst) {
        this.uniqueId = uniqueId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.styleLbl = styleLbl;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
    }
    public StringModel getMinVer() {
        return this.minVer;
    }
    public CT_CTNameModel getTitle() {
        return this.title;
    }
    public CT_CTDescriptionModel getDesc() {
        return this.desc;
    }
    public CT_CTCategoriesModel getCatLst() {
        return this.catLst;
    }
    public CT_CTStyleLabelModel getStyleLbl() {
        return this.styleLbl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
