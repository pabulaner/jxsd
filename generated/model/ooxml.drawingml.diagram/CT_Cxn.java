


public class CT_CxnModel {


    private final ST_ModelIdModel modelId;
    private final ST_CxnTypeModel type;
    private final ST_ModelIdModel destId;
    private final UnsignedIntModel srcOrd;
    private final ST_ModelIdModel parTransId;
    private final StringModel presId;
    private final ST_ModelIdModel sibTransId;
    private final UnsignedIntModel destOrd;
    private final ST_ModelIdModel srcId;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_CxnModel(ST_ModelIdModel modelId , ST_CxnTypeModel type , ST_ModelIdModel destId , UnsignedIntModel srcOrd , ST_ModelIdModel parTransId , StringModel presId , ST_ModelIdModel sibTransId , UnsignedIntModel destOrd , ST_ModelIdModel srcId , CT_OfficeArtExtensionListModel extLst ) {
        this.modelId = modelId;
        this.type = type;
        this.destId = destId;
        this.srcOrd = srcOrd;
        this.parTransId = parTransId;
        this.presId = presId;
        this.sibTransId = sibTransId;
        this.destOrd = destOrd;
        this.srcId = srcId;
        this.extLst = extLst;
    }

    public ST_ModelIdModel getModelId() {
        return this.modelId;
    }
    public ST_CxnTypeModel getType() {
        return this.type;
    }
    public ST_ModelIdModel getDestId() {
        return this.destId;
    }
    public UnsignedIntModel getSrcOrd() {
        return this.srcOrd;
    }
    public ST_ModelIdModel getParTransId() {
        return this.parTransId;
    }
    public StringModel getPresId() {
        return this.presId;
    }
    public ST_ModelIdModel getSibTransId() {
        return this.sibTransId;
    }
    public UnsignedIntModel getDestOrd() {
        return this.destOrd;
    }
    public ST_ModelIdModel getSrcId() {
        return this.srcId;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}