package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.StretchInfoPropertiesModel;
import org.docx4j.dml.CTStretchInfoProperties;

/**
 * This is a generated sequence class.
 */
public class StretchInfoPropertiesConverter {
  private StretchInfoPropertiesConverter() {
  }

  public static StretchInfoPropertiesModel fromDocx4j(CTStretchInfoProperties value) {
    if (value == null) return null;
    return new StretchInfoPropertiesModel(RelativeRectConverter.fromDocx4j(value.getFillRect()));
  }

  public static CTStretchInfoProperties toDocx4j(StretchInfoPropertiesModel value) {
    if (value == null) return null;
    CTStretchInfoProperties result = new CTStretchInfoProperties();
    result.setFillRect(RelativeRectConverter.toDocx4j(value.getFillRect()));
    return result;
  }
}
