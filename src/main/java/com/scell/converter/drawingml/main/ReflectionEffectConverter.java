package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.ReflectionEffectModel;
import org.docx4j.dml.CTReflectionEffect;

public class ReflectionEffectConverter {
  private ReflectionEffectConverter() {
  }

  public static ReflectionEffectModel fromDocx4J(CTReflectionEffect value) {
    if (value == null) return null;
    return new ReflectionEffectModel(PositiveCoordinateValueConverter.fromDocx4J(value.getBlurRad()), PositiveFixedPercentageValueConverter.fromDocx4J(value.getEndPos()), PercentageValueConverter.fromDocx4J(value.getSy()), FixedAngleValueConverter.fromDocx4J(value.getKx()), PositiveFixedPercentageValueConverter.fromDocx4J(value.getStA()), PositiveFixedPercentageValueConverter.fromDocx4J(value.getStPos()), RectAlignmentValueConverter.fromDocx4J(value.getAlgn()), PositiveCoordinateValueConverter.fromDocx4J(value.getDist()), BooleanValueConverter.fromDocx4J(value.isRotWithShape()), FixedAngleValueConverter.fromDocx4J(value.getKy()), PositiveFixedAngleValueConverter.fromDocx4J(value.getFadeDir()), PercentageValueConverter.fromDocx4J(value.getSx()), PositiveFixedAngleValueConverter.fromDocx4J(value.getDir()), PositiveFixedPercentageValueConverter.fromDocx4J(value.getEndA()));
  }
}
