package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.TextParagraphModel;
import org.docx4j.dml.CTRegularTextRun;
import org.docx4j.dml.CTTextField;
import org.docx4j.dml.CTTextLineBreak;
import org.docx4j.dml.CTTextParagraph;

/**
 * This is a generated sequence class.
 */
public class TextParagraphConverter {
  private TextParagraphConverter() {
  }

  public static TextParagraphModel fromDocx4j(CTTextParagraph value) {
    if (value == null) return null;
    List<TextParagraphModel.EG_TextRun> egTextRun = value.getEGTextRun().stream().map(val -> {
      if (val instanceof CTRegularTextRun) return CTTextParagraph.EGTextRun.newR(RegularTextRunConverter.fromDocx4j((CTRegularTextRun) val));
      if (val instanceof CTTextLineBreak) return CTTextParagraph.EGTextRun.newBr(TextLineBreakConverter.fromDocx4j((CTTextLineBreak) val));
      if (val instanceof CTTextField) return CTTextParagraph.EGTextRun.newFld(TextFieldConverter.fromDocx4j((CTTextField) val));
      return new TextParagraphModel(TextParagraphPropertiesConverter.fromDocx4j(value.getPPr()), egTextRun, TextCharacterPropertiesConverter.fromDocx4j(value.getEndParaRPr()));
    }

    public static CTTextParagraph toDocx4j(TextParagraphModel value) {
      if (value == null) return null;
      CTTextParagraph result = new CTTextParagraph();
      result.setPPr(TextParagraphPropertiesConverter.toDocx4j(value.getPPr()));
      result.setEndParaRPr(TextCharacterPropertiesConverter.toDocx4j(value.getEndParaRPr()));
      result.getEGTextRun().addAll(value.getEGTextRun().stream().map(val -> {
        if (val.isR()) return TextParagraphConverter.toDocx4j(val.getR());
        if (val.isBr()) return TextParagraphConverter.toDocx4j(val.getBr());
        if (val.isFld()) return TextParagraphConverter.toDocx4j(val.getFld());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
