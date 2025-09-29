package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.RelativeOffsetEffectModel;
import org.docx4j.dml.CTRelativeOffsetEffect;

/**
 * This is a generated sequence class.
 */
public class RelativeOffsetEffectConverter {
  private RelativeOffsetEffectConverter() {
  }

  public static RelativeOffsetEffectModel fromDocx4j(CTRelativeOffsetEffect value) {
    if (value == null) return null;
    return new RelativeOffsetEffectModel(PercentageValueConverter.fromDocx4j(value.getTy()), PercentageValueConverter.fromDocx4j(value.getTx()));
  }

  public static CTRelativeOffsetEffect toDocx4j(RelativeOffsetEffectModel value) {
    if (value == null) return null;
    CTRelativeOffsetEffect result = new CTRelativeOffsetEffect();
    result.setTy(PercentageValueConverter.toDocx4j(value.getTy()));
    result.setTx(PercentageValueConverter.toDocx4j(value.getTx()));
    return result;
  }
}
