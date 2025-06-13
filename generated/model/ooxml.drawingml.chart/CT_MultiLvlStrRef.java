


public class CT_MultiLvlStrRefModel {


    private final StringModel f;
    private final CT_MultiLvlStrDataModel multiLvlStrCache;
    private final CT_ExtensionListModel extLst;

    public CT_MultiLvlStrRefModel(StringModel f , CT_MultiLvlStrDataModel multiLvlStrCache , CT_ExtensionListModel extLst ) {
        this.f = f;
        this.multiLvlStrCache = multiLvlStrCache;
        this.extLst = extLst;
    }

    public StringModel getF() {
        return this.f;
    }
    public CT_MultiLvlStrDataModel getMultiLvlStrCache() {
        return this.multiLvlStrCache;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}