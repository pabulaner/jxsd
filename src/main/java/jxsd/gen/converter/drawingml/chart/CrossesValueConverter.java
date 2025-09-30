package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossesValueModel;
import org.docx4j.dml.chart.STCrosses;

/**
 * This is a generated enum class.
 */
public class CrossesValueConverter {
  private CrossesValueConverter() {
  }

  public static CrossesValueModel fromDocx4j(STCrosses value) {
    if (value == null) return null;
    if (value == STCrosses.AUTO_ZERO) return CrossesValueModel.AUTO_ZERO;
    if (value == STCrosses.MAX) return CrossesValueModel.MAX;
    if (value == STCrosses.MIN) return CrossesValueModel.MIN;
    return null;
  }

  public static STCrosses toDocx4j(CrossesValueModel value) {
    if (value == null) return null;
    if (value == CrossesValueModel.AUTO_ZERO) return STCrosses.AUTO_ZERO;
    if (value == CrossesValueModel.MAX) return STCrosses.MAX;
    if (value == CrossesValueModel.MIN) return STCrosses.MIN;
    return null;
  }
}
