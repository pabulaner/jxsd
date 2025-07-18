package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ChartModel;
import org.docx4j.dml.chart.CTChart;

public class CT_ChartConverter {
  private CT_ChartConverter() {
  }

  public static CT_ChartModel fromDocx4J(CTChart value) {
    if (value == null) return null;
    return new CT_ChartModel(CT_TitleConverter.fromDocx4J(value.getTitle()), CT_BooleanConverter.fromDocx4J(value.getAutoTitleDeleted()), CT_PivotFmtsConverter.fromDocx4J(value.getPivotFmts()), CT_View3DConverter.fromDocx4J(value.getView3D()), CT_SurfaceConverter.fromDocx4J(value.getFloor()), CT_SurfaceConverter.fromDocx4J(value.getSideWall()), CT_SurfaceConverter.fromDocx4J(value.getBackWall()), CT_PlotAreaConverter.fromDocx4J(value.getPlotArea()), CT_LegendConverter.fromDocx4J(value.getLegend()), CT_BooleanConverter.fromDocx4J(value.getPlotVisOnly()), CT_DispBlanksAsConverter.fromDocx4J(value.getDispBlanksAs()), CT_BooleanConverter.fromDocx4J(value.getShowDLblsOverMax()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTChart toDocx4J(CT_ChartModel value) {
    return null;
  }
}
