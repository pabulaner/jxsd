package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_RegularTextRunModel;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.CT_TextFieldModel;
import com.scell.model.drawingml.main.CT_TextLineBreakModel;
import com.scell.model.drawingml.main.CT_TextParagraphModel;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;
import java.lang.Object;
import java.util.List;

public class CT_TextParagraphBuilder {
  private CT_TextParagraphPropertiesModel pPr;

  private List<CT_TextParagraphModel.EG_TextRunModel> egTextRun;

  private CT_TextCharacterPropertiesModel endParaRPr;

  public CT_TextParagraphBuilder() {
  }

  public CT_TextParagraphBuilder setPPr(CT_TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public CT_TextParagraphBuilder setEGTextRun(
      List<CT_TextParagraphModel.EG_TextRunModel> egTextRun) {
    this.egTextRun = egTextRun;
    return this;
  }

  public CT_TextParagraphBuilder setEndParaRPr(CT_TextCharacterPropertiesModel endParaRPr) {
    this.endParaRPr = endParaRPr;
    return this;
  }

  public CT_TextParagraphModel build() {
    return new CT_TextParagraphModel(this.pPr, this.egTextRun, this.endParaRPr);
  }

  public CT_TextParagraphBuilder from(CT_TextParagraphModel value) {
    this.pPr = value.getPPr();
    this.egTextRun = value.getEGTextRun();
    this.endParaRPr = value.getEndParaRPr();
    return this;
  }

  public static class EG_TextRunBuilder {
    private int type;

    private Object value;

    public EG_TextRunBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextRunBuilder setR(CT_RegularTextRunModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextRunBuilder setBr(CT_TextLineBreakModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextRunBuilder setFld(CT_TextFieldModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_TextParagraphModel.EG_TextRunModel build() {
      if (this.type == -1) return new CT_TextParagraphModel.EG_TextRunModel();
      if (this.type == 0) return CT_TextParagraphModel.EG_TextRunModel.newR((CT_RegularTextRunModel) this.value);
      if (this.type == 1) return CT_TextParagraphModel.EG_TextRunModel.newBr((CT_TextLineBreakModel) this.value);
      if (this.type == 2) return CT_TextParagraphModel.EG_TextRunModel.newFld((CT_TextFieldModel) this.value);
      return null;
    }

    public EG_TextRunBuilder from(CT_TextParagraphModel.EG_TextRunModel value) {
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
  }
}
