


public class CT_AlgorithmModel {


    private final ST_AlgorithmTypeModel type;
    private final UnsignedIntModel rev;
    private final List<CT_ParameterModel> param;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_AlgorithmModel(ST_AlgorithmTypeModel type , UnsignedIntModel rev , List<CT_ParameterModel> param , CT_OfficeArtExtensionListModel extLst ) {
        this.type = type;
        this.rev = rev;
        this.param = param;
        this.extLst = extLst;
    }

    public ST_AlgorithmTypeModel getType() {
        return this.type;
    }
    public UnsignedIntModel getRev() {
        return this.rev;
    }
    public List<CT_ParameterModel> getParam() {
        return this.param;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}