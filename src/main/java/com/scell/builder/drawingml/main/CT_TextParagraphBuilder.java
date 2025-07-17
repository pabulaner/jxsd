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

  private List<CT_TextParagraphModel.ROrBrOrFldModel> rOrBrOrFld;

  private CT_TextCharacterPropertiesModel endParaRPr;

  public CT_TextParagraphBuilder() {
  }

  public CT_TextParagraphBuilder setPPr(CT_TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public CT_TextParagraphBuilder setROrBrOrFld(
      List<CT_TextParagraphModel.ROrBrOrFldModel> rOrBrOrFld) {
    this.rOrBrOrFld = rOrBrOrFld;
    return this;
  }

  public CT_TextParagraphBuilder setEndParaRPr(CT_TextCharacterPropertiesModel endParaRPr) {
    this.endParaRPr = endParaRPr;
    return this;
  }

  public CT_TextParagraphModel build() {
    return new CT_TextParagraphModel(this.pPr, this.rOrBrOrFld, this.endParaRPr);
  }

  public CT_TextParagraphBuilder from(CT_TextParagraphModel value) {
    this.pPr = value.getPPr();
    this.rOrBrOrFld = value.getROrBrOrFld();
    this.endParaRPr = value.getEndParaRPr();
    return this;
  }

  public static class ROrBrOrFldBuilder {
    private int type;

    private Object value;

    public ROrBrOrFldBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ROrBrOrFldBuilder setR(CT_RegularTextRunModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ROrBrOrFldBuilder setBr(CT_TextLineBreakModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ROrBrOrFldBuilder setFld(CT_TextFieldModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public CT_TextParagraphModel.ROrBrOrFldModel build() {
      if (this.type == -1) return new CT_TextParagraphModel.ROrBrOrFldModel();
      if (this.type == 0) return CT_TextParagraphModel.ROrBrOrFldModel.newR((CT_RegularTextRunModel) this.value);
      if (this.type == 1) return CT_TextParagraphModel.ROrBrOrFldModel.newBr((CT_TextLineBreakModel) this.value);
      if (this.type == 2) return CT_TextParagraphModel.ROrBrOrFldModel.newFld((CT_TextFieldModel) this.value);
      return null;
    }

    public ROrBrOrFldBuilder from(CT_TextParagraphModel.ROrBrOrFldModel value) {
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
