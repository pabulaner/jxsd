package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.TextBodyModel;
import jxsd.gen.model.drawingml.main.TextBodyPropertiesModel;
import jxsd.gen.model.drawingml.main.TextListStyleModel;
import jxsd.gen.model.drawingml.main.TextParagraphModel;

/**
 * This is a generated sequence class.
 */
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

  public TextBodyBuilder from(TextBodyModel value) {
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.p = value.getP();
    return this;
  }

  public TextBodyModel build() {
    return new TextBodyModel(this.bodyPr, this.lstStyle, this.p);
  }
}
