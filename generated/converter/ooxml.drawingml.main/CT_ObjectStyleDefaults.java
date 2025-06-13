


public class CT_ObjectStyleDefaultsModel {


    private final CT_DefaultShapeDefinitionModel spDef;
    private final CT_DefaultShapeDefinitionModel lnDef;
    private final CT_DefaultShapeDefinitionModel txDef;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_ObjectStyleDefaultsModel(CT_DefaultShapeDefinitionModel spDef , CT_DefaultShapeDefinitionModel lnDef , CT_DefaultShapeDefinitionModel txDef , CT_OfficeArtExtensionListModel extLst ) {
        this.spDef = spDef;
        this.lnDef = lnDef;
        this.txDef = txDef;
        this.extLst = extLst;
    }

    public CT_DefaultShapeDefinitionModel getSpDef() {
        return this.spDef;
    }
    public CT_DefaultShapeDefinitionModel getLnDef() {
        return this.lnDef;
    }
    public CT_DefaultShapeDefinitionModel getTxDef() {
        return this.txDef;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}