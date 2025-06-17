
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.IntModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_NameModel;
import test.ooxml.drawingml.diagram.CT_DescriptionModel;
import test.ooxml.drawingml.diagram.CT_CategoriesModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_DiagramDefinitionHeaderModel {


    private final StringModel uniqueId;
    private final StringModel defStyle;
    private final IntModel resId;
    private final StringModel minVer;
    private final CT_NameModel title;
    private final CT_DescriptionModel desc;
    private final CT_CategoriesModel catLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_DiagramDefinitionHeaderModel(StringModel uniqueId, StringModel defStyle, IntModel resId, StringModel minVer, CT_NameModel title, CT_DescriptionModel desc, CT_CategoriesModel catLst, CT_OfficeArtExtensionListModel extLst) {
        this.uniqueId = uniqueId;
        this.defStyle = defStyle;
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
    public StringModel getDefStyle() {
        return this.defStyle;
    }
    public IntModel getResId() {
        return this.resId;
    }
    public StringModel getMinVer() {
        return this.minVer;
    }
    public CT_NameModel getTitle() {
        return this.title;
    }
    public CT_DescriptionModel getDesc() {
        return this.desc;
    }
    public CT_CategoriesModel getCatLst() {
        return this.catLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
