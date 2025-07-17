package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ReflectionEffectModel;
import org.docx4j.dml.CTReflectionEffect;

public class CT_ReflectionEffectConverter {
  private CT_ReflectionEffectConverter() {
  }

  public static CT_ReflectionEffectModel fromDocx4j(CTReflectionEffect value) {
    if (value == null) return null;
    return new CT_ReflectionEffectModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getBlurRad()), ST_PositiveFixedPercentageConverter.fromDocx4j(value.getEndPos()), ST_PercentageConverter.fromDocx4j(value.getSy()), ST_FixedAngleConverter.fromDocx4j(value.getKx()), ST_PositiveFixedPercentageConverter.fromDocx4j(value.getStA()), ST_PositiveFixedPercentageConverter.fromDocx4j(value.getStPos()), ST_RectAlignmentConverter.fromDocx4j(value.getAlgn()), ST_PositiveCoordinateConverter.fromDocx4j(value.getDist()), BooleanConverter.fromDocx4j(value.getRotWithShape()), ST_FixedAngleConverter.fromDocx4j(value.getKy()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getFadeDir()), ST_PercentageConverter.fromDocx4j(value.getSx()), ST_PositiveFixedAngleConverter.fromDocx4j(value.getDir()), ST_PositiveFixedPercentageConverter.fromDocx4j(value.getEndA()));
  }

  public static CTReflectionEffect toDocx4j(CT_ReflectionEffectModel value) {
    return null;
  }
}
