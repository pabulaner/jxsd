package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TransformEffectModel;
import org.docx4j.dml.CTTransformEffect;

public class TransformEffectConverter {
  private TransformEffectConverter() {
  }

  public static TransformEffectModel fromDocx4J(CTTransformEffect value) {
    if (value == null) return null;
    return new TransformEffectModel(PercentageValueConverter.fromDocx4J(value.getSy()), FixedAngleValueConverter.fromDocx4J(value.getKy()), PercentageValueConverter.fromDocx4J(value.getSx()), CoordinateValueConverter.fromDocx4J(value.getTy()), FixedAngleValueConverter.fromDocx4J(value.getKx()), CoordinateValueConverter.fromDocx4J(value.getTx()));
  }
}
