package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndPropertiesModel;
import org.docx4j.dml.CTLineEndProperties;

/**
 * This is a generated sequence class.
 */
public class LineEndPropertiesConverter {
  private LineEndPropertiesConverter() {
  }

  public static LineEndPropertiesModel fromDocx4j(CTLineEndProperties value) {
    if (value == null) return null;
    return new LineEndPropertiesModel(LineEndTypeValueConverter.fromDocx4j(value.getType()), LineEndWidthValueConverter.fromDocx4j(value.getW()), LineEndLengthValueConverter.fromDocx4j(value.getLen()));
  }

  public static CTLineEndProperties toDocx4j(LineEndPropertiesModel value) {
    if (value == null) return null;
    CTLineEndProperties result = new CTLineEndProperties();
    result.setType(LineEndTypeValueConverter.toDocx4j(value.getType()));
    result.setW(LineEndWidthValueConverter.toDocx4j(value.getW()));
    result.setLen(LineEndLengthValueConverter.toDocx4j(value.getLen()));
    return result;
  }
}
