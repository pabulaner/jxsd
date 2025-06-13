


public class CT_DLblsModel {




public class DeleteModel {


    private final Object value;

    public DeleteModel(CT_BooleanModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_BooleanModel getDelete() {
        return (CT_BooleanModel) value;
    }
}

    private final List<CT_DLblModel> dLbl;
    private final DeleteModel delete;
    private final CT_ExtensionListModel extLst;

    public CT_DLblsModel(List<CT_DLblModel> dLbl , DeleteModel delete , CT_ExtensionListModel extLst ) {
        this.dLbl = dLbl;
        this.delete = delete;
        this.extLst = extLst;
    }

    public List<CT_DLblModel> getDLbl() {
        return this.dLbl;
    }
    public DeleteModel getDelete() {
        return this.delete;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}