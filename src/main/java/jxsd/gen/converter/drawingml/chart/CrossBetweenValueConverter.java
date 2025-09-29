package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.CrossBetweenValueBuilder;
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
    if (value == CrossBetweenValueBuilder.BETWEEN) return CrossBetweenValueModel.BETWEEN;
    if (value == CrossBetweenValueBuilder.MID_CAT) return CrossBetweenValueModel.MID_CAT;
    return null;
  }

  public static STCrossBetween toDocx4j(CrossBetweenValueModel value) {
    if (value == null) return null;
    if (value == CrossBetweenValueModel.BETWEEN) return CrossBetweenValueBuilder.BETWEEN;
    if (value == CrossBetweenValueModel.MID_CAT) return CrossBetweenValueBuilder.MID_CAT;
    return null;
  }
}
