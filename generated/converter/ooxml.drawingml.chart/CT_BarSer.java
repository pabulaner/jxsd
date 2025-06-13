


public class CT_BarSerModel {


    private final CT_BooleanModel invertIfNegative;
    private final CT_PictureOptionsModel pictureOptions;
    private final List<CT_DPtModel> dPt;
    private final CT_DLblsModel dLbls;
    private final List<CT_TrendlineModel> trendline;
    private final CT_ErrBarsModel errBars;
    private final CT_AxDataSourceModel cat;
    private final CT_NumDataSourceModel val;
    private final CT_ShapeModel shape;
    private final CT_ExtensionListModel extLst;

    public CT_BarSerModel(CT_BooleanModel invertIfNegative , CT_PictureOptionsModel pictureOptions , List<CT_DPtModel> dPt , CT_DLblsModel dLbls , List<CT_TrendlineModel> trendline , CT_ErrBarsModel errBars , CT_AxDataSourceModel cat , CT_NumDataSourceModel val , CT_ShapeModel shape , CT_ExtensionListModel extLst ) {
        this.invertIfNegative = invertIfNegative;
        this.pictureOptions = pictureOptions;
        this.dPt = dPt;
        this.dLbls = dLbls;
        this.trendline = trendline;
        this.errBars = errBars;
        this.cat = cat;
        this.val = val;
        this.shape = shape;
        this.extLst = extLst;
    }

    public CT_BooleanModel getInvertIfNegative() {
        return this.invertIfNegative;
    }
    public CT_PictureOptionsModel getPictureOptions() {
        return this.pictureOptions;
    }
    public List<CT_DPtModel> getDPt() {
        return this.dPt;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public List<CT_TrendlineModel> getTrendline() {
        return this.trendline;
    }
    public CT_ErrBarsModel getErrBars() {
        return this.errBars;
    }
    public CT_AxDataSourceModel getCat() {
        return this.cat;
    }
    public CT_NumDataSourceModel getVal() {
        return this.val;
    }
    public CT_ShapeModel getShape() {
        return this.shape;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}