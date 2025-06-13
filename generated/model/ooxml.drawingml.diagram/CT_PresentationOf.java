


public class CT_PresentationOfModel {


    private final ST_IntsModel st;
    private final ST_AxisTypesModel axis;
    private final ST_ElementTypesModel ptType;
    private final ST_UnsignedIntsModel cnt;
    private final ST_BooleansModel hideLastTrans;
    private final ST_IntsModel step;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_PresentationOfModel(ST_IntsModel st , ST_AxisTypesModel axis , ST_ElementTypesModel ptType , ST_UnsignedIntsModel cnt , ST_BooleansModel hideLastTrans , ST_IntsModel step , CT_OfficeArtExtensionListModel extLst ) {
        this.st = st;
        this.axis = axis;
        this.ptType = ptType;
        this.cnt = cnt;
        this.hideLastTrans = hideLastTrans;
        this.step = step;
        this.extLst = extLst;
    }

    public ST_IntsModel getSt() {
        return this.st;
    }
    public ST_AxisTypesModel getAxis() {
        return this.axis;
    }
    public ST_ElementTypesModel getPtType() {
        return this.ptType;
    }
    public ST_UnsignedIntsModel getCnt() {
        return this.cnt;
    }
    public ST_BooleansModel getHideLastTrans() {
        return this.hideLastTrans;
    }
    public ST_IntsModel getStep() {
        return this.step;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}