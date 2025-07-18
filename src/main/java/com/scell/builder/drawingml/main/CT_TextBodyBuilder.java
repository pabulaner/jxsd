package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBodyModel;
import com.scell.model.drawingml.main.CT_TextBodyPropertiesModel;
import com.scell.model.drawingml.main.CT_TextListStyleModel;
import com.scell.model.drawingml.main.CT_TextParagraphModel;
import java.util.List;

public class CT_TextBodyBuilder {
  private CT_TextBodyPropertiesModel bodyPr;

  private CT_TextListStyleModel lstStyle;

  private List<CT_TextParagraphModel> p;

  public CT_TextBodyBuilder() {
  }

  public CT_TextBodyBuilder setBodyPr(CT_TextBodyPropertiesModel bodyPr) {
    this.bodyPr = bodyPr;
    return this;
  }

  public CT_TextBodyBuilder setLstStyle(CT_TextListStyleModel lstStyle) {
    this.lstStyle = lstStyle;
    return this;
  }

  public CT_TextBodyBuilder setP(List<CT_TextParagraphModel> p) {
    this.p = p;
    return this;
  }

  public CT_TextBodyModel build() {
    return new CT_TextBodyModel(this.bodyPr, this.lstStyle, this.p);
  }

  public CT_TextBodyBuilder from(CT_TextBodyModel value) {
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.p = value.getP();
    return this;
  }
}
