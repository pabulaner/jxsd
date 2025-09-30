package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossBetweenValueModel;
import org.docx4j.dml.chart.STCrossBetween;

/**
 * This is a generated enum class.
 */
public class CrossBetweenValueConverter {
  private CrossBetweenValueConverter() {
  }

  public static CrossBetweenValueModel fromDocx4j(STCrossBetween value) {
    if (value == null) return null;
    if (value == STCrossBetween.BETWEEN) return CrossBetweenValueModel.BETWEEN;
    if (value == STCrossBetween.MID_CAT) return CrossBetweenValueModel.MID_CAT;
    return null;
  }

  public static STCrossBetween toDocx4j(CrossBetweenValueModel value) {
    if (value == null) return null;
    if (value == CrossBetweenValueModel.BETWEEN) return STCrossBetween.BETWEEN;
    if (value == CrossBetweenValueModel.MID_CAT) return STCrossBetween.MID_CAT;
    return null;
  }
}
