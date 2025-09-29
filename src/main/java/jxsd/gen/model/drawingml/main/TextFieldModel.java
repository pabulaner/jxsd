package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextFieldBuilder;

/**
 * This is a generated sequence class.
 */
public class TextFieldModel {
  private final String type;

  private final String id;

  private final TextCharacterPropertiesModel rPr;

  private final TextParagraphPropertiesModel pPr;

  private final String t;

  public TextFieldModel(String type, String id, TextCharacterPropertiesModel rPr,
      TextParagraphPropertiesModel pPr, String t) {
    this.type = type;
    this.id = id;
    this.rPr = rPr;
    this.pPr = pPr;
    this.t = t;
  }

  public TextFieldBuilder builder() {
    return new TextFieldBuilder().from(this);
  }

  public String getType() {
    return this.type;
  }

  public String getId() {
    return this.id;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public String getT() {
    return this.t;
  }
}
