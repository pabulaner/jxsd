package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class TextParagraphModel {
  private final TextParagraphPropertiesModel pPr;

  private final List<TextRunModel> egTextRun;

  private final TextCharacterPropertiesModel endParaRPr;

  public TextParagraphModel(TextParagraphPropertiesModel pPr, List<TextRunModel> egTextRun,
      TextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.egTextRun = egTextRun;
    this.endParaRPr = endParaRPr;
  }

  public TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public List<TextRunModel> getEGTextRun() {
    return this.egTextRun;
  }

  public TextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  public static class TextRunModel {
    private final int type;

    private final Object value;

    public TextRunModel() {
      this(-1, null);
    }

    private TextRunModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextRunModel newR(RegularTextRunModel value) {
      return new TextRunModel(0, value);
    }

    public boolean isR() {
      return this.type == 0;
    }

    public RegularTextRunModel getR() {
      return (RegularTextRunModel) this.value;
    }

    public static TextRunModel newBr(TextLineBreakModel value) {
      return new TextRunModel(1, value);
    }

    public boolean isBr() {
      return this.type == 1;
    }

    public TextLineBreakModel getBr() {
      return (TextLineBreakModel) this.value;
    }

    public static TextRunModel newFld(TextFieldModel value) {
      return new TextRunModel(2, value);
    }

    public boolean isFld() {
      return this.type == 2;
    }

    public TextFieldModel getFld() {
      return (TextFieldModel) this.value;
    }
  }
}
