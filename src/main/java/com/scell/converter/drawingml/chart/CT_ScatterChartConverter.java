package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScatterChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterChart;

public class CT_ScatterChartConverter {
  private CT_ScatterChartConverter() {
  }

  public static CT_ScatterChartModel fromDocx4j(CTScatterChart value) {
    if (value == null) return null;
    return new CT_ScatterChartModel(CT_ScatterStyleConverter.fromDocx4j(value.getScatterStyle()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_ScatterSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScatterChart toDocx4j(CT_ScatterChartModel value) {
    return null;
  }
}
