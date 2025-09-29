package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.BubbleChartModel;
import org.docx4j.dml.chart.CTBubbleChart;

/**
 * This is a generated sequence class.
 */
public class BubbleChartConverter {
  private BubbleChartConverter() {
  }

  public static BubbleChartModel fromDocx4j(CTBubbleChart value) {
    if (value == null) return null;
    return new BubbleChartModel(BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(BubbleSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), BooleanConverter.fromDocx4j(value.getBubble3D()), BubbleScaleConverter.fromDocx4j(value.getBubbleScale()), BooleanConverter.fromDocx4j(value.getShowNegBubbles()), SizeRepresentsConverter.fromDocx4j(value.getSizeRepresents()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBubbleChart toDocx4j(BubbleChartModel value) {
    if (value == null) return null;
    CTBubbleChart result = new CTBubbleChart();
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(BubbleSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setBubble3D(BooleanConverter.toDocx4j(value.getBubble3D()));
    result.setBubbleScale(BubbleScaleConverter.toDocx4j(value.getBubbleScale()));
    result.setShowNegBubbles(BooleanConverter.toDocx4j(value.getShowNegBubbles()));
    result.setSizeRepresents(SizeRepresentsConverter.toDocx4j(value.getSizeRepresents()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
