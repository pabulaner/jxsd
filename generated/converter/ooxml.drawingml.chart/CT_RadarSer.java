


public class CT_RadarSerModel {


    private final CT_MarkerModel marker;
    private final List<CT_DPtModel> dPt;
    private final CT_DLblsModel dLbls;
    private final CT_AxDataSourceModel cat;
    private final CT_NumDataSourceModel val;
    private final CT_ExtensionListModel extLst;

    public CT_RadarSerModel(CT_MarkerModel marker , List<CT_DPtModel> dPt , CT_DLblsModel dLbls , CT_AxDataSourceModel cat , CT_NumDataSourceModel val , CT_ExtensionListModel extLst ) {
        this.marker = marker;
        this.dPt = dPt;
        this.dLbls = dLbls;
        this.cat = cat;
        this.val = val;
        this.extLst = extLst;
    }

    public CT_MarkerModel getMarker() {
        return this.marker;
    }
    public List<CT_DPtModel> getDPt() {
        return this.dPt;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_AxDataSourceModel getCat() {
        return this.cat;
    }
    public CT_NumDataSourceModel getVal() {
        return this.val;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}