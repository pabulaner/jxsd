package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextParagraphModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTRegularTextRun;
import org.docx4j.dml.CTTextField;
import org.docx4j.dml.CTTextLineBreak;
import org.docx4j.dml.CTTextParagraph;

public class CT_TextParagraphConverter {
  private CT_TextParagraphConverter() {
  }

  public static CT_TextParagraphModel fromDocx4J(CTTextParagraph value) {
    if (value == null) return null;
    // look here true;
    List<CT_TextParagraphModel.EG_TextRunModel> egTextRun = value.getEGTextRun().stream().map(val -> {
      if (val instanceof CTRegularTextRun) return CT_TextParagraphModel.EG_TextRunModel.newR(CT_RegularTextRunConverter.fromDocx4J((CTRegularTextRun) val));
      if (val instanceof CTTextLineBreak) return CT_TextParagraphModel.EG_TextRunModel.newBr(CT_TextLineBreakConverter.fromDocx4J((CTTextLineBreak) val));
      if (val instanceof CTTextField) return CT_TextParagraphModel.EG_TextRunModel.newFld(CT_TextFieldConverter.fromDocx4J((CTTextField) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_TextParagraphModel(CT_TextParagraphPropertiesConverter.fromDocx4J(value.getPPr()), egTextRun, CT_TextCharacterPropertiesConverter.fromDocx4J(value.getEndParaRPr()));
  }

  public static CTTextParagraph toDocx4J(CT_TextParagraphModel value) {
    return null;
  }
}
