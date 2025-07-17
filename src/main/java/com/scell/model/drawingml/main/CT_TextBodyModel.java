package com.scell.model.drawingml.main;

import java.util.List;

public class CT_TextBodyModel {
  private final CT_TextBodyPropertiesModel bodyPr;

  private final CT_TextListStyleModel lstStyle;

  private final List<CT_TextParagraphModel> p;

  public CT_TextBodyModel(CT_TextBodyPropertiesModel bodyPr, CT_TextListStyleModel lstStyle,
      List<CT_TextParagraphModel> p) {
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.p = p;
  }

  public CT_TextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public CT_TextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public List<CT_TextParagraphModel> getP() {
    return this.p;
  }
}
