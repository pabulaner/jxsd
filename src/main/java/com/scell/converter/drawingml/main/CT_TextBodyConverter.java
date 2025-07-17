package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextBody;

public class CT_TextBodyConverter {
  private CT_TextBodyConverter() {
  }

  public static CT_TextBodyModel fromDocx4j(CTTextBody value) {
    if (value == null) return null;
    return new CT_TextBodyModel(CT_TextBodyPropertiesConverter.fromDocx4j(value.getBodyPr()), CT_TextListStyleConverter.fromDocx4j(value.getLstStyle()), value.getP().stream().map(CT_TextParagraphConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTTextBody toDocx4j(CT_TextBodyModel value) {
    return null;
  }
}
