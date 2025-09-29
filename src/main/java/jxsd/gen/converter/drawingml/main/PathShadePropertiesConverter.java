package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PathShadePropertiesModel;
import org.docx4j.dml.CTPathShadeProperties;

/**
 * This is a generated sequence class.
 */
public class PathShadePropertiesConverter {
  private PathShadePropertiesConverter() {
  }

  public static PathShadePropertiesModel fromDocx4j(CTPathShadeProperties value) {
    if (value == null) return null;
    return new PathShadePropertiesModel(PathShadeTypeValueConverter.fromDocx4j(value.getPath()), RelativeRectConverter.fromDocx4j(value.getFillToRect()));
  }

  public static CTPathShadeProperties toDocx4j(PathShadePropertiesModel value) {
    if (value == null) return null;
    CTPathShadeProperties result = new CTPathShadeProperties();
    result.setPath(PathShadeTypeValueConverter.toDocx4j(value.getPath()));
    result.setFillToRect(RelativeRectConverter.toDocx4j(value.getFillToRect()));
    return result;
  }
}
