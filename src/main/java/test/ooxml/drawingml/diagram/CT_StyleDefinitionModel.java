
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.diagram.CT_SDNameModel;
import test.ooxml.drawingml.diagram.CT_SDDescriptionModel;
import test.ooxml.drawingml.diagram.CT_SDCategoriesModel;
import test.ooxml.drawingml.main.CT_Scene3DModel;
import test.ooxml.drawingml.diagram.CT_StyleLabelModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_StyleDefinitionModel {


    private final StringModel uniqueId;
    private final StringModel minVer;
    private final CT_SDNameModel title;
    private final CT_SDDescriptionModel desc;
    private final CT_SDCategoriesModel catLst;
    private final CT_Scene3DModel scene3d;
    private final CT_StyleLabelModel styleLbl;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_StyleDefinitionModel(StringModel uniqueId, StringModel minVer, CT_SDNameModel title, CT_SDDescriptionModel desc, CT_SDCategoriesModel catLst, CT_Scene3DModel scene3d, CT_StyleLabelModel styleLbl, CT_OfficeArtExtensionListModel extLst) {
        this.uniqueId = uniqueId;
        this.minVer = minVer;
        this.title = title;
        this.desc = desc;
        this.catLst = catLst;
        this.scene3d = scene3d;
        this.styleLbl = styleLbl;
        this.extLst = extLst;
    }

    public StringModel getUniqueId() {
        return this.uniqueId;
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
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_StyleLabelModel getStyleLbl() {
        return this.styleLbl;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
