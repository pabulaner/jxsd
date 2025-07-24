package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ChartModel;
import org.docx4j.dml.chart.CTChart;

public class ChartConverter {
  private ChartConverter() {
  }

  public static ChartModel fromDocx4J(CTChart value) {
    if (value == null) return null;
    return new ChartModel(TitleConverter.fromDocx4J(value.getTitle()), BooleanConverter.fromDocx4J(value.getAutoTitleDeleted()), PivotFmtsConverter.fromDocx4J(value.getPivotFmts()), View3DConverter.fromDocx4J(value.getView3D()), SurfaceConverter.fromDocx4J(value.getFloor()), SurfaceConverter.fromDocx4J(value.getSideWall()), SurfaceConverter.fromDocx4J(value.getBackWall()), PlotAreaConverter.fromDocx4J(value.getPlotArea()), LegendConverter.fromDocx4J(value.getLegend()), BooleanConverter.fromDocx4J(value.getPlotVisOnly()), DispBlanksAsConverter.fromDocx4J(value.getDispBlanksAs()), BooleanConverter.fromDocx4J(value.getShowDLblsOverMax()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
