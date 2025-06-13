


public class CT_LegendEntryModel {




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

    private final CT_UnsignedIntModel idx;
    private final DeleteModel delete;
    private final CT_ExtensionListModel extLst;

    public CT_LegendEntryModel(CT_UnsignedIntModel idx , DeleteModel delete , CT_ExtensionListModel extLst ) {
        this.idx = idx;
        this.delete = delete;
        this.extLst = extLst;
    }

    public CT_UnsignedIntModel getIdx() {
        return this.idx;
    }
    public DeleteModel getDelete() {
        return this.delete;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}