package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextBody;

public class CT_TextBodyConverter {
  private CT_TextBodyConverter() {
  }

  public static CT_TextBodyModel fromDocx4J(CTTextBody value) {
    if (value == null) return null;
    return new CT_TextBodyModel(CT_TextBodyPropertiesConverter.fromDocx4J(value.getBodyPr()), CT_TextListStyleConverter.fromDocx4J(value.getLstStyle()), value.getP().stream().map(CT_TextParagraphConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTTextBody toDocx4J(CT_TextBodyModel value) {
    return null;
  }
}
