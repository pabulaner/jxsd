package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.BlurEffectModel;
import org.docx4j.dml.CTBlurEffect;

public class BlurEffectConverter {
  private BlurEffectConverter() {
  }

  public static BlurEffectModel fromDocx4J(CTBlurEffect value) {
    if (value == null) return null;
    return new BlurEffectModel(PositiveCoordinateValueConverter.fromDocx4J(value.getRad()), BooleanValueConverter.fromDocx4J(value.isGrow()));
  }
}
