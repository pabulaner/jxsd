


public class CT_MultiLvlStrDataModel {


    private final CT_UnsignedIntModel ptCount;
    private final List<CT_LvlModel> lvl;
    private final CT_ExtensionListModel extLst;

    public CT_MultiLvlStrDataModel(CT_UnsignedIntModel ptCount , List<CT_LvlModel> lvl , CT_ExtensionListModel extLst ) {
        this.ptCount = ptCount;
        this.lvl = lvl;
        this.extLst = extLst;
    }

    public CT_UnsignedIntModel getPtCount() {
        return this.ptCount;
    }
    public List<CT_LvlModel> getLvl() {
        return this.lvl;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}