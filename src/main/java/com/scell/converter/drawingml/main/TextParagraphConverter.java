package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextParagraphModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTRegularTextRun;
import org.docx4j.dml.CTTextField;
import org.docx4j.dml.CTTextLineBreak;
import org.docx4j.dml.CTTextParagraph;

public class TextParagraphConverter {
  private TextParagraphConverter() {
  }

  public static TextParagraphModel fromDocx4J(CTTextParagraph value) {
    if (value == null) return null;
    List<TextParagraphModel.TextRunModel> egTextRun = value.getEGTextRun().stream().map(val -> {
      if (val instanceof CTRegularTextRun) return TextParagraphModel.TextRunModel.newR(RegularTextRunConverter.fromDocx4J((CTRegularTextRun) val));
      if (val instanceof CTTextLineBreak) return TextParagraphModel.TextRunModel.newBr(TextLineBreakConverter.fromDocx4J((CTTextLineBreak) val));
      if (val instanceof CTTextField) return TextParagraphModel.TextRunModel.newFld(TextFieldConverter.fromDocx4J((CTTextField) val));
      return new TextParagraphModel.TextRunModel();
    } ).collect(Collectors.toList());
    return new TextParagraphModel(TextParagraphPropertiesConverter.fromDocx4J(value.getPPr()), egTextRun, TextCharacterPropertiesConverter.fromDocx4J(value.getEndParaRPr()));
  }
}
