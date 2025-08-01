package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.RelativeOffsetEffectModel;
import org.docx4j.dml.CTRelativeOffsetEffect;

public class RelativeOffsetEffectConverter {
  private RelativeOffsetEffectConverter() {
  }

  public static RelativeOffsetEffectModel fromDocx4J(CTRelativeOffsetEffect value) {
    if (value == null) return null;
    return new RelativeOffsetEffectModel(PercentageValueConverter.fromDocx4J(value.getTy()), PercentageValueConverter.fromDocx4J(value.getTx()));
  }
}
