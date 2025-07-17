package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_TextParagraphModel {
  private final CT_TextParagraphPropertiesModel pPr;

  private final List<rOrBrOrFldModel> rOrBrOrFld;

  private final CT_TextCharacterPropertiesModel endParaRPr;

  public CT_TextParagraphModel(CT_TextParagraphPropertiesModel pPr,
      List<rOrBrOrFldModel> rOrBrOrFld, CT_TextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.rOrBrOrFld = rOrBrOrFld;
    this.endParaRPr = endParaRPr;
  }

  public CT_TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public List<rOrBrOrFldModel> getROrBrOrFld() {
    return this.rOrBrOrFld;
  }

  public CT_TextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  public static class rOrBrOrFldModel {
    private final int type;

    private final Object value;

    public rOrBrOrFldModel() {
      this(-1, null);
    }

    private rOrBrOrFldModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static rOrBrOrFldModel newR(CT_RegularTextRunModel value) {
      return new rOrBrOrFldModel(0, value);
    }

    public boolean isR() {
      return this.type == 0;
    }

    public CT_RegularTextRunModel getR() {
      return (CT_RegularTextRunModel) this.value;
    }

    public static rOrBrOrFldModel newBr(CT_TextLineBreakModel value) {
      return new rOrBrOrFldModel(1, value);
    }

    public boolean isBr() {
      return this.type == 1;
    }

    public CT_TextLineBreakModel getBr() {
      return (CT_TextLineBreakModel) this.value;
    }

    public static rOrBrOrFldModel newFld(CT_TextFieldModel value) {
      return new rOrBrOrFldModel(2, value);
    }

    public boolean isFld() {
      return this.type == 2;
    }

    public CT_TextFieldModel getFld() {
      return (CT_TextFieldModel) this.value;
    }
  }
}
