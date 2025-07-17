package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BubbleChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBubbleChart;

public class CT_BubbleChartConverter {
  private CT_BubbleChartConverter() {
  }

  public static CT_BubbleChartModel fromDocx4j(CTBubbleChart value) {
    if (value == null) return null;
    return new CT_BubbleChartModel(CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_BubbleSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_BooleanConverter.fromDocx4j(value.getBubble3D()), CT_BubbleScaleConverter.fromDocx4j(value.getBubbleScale()), CT_BooleanConverter.fromDocx4j(value.getShowNegBubbles()), CT_SizeRepresentsConverter.fromDocx4j(value.getSizeRepresents()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBubbleChart toDocx4j(CT_BubbleChartModel value) {
    return null;
  }
}
