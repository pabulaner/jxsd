package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartModel;
import com.scell.model.drawingml.chart.CT_DispBlanksAsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LegendModel;
import com.scell.model.drawingml.chart.CT_PivotFmtsModel;
import com.scell.model.drawingml.chart.CT_PlotAreaModel;
import com.scell.model.drawingml.chart.CT_SurfaceModel;
import com.scell.model.drawingml.chart.CT_TitleModel;
import com.scell.model.drawingml.chart.CT_View3DModel;

public class CT_ChartBuilder {
  private CT_TitleModel title;

  private CT_BooleanModel autoTitleDeleted;

  private CT_PivotFmtsModel pivotFmts;

  private CT_View3DModel view3D;

  private CT_SurfaceModel floor;

  private CT_SurfaceModel sideWall;

  private CT_SurfaceModel backWall;

  private CT_PlotAreaModel plotArea;

  private CT_LegendModel legend;

  private CT_BooleanModel plotVisOnly;

  private CT_DispBlanksAsModel dispBlanksAs;

  private CT_BooleanModel showDLblsOverMax;

  private CT_ExtensionListModel extLst;

  public CT_ChartBuilder() {
  }

  public CT_ChartBuilder setTitle(CT_TitleModel title) {
    this.title = title;
    return this;
  }

  public CT_ChartBuilder setAutoTitleDeleted(CT_BooleanModel autoTitleDeleted) {
    this.autoTitleDeleted = autoTitleDeleted;
    return this;
  }

  public CT_ChartBuilder setPivotFmts(CT_PivotFmtsModel pivotFmts) {
    this.pivotFmts = pivotFmts;
    return this;
  }

  public CT_ChartBuilder setView3D(CT_View3DModel view3D) {
    this.view3D = view3D;
    return this;
  }

  public CT_ChartBuilder setFloor(CT_SurfaceModel floor) {
    this.floor = floor;
    return this;
  }

  public CT_ChartBuilder setSideWall(CT_SurfaceModel sideWall) {
    this.sideWall = sideWall;
    return this;
  }

  public CT_ChartBuilder setBackWall(CT_SurfaceModel backWall) {
    this.backWall = backWall;
    return this;
  }

  public CT_ChartBuilder setPlotArea(CT_PlotAreaModel plotArea) {
    this.plotArea = plotArea;
    return this;
  }

  public CT_ChartBuilder setLegend(CT_LegendModel legend) {
    this.legend = legend;
    return this;
  }

  public CT_ChartBuilder setPlotVisOnly(CT_BooleanModel plotVisOnly) {
    this.plotVisOnly = plotVisOnly;
    return this;
  }

  public CT_ChartBuilder setDispBlanksAs(CT_DispBlanksAsModel dispBlanksAs) {
    this.dispBlanksAs = dispBlanksAs;
    return this;
  }

  public CT_ChartBuilder setShowDLblsOverMax(CT_BooleanModel showDLblsOverMax) {
    this.showDLblsOverMax = showDLblsOverMax;
    return this;
  }

  public CT_ChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ChartModel build() {
    return new CT_ChartModel(this.title, this.autoTitleDeleted, this.pivotFmts, this.view3D, this.floor, this.sideWall, this.backWall, this.plotArea, this.legend, this.plotVisOnly, this.dispBlanksAs, this.showDLblsOverMax, this.extLst);
  }

  public CT_ChartBuilder from(CT_ChartModel value) {
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
}
