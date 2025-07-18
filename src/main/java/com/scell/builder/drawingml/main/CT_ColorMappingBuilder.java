package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ST_ColorSchemeIndexModel;

public class CT_ColorMappingBuilder {
  private ST_ColorSchemeIndexModel tx1;

  private ST_ColorSchemeIndexModel accent3;

  private ST_ColorSchemeIndexModel accent2;

  private ST_ColorSchemeIndexModel hlink;

  private ST_ColorSchemeIndexModel accent1;

  private ST_ColorSchemeIndexModel folHlink;

  private ST_ColorSchemeIndexModel accent6;

  private ST_ColorSchemeIndexModel bg2;

  private ST_ColorSchemeIndexModel accent5;

  private ST_ColorSchemeIndexModel bg1;

  private ST_ColorSchemeIndexModel tx2;

  private ST_ColorSchemeIndexModel accent4;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_ColorMappingBuilder() {
  }

  public CT_ColorMappingBuilder setTx1(ST_ColorSchemeIndexModel tx1) {
    this.tx1 = tx1;
    return this;
  }

  public CT_ColorMappingBuilder setAccent3(ST_ColorSchemeIndexModel accent3) {
    this.accent3 = accent3;
    return this;
  }

  public CT_ColorMappingBuilder setAccent2(ST_ColorSchemeIndexModel accent2) {
    this.accent2 = accent2;
    return this;
  }

  public CT_ColorMappingBuilder setHlink(ST_ColorSchemeIndexModel hlink) {
    this.hlink = hlink;
    return this;
  }

  public CT_ColorMappingBuilder setAccent1(ST_ColorSchemeIndexModel accent1) {
    this.accent1 = accent1;
    return this;
  }

  public CT_ColorMappingBuilder setFolHlink(ST_ColorSchemeIndexModel folHlink) {
    this.folHlink = folHlink;
    return this;
  }

  public CT_ColorMappingBuilder setAccent6(ST_ColorSchemeIndexModel accent6) {
    this.accent6 = accent6;
    return this;
  }

  public CT_ColorMappingBuilder setBg2(ST_ColorSchemeIndexModel bg2) {
    this.bg2 = bg2;
    return this;
  }

  public CT_ColorMappingBuilder setAccent5(ST_ColorSchemeIndexModel accent5) {
    this.accent5 = accent5;
    return this;
  }

  public CT_ColorMappingBuilder setBg1(ST_ColorSchemeIndexModel bg1) {
    this.bg1 = bg1;
    return this;
  }

  public CT_ColorMappingBuilder setTx2(ST_ColorSchemeIndexModel tx2) {
    this.tx2 = tx2;
    return this;
  }

  public CT_ColorMappingBuilder setAccent4(ST_ColorSchemeIndexModel accent4) {
    this.accent4 = accent4;
    return this;
  }

  public CT_ColorMappingBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ColorMappingModel build() {
    return new CT_ColorMappingModel(this.tx1, this.accent3, this.accent2, this.hlink, this.accent1, this.folHlink, this.accent6, this.bg2, this.accent5, this.bg1, this.tx2, this.accent4, this.extLst);
  }

  public CT_ColorMappingBuilder from(CT_ColorMappingModel value) {
    this.tx1 = value.getTx1();
    this.accent3 = value.getAccent3();
    this.accent2 = value.getAccent2();
    this.hlink = value.getHlink();
    this.accent1 = value.getAccent1();
    this.folHlink = value.getFolHlink();
    this.accent6 = value.getAccent6();
    this.bg2 = value.getBg2();
    this.accent5 = value.getAccent5();
    this.bg1 = value.getBg1();
    this.tx2 = value.getTx2();
    this.accent4 = value.getAccent4();
    this.extLst = value.getExtLst();
    return this;
  }
}
