package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ChartModel;
import org.docx4j.dml.chart.CTChart;

/**
 * This is a generated sequence class.
 */
public class ChartConverter {
  private ChartConverter() {
  }

  public static ChartModel fromDocx4j(CTChart value) {
    if (value == null) return null;
    return new ChartModel(TitleConverter.fromDocx4j(value.getTitle()), BooleanConverter.fromDocx4j(value.getAutoTitleDeleted()), PivotFmtsConverter.fromDocx4j(value.getPivotFmts()), View3DConverter.fromDocx4j(value.getView3D()), SurfaceConverter.fromDocx4j(value.getFloor()), SurfaceConverter.fromDocx4j(value.getSideWall()), SurfaceConverter.fromDocx4j(value.getBackWall()), PlotAreaConverter.fromDocx4j(value.getPlotArea()), LegendConverter.fromDocx4j(value.getLegend()), BooleanConverter.fromDocx4j(value.getPlotVisOnly()), DispBlanksAsConverter.fromDocx4j(value.getDispBlanksAs()), BooleanConverter.fromDocx4j(value.getShowDLblsOverMax()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTChart toDocx4j(ChartModel value) {
    if (value == null) return null;
    CTChart result = new CTChart();
    result.setTitle(TitleConverter.toDocx4j(value.getTitle()));
    result.setAutoTitleDeleted(BooleanConverter.toDocx4j(value.getAutoTitleDeleted()));
    result.setPivotFmts(PivotFmtsConverter.toDocx4j(value.getPivotFmts()));
    result.setView3D(View3DConverter.toDocx4j(value.getView3D()));
    result.setFloor(SurfaceConverter.toDocx4j(value.getFloor()));
    result.setSideWall(SurfaceConverter.toDocx4j(value.getSideWall()));
    result.setBackWall(SurfaceConverter.toDocx4j(value.getBackWall()));
    result.setPlotArea(PlotAreaConverter.toDocx4j(value.getPlotArea()));
    result.setLegend(LegendConverter.toDocx4j(value.getLegend()));
    result.setPlotVisOnly(BooleanConverter.toDocx4j(value.getPlotVisOnly()));
    result.setDispBlanksAs(DispBlanksAsConverter.toDocx4j(value.getDispBlanksAs()));
    result.setShowDLblsOverMax(BooleanConverter.toDocx4j(value.getShowDLblsOverMax()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
