


public class CT_PtModel {


    private final ST_ModelIdModel modelId;
    private final ST_PtTypeModel type;
    private final ST_ModelIdModel cxnId;
    private final CT_ElemPropSetModel prSet;
    private final CT_ShapePropertiesModel spPr;
    private final CT_TextBodyModel t;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_PtModel(ST_ModelIdModel modelId , ST_PtTypeModel type , ST_ModelIdModel cxnId , CT_ElemPropSetModel prSet , CT_ShapePropertiesModel spPr , CT_TextBodyModel t , CT_OfficeArtExtensionListModel extLst ) {
        this.modelId = modelId;
        this.type = type;
        this.cxnId = cxnId;
        this.prSet = prSet;
        this.spPr = spPr;
        this.t = t;
        this.extLst = extLst;
    }

    public ST_ModelIdModel getModelId() {
        return this.modelId;
    }
    public ST_PtTypeModel getType() {
        return this.type;
    }
    public ST_ModelIdModel getCxnId() {
        return this.cxnId;
    }
    public CT_ElemPropSetModel getPrSet() {
        return this.prSet;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_TextBodyModel getT() {
        return this.t;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}