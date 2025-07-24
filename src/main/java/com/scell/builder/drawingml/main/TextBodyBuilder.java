package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBodyModel;
import com.scell.model.drawingml.main.TextBodyPropertiesModel;
import com.scell.model.drawingml.main.TextListStyleModel;
import com.scell.model.drawingml.main.TextParagraphModel;
import java.util.List;

public class TextBodyBuilder {
  private TextBodyPropertiesModel bodyPr;

  private TextListStyleModel lstStyle;

  private List<TextParagraphModel> p;

  public TextBodyBuilder() {
  }

  public TextBodyBuilder setBodyPr(TextBodyPropertiesModel bodyPr) {
    this.bodyPr = bodyPr;
    return this;
  }

  public TextBodyBuilder setLstStyle(TextListStyleModel lstStyle) {
    this.lstStyle = lstStyle;
    return this;
  }

  public TextBodyBuilder setP(List<TextParagraphModel> p) {
    this.p = p;
    return this;
  }

  public TextBodyModel build() {
    return new TextBodyModel(this.bodyPr, this.lstStyle, this.p);
  }

  public TextBodyBuilder from(TextBodyModel value) {
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.p = value.getP();
    return this;
  }
}
