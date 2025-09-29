package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.LongValueConverter;
import jxsd.gen.model.drawingml.main.RatioModel;
import org.docx4j.dml.CTRatio;

/**
 * This is a generated sequence class.
 */
public class RatioConverter {
  private RatioConverter() {
  }

  public static RatioModel fromDocx4j(CTRatio value) {
    if (value == null) return null;
    return new RatioModel(LongValueConverter.fromDocx4j(value.getN()), LongValueConverter.fromDocx4j(value.getD()));
  }

  public static CTRatio toDocx4j(RatioModel value) {
    if (value == null) return null;
    CTRatio result = new CTRatio();
    result.setN(LongValueConverter.toDocx4j(value.getN()));
    result.setD(LongValueConverter.toDocx4j(value.getD()));
    return result;
  }
}
