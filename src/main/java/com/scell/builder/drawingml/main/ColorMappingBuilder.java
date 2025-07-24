package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorMappingModel;
import com.scell.model.drawingml.main.ColorSchemeIndexModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class ColorMappingBuilder {
  private ColorSchemeIndexModel tx1;

  private ColorSchemeIndexModel accent3;

  private ColorSchemeIndexModel accent2;

  private ColorSchemeIndexModel hlink;

  private ColorSchemeIndexModel accent1;

  private ColorSchemeIndexModel folHlink;

  private ColorSchemeIndexModel accent6;

  private ColorSchemeIndexModel bg2;

  private ColorSchemeIndexModel accent5;

  private ColorSchemeIndexModel bg1;

  private ColorSchemeIndexModel tx2;

  private ColorSchemeIndexModel accent4;

  private OfficeArtExtensionListModel extLst;

  public ColorMappingBuilder() {
  }

  public ColorMappingBuilder setTx1(ColorSchemeIndexModel tx1) {
    this.tx1 = tx1;
    return this;
  }

  public ColorMappingBuilder setAccent3(ColorSchemeIndexModel accent3) {
    this.accent3 = accent3;
    return this;
  }

  public ColorMappingBuilder setAccent2(ColorSchemeIndexModel accent2) {
    this.accent2 = accent2;
    return this;
  }

  public ColorMappingBuilder setHlink(ColorSchemeIndexModel hlink) {
    this.hlink = hlink;
    return this;
  }

  public ColorMappingBuilder setAccent1(ColorSchemeIndexModel accent1) {
    this.accent1 = accent1;
    return this;
  }

  public ColorMappingBuilder setFolHlink(ColorSchemeIndexModel folHlink) {
    this.folHlink = folHlink;
    return this;
  }

  public ColorMappingBuilder setAccent6(ColorSchemeIndexModel accent6) {
    this.accent6 = accent6;
    return this;
  }

  public ColorMappingBuilder setBg2(ColorSchemeIndexModel bg2) {
    this.bg2 = bg2;
    return this;
  }

  public ColorMappingBuilder setAccent5(ColorSchemeIndexModel accent5) {
    this.accent5 = accent5;
    return this;
  }

  public ColorMappingBuilder setBg1(ColorSchemeIndexModel bg1) {
    this.bg1 = bg1;
    return this;
  }

  public ColorMappingBuilder setTx2(ColorSchemeIndexModel tx2) {
    this.tx2 = tx2;
    return this;
  }

  public ColorMappingBuilder setAccent4(ColorSchemeIndexModel accent4) {
    this.accent4 = accent4;
    return this;
  }

  public ColorMappingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ColorMappingModel build() {
    return new ColorMappingModel(this.tx1, this.accent3, this.accent2, this.hlink, this.accent1, this.folHlink, this.accent6, this.bg2, this.accent5, this.bg1, this.tx2, this.accent4, this.extLst);
  }

  public ColorMappingBuilder from(ColorMappingModel value) {
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
