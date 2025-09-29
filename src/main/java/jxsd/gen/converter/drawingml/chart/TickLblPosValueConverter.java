package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickLblPosValueBuilder;
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
    if (value == TickLblPosValueBuilder.HIGH) return TickLblPosValueModel.HIGH;
    if (value == TickLblPosValueBuilder.LOW) return TickLblPosValueModel.LOW;
    if (value == TickLblPosValueBuilder.NEXT_TO) return TickLblPosValueModel.NEXT_TO;
    if (value == TickLblPosValueBuilder.NONE) return TickLblPosValueModel.NONE;
    return null;
  }

  public static STTickLblPos toDocx4j(TickLblPosValueModel value) {
    if (value == null) return null;
    if (value == TickLblPosValueModel.HIGH) return TickLblPosValueBuilder.HIGH;
    if (value == TickLblPosValueModel.LOW) return TickLblPosValueBuilder.LOW;
    if (value == TickLblPosValueModel.NEXT_TO) return TickLblPosValueBuilder.NEXT_TO;
    if (value == TickLblPosValueModel.NONE) return TickLblPosValueBuilder.NONE;
    return null;
  }
}
