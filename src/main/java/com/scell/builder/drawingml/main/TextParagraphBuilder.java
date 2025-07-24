package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.RegularTextRunModel;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.TextFieldModel;
import com.scell.model.drawingml.main.TextLineBreakModel;
import com.scell.model.drawingml.main.TextParagraphModel;
import com.scell.model.drawingml.main.TextParagraphPropertiesModel;
import java.lang.Object;
import java.util.List;

public class TextParagraphBuilder {
  private TextParagraphPropertiesModel pPr;

  private List<TextParagraphModel.TextRunModel> egTextRun;

  private TextCharacterPropertiesModel endParaRPr;

  public TextParagraphBuilder() {
  }

  public TextParagraphBuilder setPPr(TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public TextParagraphBuilder setEGTextRun(List<TextParagraphModel.TextRunModel> egTextRun) {
    this.egTextRun = egTextRun;
    return this;
  }

  public TextParagraphBuilder setEndParaRPr(TextCharacterPropertiesModel endParaRPr) {
    this.endParaRPr = endParaRPr;
    return this;
  }

  public TextParagraphModel build() {
    return new TextParagraphModel(this.pPr, this.egTextRun, this.endParaRPr);
  }

  public TextParagraphBuilder from(TextParagraphModel value) {
    this.pPr = value.getPPr();
    this.egTextRun = value.getEGTextRun();
    this.endParaRPr = value.getEndParaRPr();
    return this;
  }

  public static class TextRunBuilder {
    private int type;

    private Object value;

    public TextRunBuilder() {
      this.type = -1;
      this.value = null;
    }

    public TextRunBuilder setR(RegularTextRunModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public TextRunBuilder setBr(TextLineBreakModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public TextRunBuilder setFld(TextFieldModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public TextParagraphModel.TextRunModel build() {
      if (this.type == -1) return new TextParagraphModel.TextRunModel();
      if (this.type == 0) return TextParagraphModel.TextRunModel.newR((RegularTextRunModel) this.value);
      if (this.type == 1) return TextParagraphModel.TextRunModel.newBr((TextLineBreakModel) this.value);
      if (this.type == 2) return TextParagraphModel.TextRunModel.newFld((TextFieldModel) this.value);
      return null;
    }

    public TextRunBuilder from(TextParagraphModel.TextRunModel value) {
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
