package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTTextParagraphModel {
  private final CTTextParagraphPropertiesModel pPr;

  private final ROrBrOrFldModel rOrBrOrFld;

  private final CTTextCharacterPropertiesModel endParaRPr;

  public CTTextParagraphModel(CTTextParagraphPropertiesModel pPr, ROrBrOrFldModel rOrBrOrFld,
      CTTextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.rOrBrOrFld = rOrBrOrFld;
    this.endParaRPr = endParaRPr;
  }

  public CTTextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public ROrBrOrFldModel getROrBrOrFld() {
    return this.rOrBrOrFld;
  }

  public CTTextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  public static class ROrBrOrFldModel {
    private final Integer type;

    private final Object value;

    public ROrBrOrFldModel() {
      this(-1, null);
    }

    private ROrBrOrFldModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ROrBrOrFldModel newR(CTRegularTextRunModel value) {
      return new ROrBrOrFldModel(0, value);
    }

    public Boolean isR() {
      return this.type == 0;
    }

    public CTRegularTextRunModel getR() {
      return (CTRegularTextRunModel) this.value;
    }

    public static ROrBrOrFldModel newBr(CTTextLineBreakModel value) {
      return new ROrBrOrFldModel(1, value);
    }

    public Boolean isBr() {
      return this.type == 1;
    }

    public CTTextLineBreakModel getBr() {
      return (CTTextLineBreakModel) this.value;
    }

    public static ROrBrOrFldModel newFld(CTTextFieldModel value) {
      return new ROrBrOrFldModel(2, value);
    }

    public Boolean isFld() {
      return this.type == 2;
    }

    public CTTextFieldModel getFld() {
      return (CTTextFieldModel) this.value;
    }
  }
}
