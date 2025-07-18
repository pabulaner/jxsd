package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BubbleChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBubbleChart;

public class CT_BubbleChartConverter {
  private CT_BubbleChartConverter() {
  }

  public static CT_BubbleChartModel fromDocx4J(CTBubbleChart value) {
    if (value == null) return null;
    return new CT_BubbleChartModel(CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_BubbleSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_BooleanConverter.fromDocx4J(value.getBubble3D()), CT_BubbleScaleConverter.fromDocx4J(value.getBubbleScale()), CT_BooleanConverter.fromDocx4J(value.getShowNegBubbles()), CT_SizeRepresentsConverter.fromDocx4J(value.getSizeRepresents()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBubbleChart toDocx4J(CT_BubbleChartModel value) {
    return null;
  }
}
