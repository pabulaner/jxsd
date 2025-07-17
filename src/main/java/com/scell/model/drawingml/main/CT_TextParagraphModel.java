package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_TextParagraphModel {
  private final CT_TextParagraphPropertiesModel pPr;

  private final List<ROrBrOrFldModel> rOrBrOrFld;

  private final CT_TextCharacterPropertiesModel endParaRPr;

  public CT_TextParagraphModel(CT_TextParagraphPropertiesModel pPr,
      List<ROrBrOrFldModel> rOrBrOrFld, CT_TextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.rOrBrOrFld = rOrBrOrFld;
    this.endParaRPr = endParaRPr;
  }

  public CT_TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public List<ROrBrOrFldModel> getROrBrOrFld() {
    return this.rOrBrOrFld;
  }

  public CT_TextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  public static class ROrBrOrFldModel {
    private final int type;

    private final Object value;

    public ROrBrOrFldModel() {
      this(-1, null);
    }

    private ROrBrOrFldModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ROrBrOrFldModel newR(CT_RegularTextRunModel value) {
      return new ROrBrOrFldModel(0, value);
    }

    public boolean isR() {
      return this.type == 0;
    }

    public CT_RegularTextRunModel getR() {
      return (CT_RegularTextRunModel) this.value;
    }

    public static ROrBrOrFldModel newBr(CT_TextLineBreakModel value) {
      return new ROrBrOrFldModel(1, value);
    }

    public boolean isBr() {
      return this.type == 1;
    }

    public CT_TextLineBreakModel getBr() {
      return (CT_TextLineBreakModel) this.value;
    }

    public static ROrBrOrFldModel newFld(CT_TextFieldModel value) {
      return new ROrBrOrFldModel(2, value);
    }

    public boolean isFld() {
      return this.type == 2;
    }

    public CT_TextFieldModel getFld() {
      return (CT_TextFieldModel) this.value;
    }
  }
}
