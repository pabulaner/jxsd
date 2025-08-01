package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TintEffectModel;
import org.docx4j.dml.CTTintEffect;

public class TintEffectConverter {
  private TintEffectConverter() {
  }

  public static TintEffectModel fromDocx4J(CTTintEffect value) {
    if (value == null) return null;
    return new TintEffectModel(PositiveFixedAngleValueConverter.fromDocx4J(value.getHue()), FixedPercentageValueConverter.fromDocx4J(value.getAmt()));
  }
}
