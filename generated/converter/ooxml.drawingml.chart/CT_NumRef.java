


public class CT_NumRefModel {


    private final StringModel f;
    private final CT_NumDataModel numCache;
    private final CT_ExtensionListModel extLst;

    public CT_NumRefModel(StringModel f , CT_NumDataModel numCache , CT_ExtensionListModel extLst ) {
        this.f = f;
        this.numCache = numCache;
        this.extLst = extLst;
    }

    public StringModel getF() {
        return this.f;
    }
    public CT_NumDataModel getNumCache() {
        return this.numCache;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}