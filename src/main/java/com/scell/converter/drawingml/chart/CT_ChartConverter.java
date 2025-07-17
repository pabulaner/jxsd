package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ChartModel;
import org.docx4j.dml.chart.CTChart;

public class CT_ChartConverter {
  private CT_ChartConverter() {
  }

  public static CT_ChartModel fromDocx4j(CTChart value) {
    if (value == null) return null;
    return new CT_ChartModel(CT_TitleConverter.fromDocx4j(value.getTitle()), CT_BooleanConverter.fromDocx4j(value.getAutoTitleDeleted()), CT_PivotFmtsConverter.fromDocx4j(value.getPivotFmts()), CT_View3DConverter.fromDocx4j(value.getView3D()), CT_SurfaceConverter.fromDocx4j(value.getFloor()), CT_SurfaceConverter.fromDocx4j(value.getSideWall()), CT_SurfaceConverter.fromDocx4j(value.getBackWall()), CT_PlotAreaConverter.fromDocx4j(value.getPlotArea()), CT_LegendConverter.fromDocx4j(value.getLegend()), CT_BooleanConverter.fromDocx4j(value.getPlotVisOnly()), CT_DispBlanksAsConverter.fromDocx4j(value.getDispBlanksAs()), CT_BooleanConverter.fromDocx4j(value.getShowDLblsOverMax()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTChart toDocx4j(CT_ChartModel value) {
    return null;
  }
}
