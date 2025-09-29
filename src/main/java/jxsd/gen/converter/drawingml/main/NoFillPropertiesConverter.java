package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import org.docx4j.dml.CTNoFillProperties;

/**
 * This is a generated sequence class.
 */
public class NoFillPropertiesConverter {
  private NoFillPropertiesConverter() {
  }

  public static NoFillPropertiesModel fromDocx4j(CTNoFillProperties value) {
    if (value == null) return null;
    return new NoFillPropertiesModel();
  }

  public static CTNoFillProperties toDocx4j(NoFillPropertiesModel value) {
    if (value == null) return null;
    CTNoFillProperties result = new CTNoFillProperties();
    return result;
  }
}
