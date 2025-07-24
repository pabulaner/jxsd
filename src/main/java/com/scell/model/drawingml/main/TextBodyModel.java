package com.scell.model.drawingml.main;

import java.util.List;

public class TextBodyModel {
  private final TextBodyPropertiesModel bodyPr;

  private final TextListStyleModel lstStyle;

  private final List<TextParagraphModel> p;

  public TextBodyModel(TextBodyPropertiesModel bodyPr, TextListStyleModel lstStyle,
      List<TextParagraphModel> p) {
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.p = p;
  }

  public TextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public TextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public List<TextParagraphModel> getP() {
    return this.p;
  }
}
