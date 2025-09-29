package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.StyleMatrixModel;
import org.docx4j.dml.CTStyleMatrix;

/**
 * This is a generated sequence class.
 */
public class StyleMatrixConverter {
  private StyleMatrixConverter() {
  }

  public static StyleMatrixModel fromDocx4j(CTStyleMatrix value) {
    if (value == null) return null;
    return new StyleMatrixModel(StringValueConverter.fromDocx4j(value.getName()), FillStyleListConverter.fromDocx4j(value.getFillStyleLst()), LineStyleListConverter.fromDocx4j(value.getLnStyleLst()), EffectStyleListConverter.fromDocx4j(value.getEffectStyleLst()), BackgroundFillStyleListConverter.fromDocx4j(value.getBgFillStyleLst()));
  }

  public static CTStyleMatrix toDocx4j(StyleMatrixModel value) {
    if (value == null) return null;
    CTStyleMatrix result = new CTStyleMatrix();
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    result.setFillStyleLst(FillStyleListConverter.toDocx4j(value.getFillStyleLst()));
    result.setLnStyleLst(LineStyleListConverter.toDocx4j(value.getLnStyleLst()));
    result.setEffectStyleLst(EffectStyleListConverter.toDocx4j(value.getEffectStyleLst()));
    result.setBgFillStyleLst(BackgroundFillStyleListConverter.toDocx4j(value.getBgFillStyleLst()));
    return result;
  }
}
