package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartModel;
import jxsd.gen.model.drawingml.chart.DispBlanksAsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LegendModel;
import jxsd.gen.model.drawingml.chart.PivotFmtsModel;
import jxsd.gen.model.drawingml.chart.PlotAreaModel;
import jxsd.gen.model.drawingml.chart.SurfaceModel;
import jxsd.gen.model.drawingml.chart.TitleModel;
import jxsd.gen.model.drawingml.chart.View3DModel;

/**
 * This is a generated sequence class.
 */
public class ChartBuilder {
  private TitleModel title;

  private BooleanModel autoTitleDeleted;

  private PivotFmtsModel pivotFmts;

  private View3DModel view3D;

  private SurfaceModel floor;

  private SurfaceModel sideWall;

  private SurfaceModel backWall;

  private PlotAreaModel plotArea;

  private LegendModel legend;

  private BooleanModel plotVisOnly;

  private DispBlanksAsModel dispBlanksAs;

  private BooleanModel showDLblsOverMax;

  private ExtensionListModel extLst;

  public ChartBuilder() {
  }

  public ChartBuilder setTitle(TitleModel title) {
    this.title = title;
    return this;
  }

  public ChartBuilder setAutoTitleDeleted(BooleanModel autoTitleDeleted) {
    this.autoTitleDeleted = autoTitleDeleted;
    return this;
  }

  public ChartBuilder setPivotFmts(PivotFmtsModel pivotFmts) {
    this.pivotFmts = pivotFmts;
    return this;
  }

  public ChartBuilder setView3D(View3DModel view3D) {
    this.view3D = view3D;
    return this;
  }

  public ChartBuilder setFloor(SurfaceModel floor) {
    this.floor = floor;
    return this;
  }

  public ChartBuilder setSideWall(SurfaceModel sideWall) {
    this.sideWall = sideWall;
    return this;
  }

  public ChartBuilder setBackWall(SurfaceModel backWall) {
    this.backWall = backWall;
    return this;
  }

  public ChartBuilder setPlotArea(PlotAreaModel plotArea) {
    this.plotArea = plotArea;
    return this;
  }

  public ChartBuilder setLegend(LegendModel legend) {
    this.legend = legend;
    return this;
  }

  public ChartBuilder setPlotVisOnly(BooleanModel plotVisOnly) {
    this.plotVisOnly = plotVisOnly;
    return this;
  }

  public ChartBuilder setDispBlanksAs(DispBlanksAsModel dispBlanksAs) {
    this.dispBlanksAs = dispBlanksAs;
    return this;
  }

  public ChartBuilder setShowDLblsOverMax(BooleanModel showDLblsOverMax) {
    this.showDLblsOverMax = showDLblsOverMax;
    return this;
  }

  public ChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ChartBuilder from(ChartModel value) {
    this.title = value.getTitle();
    this.autoTitleDeleted = value.getAutoTitleDeleted();
    this.pivotFmts = value.getPivotFmts();
    this.view3D = value.getView3D();
    this.floor = value.getFloor();
    this.sideWall = value.getSideWall();
    this.backWall = value.getBackWall();
    this.plotArea = value.getPlotArea();
    this.legend = value.getLegend();
    this.plotVisOnly = value.getPlotVisOnly();
    this.dispBlanksAs = value.getDispBlanksAs();
    this.showDLblsOverMax = value.getShowDLblsOverMax();
    this.extLst = value.getExtLst();
    return this;
  }

  public ChartModel build() {
    return new ChartModel(this.title, this.autoTitleDeleted, this.pivotFmts, this.view3D, this.floor, this.sideWall, this.backWall, this.plotArea, this.legend, this.plotVisOnly, this.dispBlanksAs, this.showDLblsOverMax, this.extLst);
  }
}
