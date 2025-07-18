package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_TextParagraphModel {
  private final CT_TextParagraphPropertiesModel pPr;

  private final List<EG_TextRunModel> egTextRun;

  private final CT_TextCharacterPropertiesModel endParaRPr;

  public CT_TextParagraphModel(CT_TextParagraphPropertiesModel pPr, List<EG_TextRunModel> egTextRun,
      CT_TextCharacterPropertiesModel endParaRPr) {
    this.pPr = pPr;
    this.egTextRun = egTextRun;
    this.endParaRPr = endParaRPr;
  }

  public CT_TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public List<EG_TextRunModel> getEGTextRun() {
    return this.egTextRun;
  }

  public CT_TextCharacterPropertiesModel getEndParaRPr() {
    return this.endParaRPr;
  }

  public static class EG_TextRunModel {
    private final int type;

    private final Object value;

    public EG_TextRunModel() {
      this(-1, null);
    }

    private EG_TextRunModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_TextRunModel newR(CT_RegularTextRunModel value) {
      return new EG_TextRunModel(0, value);
    }

    public boolean isR() {
      return this.type == 0;
    }

    public CT_RegularTextRunModel getR() {
      return (CT_RegularTextRunModel) this.value;
    }

    public static EG_TextRunModel newBr(CT_TextLineBreakModel value) {
      return new EG_TextRunModel(1, value);
    }

    public boolean isBr() {
      return this.type == 1;
    }

    public CT_TextLineBreakModel getBr() {
      return (CT_TextLineBreakModel) this.value;
    }

    public static EG_TextRunModel newFld(CT_TextFieldModel value) {
      return new EG_TextRunModel(2, value);
    }

    public boolean isFld() {
      return this.type == 2;
    }

    public CT_TextFieldModel getFld() {
      return (CT_TextFieldModel) this.value;
    }
  }
}
