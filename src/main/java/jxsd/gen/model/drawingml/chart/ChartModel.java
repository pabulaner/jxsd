package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ChartBuilder;

/**
 * This is a generated sequence class.
 */
public class ChartModel {
  private final TitleModel title;

  private final BooleanModel autoTitleDeleted;

  private final PivotFmtsModel pivotFmts;

  private final View3DModel view3D;

  private final SurfaceModel floor;

  private final SurfaceModel sideWall;

  private final SurfaceModel backWall;

  private final PlotAreaModel plotArea;

  private final LegendModel legend;

  private final BooleanModel plotVisOnly;

  private final DispBlanksAsModel dispBlanksAs;

  private final BooleanModel showDLblsOverMax;

  private final ExtensionListModel extLst;

  public ChartModel(TitleModel title, BooleanModel autoTitleDeleted, PivotFmtsModel pivotFmts,
      View3DModel view3D, SurfaceModel floor, SurfaceModel sideWall, SurfaceModel backWall,
      PlotAreaModel plotArea, LegendModel legend, BooleanModel plotVisOnly,
      DispBlanksAsModel dispBlanksAs, BooleanModel showDLblsOverMax, ExtensionListModel extLst) {
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

  public ChartBuilder builder() {
    return new ChartBuilder().from(this);
  }

  public TitleModel getTitle() {
    return this.title;
  }

  public BooleanModel getAutoTitleDeleted() {
    return this.autoTitleDeleted;
  }

  public PivotFmtsModel getPivotFmts() {
    return this.pivotFmts;
  }

  public View3DModel getView3D() {
    return this.view3D;
  }

  public SurfaceModel getFloor() {
    return this.floor;
  }

  public SurfaceModel getSideWall() {
    return this.sideWall;
  }

  public SurfaceModel getBackWall() {
    return this.backWall;
  }

  public PlotAreaModel getPlotArea() {
    return this.plotArea;
  }

  public LegendModel getLegend() {
    return this.legend;
  }

  public BooleanModel getPlotVisOnly() {
    return this.plotVisOnly;
  }

  public DispBlanksAsModel getDispBlanksAs() {
    return this.dispBlanksAs;
  }

  public BooleanModel getShowDLblsOverMax() {
    return this.showDLblsOverMax;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
