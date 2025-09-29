package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TransformEffectModel;
import org.docx4j.dml.CTTransformEffect;

/**
 * This is a generated sequence class.
 */
public class TransformEffectConverter {
  private TransformEffectConverter() {
  }

  public static TransformEffectModel fromDocx4j(CTTransformEffect value) {
    if (value == null) return null;
    return new TransformEffectModel(PercentageValueConverter.fromDocx4j(value.getSy()), FixedAngleValueConverter.fromDocx4j(value.getKy()), PercentageValueConverter.fromDocx4j(value.getSx()), CoordinateValueConverter.fromDocx4j(value.getTy()), FixedAngleValueConverter.fromDocx4j(value.getKx()), CoordinateValueConverter.fromDocx4j(value.getTx()));
  }

  public static CTTransformEffect toDocx4j(TransformEffectModel value) {
    if (value == null) return null;
    CTTransformEffect result = new CTTransformEffect();
    result.setSy(PercentageValueConverter.toDocx4j(value.getSy()));
    result.setKy(FixedAngleValueConverter.toDocx4j(value.getKy()));
    result.setSx(PercentageValueConverter.toDocx4j(value.getSx()));
    result.setTy(CoordinateValueConverter.toDocx4j(value.getTy()));
    result.setKx(FixedAngleValueConverter.toDocx4j(value.getKx()));
    result.setTx(CoordinateValueConverter.toDocx4j(value.getTx()));
    return result;
  }
}
