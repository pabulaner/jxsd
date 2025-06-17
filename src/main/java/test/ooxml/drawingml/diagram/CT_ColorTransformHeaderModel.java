
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.IntModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_CTNameModel;
import test.ooxml.drawingml.diagram.CT_CTDescriptionModel;
import test.ooxml.drawingml.diagram.CT_CTCategoriesModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_ColorTransformHeaderModel {


    private final StringModel uniqueId;
    private final IntModel resId;
    private final StringModel minVer;
    private final CT_CTNameModel title;
    private final CT_CTDescriptionModel desc;
    private final CT_CTCategoriesModel catLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ColorTransformHeaderModel(StringModel uniqueId, IntModel resId, StringModel minVer, CT_CTNameModel title, CT_CTDescriptionModel desc, CT_CTCategoriesModel catLst, CT_OfficeArtExtensionListModel extLst) {
        this.uniqueId = uniqueId;
        this.resId = resId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
    }
    public IntModel getResId() {
        return this.resId;
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
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
