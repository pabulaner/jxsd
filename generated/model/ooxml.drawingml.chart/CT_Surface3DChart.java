


public class CT_Surface3DChartModel {


    private final List<CT_UnsignedIntModel> axId;
    private final CT_ExtensionListModel extLst;

    public CT_Surface3DChartModel(List<CT_UnsignedIntModel> axId , CT_ExtensionListModel extLst ) {
        this.axId = axId;
        this.extLst = extLst;
    }

    public List<CT_UnsignedIntModel> getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}