


public class CT_LayoutNodeModel {




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
    public AlgOrshapeOrpresOfModel(CT_LayoutVariablePropertySetModel value) {
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
    public CT_LayoutVariablePropertySetModel getVarLst() {
        return (CT_LayoutVariablePropertySetModel) value;
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

    private final StringModel styleLbl;
    private final StringModel moveWith;
    private final ST_ChildOrderTypeModel chOrder;
    private final StringModel name;
    private final List<AlgOrshapeOrpresOfModel> algOrshapeOrpresOf;

    public CT_LayoutNodeModel(StringModel styleLbl , StringModel moveWith , ST_ChildOrderTypeModel chOrder , StringModel name , List<AlgOrshapeOrpresOfModel> algOrshapeOrpresOf ) {
        this.styleLbl = styleLbl;
        this.moveWith = moveWith;
        this.chOrder = chOrder;
        this.name = name;
        this.algOrshapeOrpresOf = algOrshapeOrpresOf;
    }

    public StringModel getStyleLbl() {
        return this.styleLbl;
    }
    public StringModel getMoveWith() {
        return this.moveWith;
    }
    public ST_ChildOrderTypeModel getChOrder() {
        return this.chOrder;
    }
    public StringModel getName() {
        return this.name;
    }
    public List<AlgOrshapeOrpresOfModel> getAlgOrshapeOrpresOf() {
        return this.algOrshapeOrpresOf;
    }
}