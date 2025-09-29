package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import org.docx4j.dml.CTPatternFillProperties;

/**
 * This is a generated sequence class.
 */
public class PatternFillPropertiesConverter {
  private PatternFillPropertiesConverter() {
  }

  public static PatternFillPropertiesModel fromDocx4j(CTPatternFillProperties value) {
    if (value == null) return null;
    return new PatternFillPropertiesModel(PresetPatternValValueConverter.fromDocx4j(value.getPrst()), ColorConverter.fromDocx4j(value.getFgClr()), ColorConverter.fromDocx4j(value.getBgClr()));
  }

  public static CTPatternFillProperties toDocx4j(PatternFillPropertiesModel value) {
    if (value == null) return null;
    CTPatternFillProperties result = new CTPatternFillProperties();
    result.setPrst(PresetPatternValValueConverter.toDocx4j(value.getPrst()));
    result.setFgClr(ColorConverter.toDocx4j(value.getFgClr()));
    result.setBgClr(ColorConverter.toDocx4j(value.getBgClr()));
    return result;
  }
}
