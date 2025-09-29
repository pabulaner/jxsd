package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.TextBodyModel;
import org.docx4j.dml.CTTextBody;

/**
 * This is a generated sequence class.
 */
public class TextBodyConverter {
  private TextBodyConverter() {
  }

  public static TextBodyModel fromDocx4j(CTTextBody value) {
    if (value == null) return null;
    return new TextBodyModel(TextBodyPropertiesConverter.fromDocx4j(value.getBodyPr()), TextListStyleConverter.fromDocx4j(value.getLstStyle()), value.getP().stream().map(TextParagraphConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTTextBody toDocx4j(TextBodyModel value) {
    if (value == null) return null;
    CTTextBody result = new CTTextBody();
    result.setBodyPr(TextBodyPropertiesConverter.toDocx4j(value.getBodyPr()));
    result.setLstStyle(TextListStyleConverter.toDocx4j(value.getLstStyle()));
    result.getP().addAll(value.getP().stream().map(TextParagraphConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
