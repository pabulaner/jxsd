


public class CT_GvmlGroupShapeModel {




public class TxSpOrspOrcxnSpModel {


    private final Object value;

    public TxSpOrspOrcxnSpModel(CT_GvmlTextShapeModel value) {
        this.value = value;
    }
    public TxSpOrspOrcxnSpModel(CT_GvmlShapeModel value) {
        this.value = value;
    }
    public TxSpOrspOrcxnSpModel(CT_GvmlConnectorModel value) {
        this.value = value;
    }
    public TxSpOrspOrcxnSpModel(CT_GvmlPictureModel value) {
        this.value = value;
    }
    public TxSpOrspOrcxnSpModel(CT_GvmlGraphicalObjectFrameModel value) {
        this.value = value;
    }
    public TxSpOrspOrcxnSpModel(CT_GvmlGroupShapeModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_GvmlTextShapeModel getTxSp() {
        return (CT_GvmlTextShapeModel) value;
    }
    public CT_GvmlShapeModel getSp() {
        return (CT_GvmlShapeModel) value;
    }
    public CT_GvmlConnectorModel getCxnSp() {
        return (CT_GvmlConnectorModel) value;
    }
    public CT_GvmlPictureModel getPic() {
        return (CT_GvmlPictureModel) value;
    }
    public CT_GvmlGraphicalObjectFrameModel getGraphicFrame() {
        return (CT_GvmlGraphicalObjectFrameModel) value;
    }
    public CT_GvmlGroupShapeModel getGrpSp() {
        return (CT_GvmlGroupShapeModel) value;
    }
}

    private final CT_GvmlGroupShapeNonVisualModel nvGrpSpPr;
    private final CT_GroupShapePropertiesModel grpSpPr;
    private final List<TxSpOrspOrcxnSpModel> txSpOrspOrcxnSp;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlGroupShapeModel(CT_GvmlGroupShapeNonVisualModel nvGrpSpPr , CT_GroupShapePropertiesModel grpSpPr , List<TxSpOrspOrcxnSpModel> txSpOrspOrcxnSp , CT_OfficeArtExtensionListModel extLst ) {
        this.nvGrpSpPr = nvGrpSpPr;
        this.grpSpPr = grpSpPr;
        this.txSpOrspOrcxnSp = txSpOrspOrcxnSp;
        this.extLst = extLst;
    }

    public CT_GvmlGroupShapeNonVisualModel getNvGrpSpPr() {
        return this.nvGrpSpPr;
    }
    public CT_GroupShapePropertiesModel getGrpSpPr() {
        return this.grpSpPr;
    }
    public List<TxSpOrspOrcxnSpModel> getTxSpOrspOrcxnSp() {
        return this.txSpOrspOrcxnSp;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}