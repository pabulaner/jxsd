package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextParagraphModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTTextParagraph;

public class CT_TextParagraphConverter {
  private CT_TextParagraphConverter() {
  }

  public static CT_TextParagraphModel fromDocx4j(CTTextParagraph value) {
    if (value == null) return null;
    return new CT_TextParagraphModel(CT_TextParagraphPropertiesConverter.fromDocx4j(value.getPPr()), value.getROrBrOrFld().stream().map(ROrBrOrFldConverter::fromDocx4j).collect(Collectors.toList()), CT_TextCharacterPropertiesConverter.fromDocx4j(value.getEndParaRPr()));
  }

  public static CTTextParagraph toDocx4j(CT_TextParagraphModel value) {
    return null;
  }

  public static class ROrBrOrFldConverter {
    private ROrBrOrFldConverter() {
    }

    public static CT_TextParagraphModel.ROrBrOrFldModel fromDocx4j(
        CTTextParagraph.ROrBrOrFld value) {
      if (value == null) return null;
    }

    public static CTTextParagraph.ROrBrOrFld toDocx4j(CT_TextParagraphModel.ROrBrOrFldModel value) {
      return null;
    }
  }
}
