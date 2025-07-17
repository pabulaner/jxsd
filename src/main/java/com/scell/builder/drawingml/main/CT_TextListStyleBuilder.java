package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_TextListStyleModel;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;

public class CT_TextListStyleBuilder {
  private CT_TextParagraphPropertiesModel defPPr;

  private CT_TextParagraphPropertiesModel lvl1pPr;

  private CT_TextParagraphPropertiesModel lvl2pPr;

  private CT_TextParagraphPropertiesModel lvl3pPr;

  private CT_TextParagraphPropertiesModel lvl4pPr;

  private CT_TextParagraphPropertiesModel lvl5pPr;

  private CT_TextParagraphPropertiesModel lvl6pPr;

  private CT_TextParagraphPropertiesModel lvl7pPr;

  private CT_TextParagraphPropertiesModel lvl8pPr;

  private CT_TextParagraphPropertiesModel lvl9pPr;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_TextListStyleBuilder() {
  }

  public CT_TextListStyleBuilder setDefPPr(CT_TextParagraphPropertiesModel defPPr) {
    this.defPPr = defPPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl1pPr(CT_TextParagraphPropertiesModel lvl1pPr) {
    this.lvl1pPr = lvl1pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl2pPr(CT_TextParagraphPropertiesModel lvl2pPr) {
    this.lvl2pPr = lvl2pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl3pPr(CT_TextParagraphPropertiesModel lvl3pPr) {
    this.lvl3pPr = lvl3pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl4pPr(CT_TextParagraphPropertiesModel lvl4pPr) {
    this.lvl4pPr = lvl4pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl5pPr(CT_TextParagraphPropertiesModel lvl5pPr) {
    this.lvl5pPr = lvl5pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl6pPr(CT_TextParagraphPropertiesModel lvl6pPr) {
    this.lvl6pPr = lvl6pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl7pPr(CT_TextParagraphPropertiesModel lvl7pPr) {
    this.lvl7pPr = lvl7pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl8pPr(CT_TextParagraphPropertiesModel lvl8pPr) {
    this.lvl8pPr = lvl8pPr;
    return this;
  }

  public CT_TextListStyleBuilder setLvl9pPr(CT_TextParagraphPropertiesModel lvl9pPr) {
    this.lvl9pPr = lvl9pPr;
    return this;
  }

  public CT_TextListStyleBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TextListStyleModel build() {
    return new CT_TextListStyleModel(this.defPPr, this.lvl1pPr, this.lvl2pPr, this.lvl3pPr, this.lvl4pPr, this.lvl5pPr, this.lvl6pPr, this.lvl7pPr, this.lvl8pPr, this.lvl9pPr, this.extLst);
  }

  public CT_TextListStyleBuilder from(CT_TextListStyleModel value) {
    this.defPPr = value.getDefPPr();
    this.lvl1pPr = value.getLvl1pPr();
    this.lvl2pPr = value.getLvl2pPr();
    this.lvl3pPr = value.getLvl3pPr();
    this.lvl4pPr = value.getLvl4pPr();
    this.lvl5pPr = value.getLvl5pPr();
    this.lvl6pPr = value.getLvl6pPr();
    this.lvl7pPr = value.getLvl7pPr();
    this.lvl8pPr = value.getLvl8pPr();
    this.lvl9pPr = value.getLvl9pPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
