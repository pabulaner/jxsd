package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickMarkValueBuilder;
import jxsd.gen.model.drawingml.chart.TickMarkValueModel;
import org.docx4j.dml.chart.STTickMark;

/**
 * This is a generated enum class.
 */
public class TickMarkValueConverter {
  private TickMarkValueConverter() {
  }

  public static TickMarkValueModel fromDocx4j(STTickMark value) {
    if (value == null) return null;
    if (value == TickMarkValueBuilder.CROSS) return TickMarkValueModel.CROSS;
    if (value == TickMarkValueBuilder.IN) return TickMarkValueModel.IN;
    if (value == TickMarkValueBuilder.NONE) return TickMarkValueModel.NONE;
    if (value == TickMarkValueBuilder.OUT) return TickMarkValueModel.OUT;
    return null;
  }

  public static STTickMark toDocx4j(TickMarkValueModel value) {
    if (value == null) return null;
    if (value == TickMarkValueModel.CROSS) return TickMarkValueBuilder.CROSS;
    if (value == TickMarkValueModel.IN) return TickMarkValueBuilder.IN;
    if (value == TickMarkValueModel.NONE) return TickMarkValueBuilder.NONE;
    if (value == TickMarkValueModel.OUT) return TickMarkValueBuilder.OUT;
    return null;
  }
}
