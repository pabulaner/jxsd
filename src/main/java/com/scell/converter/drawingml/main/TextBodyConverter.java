package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBodyModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextBody;

public class TextBodyConverter {
  private TextBodyConverter() {
  }

  public static TextBodyModel fromDocx4J(CTTextBody value) {
    if (value == null) return null;
    return new TextBodyModel(TextBodyPropertiesConverter.fromDocx4J(value.getBodyPr()), TextListStyleConverter.fromDocx4J(value.getLstStyle()), value.getP().stream().map(TextParagraphConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
