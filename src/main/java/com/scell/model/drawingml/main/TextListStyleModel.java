package com.scell.model.drawingml.main;

public class TextListStyleModel {
  private final TextParagraphPropertiesModel defPPr;

  private final TextParagraphPropertiesModel lvl1pPr;

  private final TextParagraphPropertiesModel lvl2pPr;

  private final TextParagraphPropertiesModel lvl3pPr;

  private final TextParagraphPropertiesModel lvl4pPr;

  private final TextParagraphPropertiesModel lvl5pPr;

  private final TextParagraphPropertiesModel lvl6pPr;

  private final TextParagraphPropertiesModel lvl7pPr;

  private final TextParagraphPropertiesModel lvl8pPr;

  private final TextParagraphPropertiesModel lvl9pPr;

  private final OfficeArtExtensionListModel extLst;

  public TextListStyleModel(TextParagraphPropertiesModel defPPr,
      TextParagraphPropertiesModel lvl1pPr, TextParagraphPropertiesModel lvl2pPr,
      TextParagraphPropertiesModel lvl3pPr, TextParagraphPropertiesModel lvl4pPr,
      TextParagraphPropertiesModel lvl5pPr, TextParagraphPropertiesModel lvl6pPr,
      TextParagraphPropertiesModel lvl7pPr, TextParagraphPropertiesModel lvl8pPr,
      TextParagraphPropertiesModel lvl9pPr, OfficeArtExtensionListModel extLst) {
    this.defPPr = defPPr;
    this.lvl1pPr = lvl1pPr;
    this.lvl2pPr = lvl2pPr;
    this.lvl3pPr = lvl3pPr;
    this.lvl4pPr = lvl4pPr;
    this.lvl5pPr = lvl5pPr;
    this.lvl6pPr = lvl6pPr;
    this.lvl7pPr = lvl7pPr;
    this.lvl8pPr = lvl8pPr;
    this.lvl9pPr = lvl9pPr;
    this.extLst = extLst;
  }

  public TextParagraphPropertiesModel getDefPPr() {
    return this.defPPr;
  }

  public TextParagraphPropertiesModel getLvl1PPr() {
    return this.lvl1pPr;
  }

  public TextParagraphPropertiesModel getLvl2PPr() {
    return this.lvl2pPr;
  }

  public TextParagraphPropertiesModel getLvl3PPr() {
    return this.lvl3pPr;
  }

  public TextParagraphPropertiesModel getLvl4PPr() {
    return this.lvl4pPr;
  }

  public TextParagraphPropertiesModel getLvl5PPr() {
    return this.lvl5pPr;
  }

  public TextParagraphPropertiesModel getLvl6PPr() {
    return this.lvl6pPr;
  }

  public TextParagraphPropertiesModel getLvl7PPr() {
    return this.lvl7pPr;
  }

  public TextParagraphPropertiesModel getLvl8PPr() {
    return this.lvl8pPr;
  }

  public TextParagraphPropertiesModel getLvl9PPr() {
    return this.lvl9pPr;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
