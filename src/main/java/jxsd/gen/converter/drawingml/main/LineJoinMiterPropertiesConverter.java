package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineJoinMiterPropertiesModel;
import org.docx4j.dml.CTLineJoinMiterProperties;

/**
 * This is a generated sequence class.
 */
public class LineJoinMiterPropertiesConverter {
  private LineJoinMiterPropertiesConverter() {
  }

  public static LineJoinMiterPropertiesModel fromDocx4j(CTLineJoinMiterProperties value) {
    if (value == null) return null;
    return new LineJoinMiterPropertiesModel(PositivePercentageValueConverter.fromDocx4j(value.getLim()));
  }

  public static CTLineJoinMiterProperties toDocx4j(LineJoinMiterPropertiesModel value) {
    if (value == null) return null;
    CTLineJoinMiterProperties result = new CTLineJoinMiterProperties();
    result.setLim(PositivePercentageValueConverter.toDocx4j(value.getLim()));
    return result;
  }
}
