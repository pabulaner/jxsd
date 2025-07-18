package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScatterChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterChart;

public class CT_ScatterChartConverter {
  private CT_ScatterChartConverter() {
  }

  public static CT_ScatterChartModel fromDocx4J(CTScatterChart value) {
    if (value == null) return null;
    return new CT_ScatterChartModel(CT_ScatterStyleConverter.fromDocx4J(value.getScatterStyle()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_ScatterSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTScatterChart toDocx4J(CT_ScatterChartModel value) {
    return null;
  }
}
