


public class CT_ChartModel {


    private final CT_TitleModel title;
    private final CT_BooleanModel autoTitleDeleted;
    private final CT_PivotFmtsModel pivotFmts;
    private final CT_View3DModel view3D;
    private final CT_SurfaceModel floor;
    private final CT_SurfaceModel sideWall;
    private final CT_SurfaceModel backWall;
    private final CT_PlotAreaModel plotArea;
    private final CT_LegendModel legend;
    private final CT_BooleanModel plotVisOnly;
    private final CT_DispBlanksAsModel dispBlanksAs;
    private final CT_BooleanModel showDLblsOverMax;
    private final CT_ExtensionListModel extLst;

    public CT_ChartModel(CT_TitleModel title , CT_BooleanModel autoTitleDeleted , CT_PivotFmtsModel pivotFmts , CT_View3DModel view3D , CT_SurfaceModel floor , CT_SurfaceModel sideWall , CT_SurfaceModel backWall , CT_PlotAreaModel plotArea , CT_LegendModel legend , CT_BooleanModel plotVisOnly , CT_DispBlanksAsModel dispBlanksAs , CT_BooleanModel showDLblsOverMax , CT_ExtensionListModel extLst ) {
        this.title = title;
        this.autoTitleDeleted = autoTitleDeleted;
        this.pivotFmts = pivotFmts;
        this.view3D = view3D;
        this.floor = floor;
        this.sideWall = sideWall;
        this.backWall = backWall;
        this.plotArea = plotArea;
        this.legend = legend;
        this.plotVisOnly = plotVisOnly;
        this.dispBlanksAs = dispBlanksAs;
        this.showDLblsOverMax = showDLblsOverMax;
        this.extLst = extLst;
    }

    public CT_TitleModel getTitle() {
        return this.title;
    }
    public CT_BooleanModel getAutoTitleDeleted() {
        return this.autoTitleDeleted;
    }
    public CT_PivotFmtsModel getPivotFmts() {
        return this.pivotFmts;
    }
    public CT_View3DModel getView3D() {
        return this.view3D;
    }
    public CT_SurfaceModel getFloor() {
        return this.floor;
    }
    public CT_SurfaceModel getSideWall() {
        return this.sideWall;
    }
    public CT_SurfaceModel getBackWall() {
        return this.backWall;
    }
    public CT_PlotAreaModel getPlotArea() {
        return this.plotArea;
    }
    public CT_LegendModel getLegend() {
        return this.legend;
    }
    public CT_BooleanModel getPlotVisOnly() {
        return this.plotVisOnly;
    }
    public CT_DispBlanksAsModel getDispBlanksAs() {
        return this.dispBlanksAs;
    }
    public CT_BooleanModel getShowDLblsOverMax() {
        return this.showDLblsOverMax;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}