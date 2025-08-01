package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PathShadePropertiesModel;
import org.docx4j.dml.CTPathShadeProperties;

public class PathShadePropertiesConverter {
  private PathShadePropertiesConverter() {
  }

  public static PathShadePropertiesModel fromDocx4J(CTPathShadeProperties value) {
    if (value == null) return null;
    return new PathShadePropertiesModel(PathShadeTypeValueConverter.fromDocx4J(value.getPath()), RelativeRectConverter.fromDocx4J(value.getFillToRect()));
  }
}
