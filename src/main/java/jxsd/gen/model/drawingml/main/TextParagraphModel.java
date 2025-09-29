package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.TextParagraphBuilder;

/**
 * This is a generated sequence class.
 */
public class TextParagraphModel {
  private final TextParagraphPropertiesModel pPr;

  private final List<EG_TextRun> egTextRun;

  private final TextCharacterPropertiesModel endParaRPr;

  public TextParagraphModel(TextParagraphPropertiesModel pPr, List<EG_TextRun> egTextRun,
      TextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.egTextRun = egTextRun;
    this.endParaRPr = endParaRPr;
  }

  public TextParagraphBuilder builder() {
    return new TextParagraphBuilder().from(this);
  }

  public TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public List<EG_TextRun> getEGTextRun() {
    return this.egTextRun;
  }

  public TextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextRun {
    private final int type;

    private final Object value;

    public EG_TextRun() {
      this(-1, null);
    }

    private EG_TextRun(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextParagraphBuilder.EG_TextRun builder() {
      return new TextParagraphBuilder.EG_TextRun().from(this);
    }

    public static EG_TextRun newR(RegularTextRunModel value) {
      return new EG_TextRun(0, value);
    }

    public boolean isR() {
      return this.type == 0;
    }

    public RegularTextRunModel getR() {
      return (RegularTextRunModel) this.value;
    }

    public static EG_TextRun newBr(TextLineBreakModel value) {
      return new EG_TextRun(1, value);
    }

    public boolean isBr() {
      return this.type == 1;
    }

    public TextLineBreakModel getBr() {
      return (TextLineBreakModel) this.value;
    }

    public static EG_TextRun newFld(TextFieldModel value) {
      return new EG_TextRun(2, value);
    }

    public boolean isFld() {
      return this.type == 2;
    }

    public TextFieldModel getFld() {
      return (TextFieldModel) this.value;
    }
  }
}
