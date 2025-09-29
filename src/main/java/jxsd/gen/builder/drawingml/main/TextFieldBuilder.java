package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;
import jxsd.gen.model.drawingml.main.TextFieldModel;
import jxsd.gen.model.drawingml.main.TextParagraphPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class TextFieldBuilder {
  private String type;

  private String id;

  private TextCharacterPropertiesModel rPr;

  private TextParagraphPropertiesModel pPr;

  private String t;

  public TextFieldBuilder() {
  }

  public TextFieldBuilder setType(String type) {
    this.type = type;
    return this;
  }

  public TextFieldBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public TextFieldBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public TextFieldBuilder setPPr(TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public TextFieldBuilder setT(String t) {
    this.t = t;
    return this;
  }

  public TextFieldBuilder from(TextFieldModel value) {
    this.type = value.getType();
    this.id = value.getId();
    this.rPr = value.getRPr();
    this.pPr = value.getPPr();
    this.t = value.getT();
    return this;
  }

  public TextFieldModel build() {
    return new TextFieldModel(this.type, this.id, this.rPr, this.pPr, this.t);
  }
}
