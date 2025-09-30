package jxsd.gen.converter.drawingml.chart;

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
    if (value == STTickMark.CROSS) return TickMarkValueModel.CROSS;
    if (value == STTickMark.IN) return TickMarkValueModel.IN;
    if (value == STTickMark.NONE) return TickMarkValueModel.NONE;
    if (value == STTickMark.OUT) return TickMarkValueModel.OUT;
    return null;
  }

  public static STTickMark toDocx4j(TickMarkValueModel value) {
    if (value == null) return null;
    if (value == TickMarkValueModel.CROSS) return STTickMark.CROSS;
    if (value == TickMarkValueModel.IN) return STTickMark.IN;
    if (value == TickMarkValueModel.NONE) return STTickMark.NONE;
    if (value == TickMarkValueModel.OUT) return STTickMark.OUT;
    return null;
  }
}
