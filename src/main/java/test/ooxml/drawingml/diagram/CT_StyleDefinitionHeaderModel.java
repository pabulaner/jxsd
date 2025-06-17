
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.IntModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_SDNameModel;
import test.ooxml.drawingml.diagram.CT_SDDescriptionModel;
import test.ooxml.drawingml.diagram.CT_SDCategoriesModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_StyleDefinitionHeaderModel {


    private final StringModel uniqueId;
    private final IntModel resId;
    private final StringModel minVer;
    private final CT_SDNameModel title;
    private final CT_SDDescriptionModel desc;
    private final CT_SDCategoriesModel catLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_StyleDefinitionHeaderModel(StringModel uniqueId, IntModel resId, StringModel minVer, CT_SDNameModel title, CT_SDDescriptionModel desc, CT_SDCategoriesModel catLst, CT_OfficeArtExtensionListModel extLst) {
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
    public CT_SDNameModel getTitle() {
        return this.title;
    }
    public CT_SDDescriptionModel getDesc() {
        return this.desc;
    }
    public CT_SDCategoriesModel getCatLst() {
        return this.catLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
