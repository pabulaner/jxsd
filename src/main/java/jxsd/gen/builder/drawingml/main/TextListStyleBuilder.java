package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.TextListStyleModel;
import jxsd.gen.model.drawingml.main.TextParagraphPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class TextListStyleBuilder {
  private TextParagraphPropertiesModel defPPr;

  private TextParagraphPropertiesModel lvl1pPr;

  private TextParagraphPropertiesModel lvl2pPr;

  private TextParagraphPropertiesModel lvl3pPr;

  private TextParagraphPropertiesModel lvl4pPr;

  private TextParagraphPropertiesModel lvl5pPr;

  private TextParagraphPropertiesModel lvl6pPr;

  private TextParagraphPropertiesModel lvl7pPr;

  private TextParagraphPropertiesModel lvl8pPr;

  private TextParagraphPropertiesModel lvl9pPr;

  private OfficeArtExtensionListModel extLst;

  public TextListStyleBuilder() {
  }

  public TextListStyleBuilder setDefPPr(TextParagraphPropertiesModel defPPr) {
    this.defPPr = defPPr;
    return this;
  }

  public TextListStyleBuilder setLvl1PPr(TextParagraphPropertiesModel lvl1pPr) {
    this.lvl1pPr = lvl1pPr;
    return this;
  }

  public TextListStyleBuilder setLvl2PPr(TextParagraphPropertiesModel lvl2pPr) {
    this.lvl2pPr = lvl2pPr;
    return this;
  }

  public TextListStyleBuilder setLvl3PPr(TextParagraphPropertiesModel lvl3pPr) {
    this.lvl3pPr = lvl3pPr;
    return this;
  }

  public TextListStyleBuilder setLvl4PPr(TextParagraphPropertiesModel lvl4pPr) {
    this.lvl4pPr = lvl4pPr;
    return this;
  }

  public TextListStyleBuilder setLvl5PPr(TextParagraphPropertiesModel lvl5pPr) {
    this.lvl5pPr = lvl5pPr;
    return this;
  }

  public TextListStyleBuilder setLvl6PPr(TextParagraphPropertiesModel lvl6pPr) {
    this.lvl6pPr = lvl6pPr;
    return this;
  }

  public TextListStyleBuilder setLvl7PPr(TextParagraphPropertiesModel lvl7pPr) {
    this.lvl7pPr = lvl7pPr;
    return this;
  }

  public TextListStyleBuilder setLvl8PPr(TextParagraphPropertiesModel lvl8pPr) {
    this.lvl8pPr = lvl8pPr;
    return this;
  }

  public TextListStyleBuilder setLvl9PPr(TextParagraphPropertiesModel lvl9pPr) {
    this.lvl9pPr = lvl9pPr;
    return this;
  }

  public TextListStyleBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TextListStyleBuilder from(TextListStyleModel value) {
    this.defPPr = value.getDefPPr();
    this.lvl1pPr = value.getLvl1PPr();
    this.lvl2pPr = value.getLvl2PPr();
    this.lvl3pPr = value.getLvl3PPr();
    this.lvl4pPr = value.getLvl4PPr();
    this.lvl5pPr = value.getLvl5PPr();
    this.lvl6pPr = value.getLvl6PPr();
    this.lvl7pPr = value.getLvl7PPr();
    this.lvl8pPr = value.getLvl8PPr();
    this.lvl9pPr = value.getLvl9PPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public TextListStyleModel build() {
    return new TextListStyleModel(this.defPPr, this.lvl1pPr, this.lvl2pPr, this.lvl3pPr, this.lvl4pPr, this.lvl5pPr, this.lvl6pPr, this.lvl7pPr, this.lvl8pPr, this.lvl9pPr, this.extLst);
  }
}
