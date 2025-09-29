package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.RegularTextRunModel;
import org.docx4j.dml.CTRegularTextRun;

/**
 * This is a generated sequence class.
 */
public class RegularTextRunConverter {
  private RegularTextRunConverter() {
  }

  public static RegularTextRunModel fromDocx4j(CTRegularTextRun value) {
    if (value == null) return null;
    return new RegularTextRunModel(TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()), StringValueConverter.fromDocx4j(value.getT()));
  }

  public static CTRegularTextRun toDocx4j(RegularTextRunModel value) {
    if (value == null) return null;
    CTRegularTextRun result = new CTRegularTextRun();
    result.setRPr(TextCharacterPropertiesConverter.toDocx4j(value.getRPr()));
    result.setT(StringValueConverter.toDocx4j(value.getT()));
    return result;
  }
}
