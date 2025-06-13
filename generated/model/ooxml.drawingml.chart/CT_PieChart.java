


public class CT_PieChartModel {


    private final CT_FirstSliceAngModel firstSliceAng;
    private final CT_ExtensionListModel extLst;

    public CT_PieChartModel(CT_FirstSliceAngModel firstSliceAng , CT_ExtensionListModel extLst ) {
        this.firstSliceAng = firstSliceAng;
        this.extLst = extLst;
    }

    public CT_FirstSliceAngModel getFirstSliceAng() {
        return this.firstSliceAng;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}