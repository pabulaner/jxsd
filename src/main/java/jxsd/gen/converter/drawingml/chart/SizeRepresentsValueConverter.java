package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SizeRepresentsValueModel;
import org.docx4j.dml.chart.STSizeRepresents;

/**
 * This is a generated enum class.
 */
public class SizeRepresentsValueConverter {
  private SizeRepresentsValueConverter() {
  }

  public static SizeRepresentsValueModel fromDocx4j(STSizeRepresents value) {
    if (value == null) return null;
    if (value == STSizeRepresents.AREA) return SizeRepresentsValueModel.AREA;
    if (value == STSizeRepresents.W) return SizeRepresentsValueModel.W;
    return null;
  }

  public static STSizeRepresents toDocx4j(SizeRepresentsValueModel value) {
    if (value == null) return null;
    if (value == SizeRepresentsValueModel.AREA) return STSizeRepresents.AREA;
    if (value == SizeRepresentsValueModel.W) return STSizeRepresents.W;
    return null;
  }
}
