package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.main.RegularTextRunModel;
import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import jxsd.gen.model.drawingml.main.TextFieldModel;
import jxsd.gen.model.drawingml.main.TextLineBreakModel;
import jxsd.gen.model.drawingml.main.TextParagraphModel;
import jxsd.gen.model.drawingml.main.TextParagraphPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class TextParagraphBuilder {
  private TextParagraphPropertiesModel pPr;

  private List<TextParagraphModel.EG_TextRun> egTextRun;

  private TextCharacterPropertiesModel endParaRPr;

  public TextParagraphBuilder() {
  }

  public TextParagraphBuilder setPPr(TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public TextParagraphBuilder setEGTextRun(List<TextParagraphModel.EG_TextRun> egTextRun) {
    this.egTextRun = egTextRun;
    return this;
  }

  public TextParagraphBuilder setEndParaRPr(TextCharacterPropertiesModel endParaRPr) {
    this.endParaRPr = endParaRPr;
    return this;
  }

  public TextParagraphBuilder from(TextParagraphModel value) {
    this.pPr = value.getPPr();
    this.egTextRun = value.getEGTextRun();
    this.endParaRPr = value.getEndParaRPr();
    return this;
  }

  public TextParagraphModel build() {
    return new TextParagraphModel(this.pPr, this.egTextRun, this.endParaRPr);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextRun {
    private int type;

    private Object value;

    public EG_TextRun() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextRun setR(RegularTextRunModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextRun setBr(TextLineBreakModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextRun setFld(TextFieldModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_TextRun from(TextParagraphModel.EG_TextRun value) {
      this.type = -1;
      this.value = null;
      if (value.isR()) {
        this.type = 0;
        this.value = value.getR();
      }
      if (value.isBr()) {
        this.type = 1;
        this.value = value.getBr();
      }
      if (value.isFld()) {
        this.type = 2;
        this.value = value.getFld();
      }
      return this;
    }

    public TextParagraphModel.EG_TextRun build() {
      if (this.type == -1) return new TextParagraphModel.EG_TextRun();
      if (this.type == 0) return TextParagraphModel.EG_TextRun.newR((RegularTextRunModel) this.value);
      if (this.type == 1) return TextParagraphModel.EG_TextRun.newBr((TextLineBreakModel) this.value);
      if (this.type == 2) return TextParagraphModel.EG_TextRun.newFld((TextFieldModel) this.value);
      return null;
    }
  }
}
