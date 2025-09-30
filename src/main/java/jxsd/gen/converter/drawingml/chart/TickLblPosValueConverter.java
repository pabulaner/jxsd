package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickLblPosValueModel;
import org.docx4j.dml.chart.STTickLblPos;

/**
 * This is a generated enum class.
 */
public class TickLblPosValueConverter {
  private TickLblPosValueConverter() {
  }

  public static TickLblPosValueModel fromDocx4j(STTickLblPos value) {
    if (value == null) return null;
    if (value == STTickLblPos.HIGH) return TickLblPosValueModel.HIGH;
    if (value == STTickLblPos.LOW) return TickLblPosValueModel.LOW;
    if (value == STTickLblPos.NEXT_TO) return TickLblPosValueModel.NEXT_TO;
    if (value == STTickLblPos.NONE) return TickLblPosValueModel.NONE;
    return null;
  }

  public static STTickLblPos toDocx4j(TickLblPosValueModel value) {
    if (value == null) return null;
    if (value == TickLblPosValueModel.HIGH) return STTickLblPos.HIGH;
    if (value == TickLblPosValueModel.LOW) return STTickLblPos.LOW;
    if (value == TickLblPosValueModel.NEXT_TO) return STTickLblPos.NEXT_TO;
    if (value == TickLblPosValueModel.NONE) return STTickLblPos.NONE;
    return null;
  }
}
