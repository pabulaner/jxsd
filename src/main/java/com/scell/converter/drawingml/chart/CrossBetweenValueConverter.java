package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CrossBetweenValueModel;
import org.docx4j.dml.chart.STCrossBetween;

public class CrossBetweenValueConverter {
  private CrossBetweenValueConverter() {
  }

  public static CrossBetweenValueModel fromDocx4J(STCrossBetween value) {
    if (value == null) return null;
    if (value == STCrossBetween.BETWEEN) return CrossBetweenValueModel.BETWEEN;
    if (value == STCrossBetween.MID_CAT) return CrossBetweenValueModel.MID_CAT;
    return null;
  }
}
