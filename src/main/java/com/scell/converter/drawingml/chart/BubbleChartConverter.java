package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBubbleChart;

public class BubbleChartConverter {
  private BubbleChartConverter() {
  }

  public static BubbleChartModel fromDocx4J(CTBubbleChart value) {
    if (value == null) return null;
    return new BubbleChartModel(BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(BubbleSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), BooleanConverter.fromDocx4J(value.getBubble3D()), BubbleScaleConverter.fromDocx4J(value.getBubbleScale()), BooleanConverter.fromDocx4J(value.getShowNegBubbles()), SizeRepresentsConverter.fromDocx4J(value.getSizeRepresents()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
