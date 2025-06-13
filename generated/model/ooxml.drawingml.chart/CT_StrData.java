


public class CT_StrDataModel {


    private final CT_UnsignedIntModel ptCount;
    private final List<CT_StrValModel> pt;
    private final CT_ExtensionListModel extLst;

    public CT_StrDataModel(CT_UnsignedIntModel ptCount , List<CT_StrValModel> pt , CT_ExtensionListModel extLst ) {
        this.ptCount = ptCount;
        this.pt = pt;
        this.extLst = extLst;
    }

    public CT_UnsignedIntModel getPtCount() {
        return this.ptCount;
    }
    public List<CT_StrValModel> getPt() {
        return this.pt;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}