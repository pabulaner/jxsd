package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_PlotAreaModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPlotArea;

public class CT_PlotAreaConverter {
  private CT_PlotAreaConverter() {
  }

  public static CT_PlotAreaModel fromDocx4j(CTPlotArea value) {
    if (value == null) return null;
    return new CT_PlotAreaModel(CT_LayoutConverter.fromDocx4j(value.getLayout()), value.getAreaChartOrArea3DChartOrLineChart().stream().map(AreaChartOrArea3DChartOrLineChartConverter::fromDocx4j).collect(Collectors.toList()), value.getValAxOrCatAxOrDateAx().stream().map(ValAxOrCatAxOrDateAxConverter::fromDocx4j).collect(Collectors.toList()), CT_DTableConverter.fromDocx4j(value.getDTable()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPlotArea toDocx4j(CT_PlotAreaModel value) {
    return null;
  }

  public static class AreaChartOrArea3DChartOrLineChartConverter {
    private AreaChartOrArea3DChartOrLineChartConverter() {
    }

    public static CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel fromDocx4j(
        CTPlotArea.AreaChartOrArea3DChartOrLineChart value) {
      if (value == null) return null;
    }

    public static CTPlotArea.AreaChartOrArea3DChartOrLineChart toDocx4j(
        CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel value) {
      return null;
    }
  }

  public static class ValAxOrCatAxOrDateAxConverter {
    private ValAxOrCatAxOrDateAxConverter() {
    }

    public static CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel fromDocx4j(
        CTPlotArea.ValAxOrCatAxOrDateAx value) {
      if (value == null) return null;
    }

    public static CTPlotArea.ValAxOrCatAxOrDateAx toDocx4j(
        CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel value) {
      return null;
    }
  }
}
