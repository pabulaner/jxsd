


public class CT_ForEachModel {




public class AlgOrshapeOrpresOfModel {


    private final Object value;

    public AlgOrshapeOrpresOfModel(CT_AlgorithmModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ShapeModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_PresentationOfModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ConstraintsModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_RulesModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ForEachModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_LayoutNodeModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_ChooseModel value) {
        this.value = value;
    }
    public AlgOrshapeOrpresOfModel(CT_OfficeArtExtensionListModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_AlgorithmModel getAlg() {
        return (CT_AlgorithmModel) value;
    }
    public CT_ShapeModel getShape() {
        return (CT_ShapeModel) value;
    }
    public CT_PresentationOfModel getPresOf() {
        return (CT_PresentationOfModel) value;
    }
    public CT_ConstraintsModel getConstrLst() {
        return (CT_ConstraintsModel) value;
    }
    public CT_RulesModel getRuleLst() {
        return (CT_RulesModel) value;
    }
    public CT_ForEachModel getForEach() {
        return (CT_ForEachModel) value;
    }
    public CT_LayoutNodeModel getLayoutNode() {
        return (CT_LayoutNodeModel) value;
    }
    public CT_ChooseModel getChoose() {
        return (CT_ChooseModel) value;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return (CT_OfficeArtExtensionListModel) value;
    }
}

    private final ST_IntsModel st;
    private final ST_AxisTypesModel axis;
    private final ST_ElementTypesModel ptType;
    private final ST_UnsignedIntsModel cnt;
    private final StringModel ref;
    private final ST_BooleansModel hideLastTrans;
    private final StringModel name;
    private final ST_IntsModel step;
    private final List<AlgOrshapeOrpresOfModel> algOrshapeOrpresOf;

    public CT_ForEachModel(ST_IntsModel st , ST_AxisTypesModel axis , ST_ElementTypesModel ptType , ST_UnsignedIntsModel cnt , StringModel ref , ST_BooleansModel hideLastTrans , StringModel name , ST_IntsModel step , List<AlgOrshapeOrpresOfModel> algOrshapeOrpresOf ) {
        this.st = st;
        this.axis = axis;
        this.ptType = ptType;
        this.cnt = cnt;
        this.ref = ref;
        this.hideLastTrans = hideLastTrans;
        this.name = name;
        this.step = step;
        this.algOrshapeOrpresOf = algOrshapeOrpresOf;
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
    public StringModel getRef() {
        return this.ref;
    }
    public ST_BooleansModel getHideLastTrans() {
        return this.hideLastTrans;
    }
    public StringModel getName() {
        return this.name;
    }
    public ST_IntsModel getStep() {
        return this.step;
    }
    public List<AlgOrshapeOrpresOfModel> getAlgOrshapeOrpresOf() {
        return this.algOrshapeOrpresOf;
    }
}