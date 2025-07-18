package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_ColorModel;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_ColorSchemeBuilder {
  private StringModel name;

  private CT_ColorModel dk1;

  private CT_ColorModel lt1;

  private CT_ColorModel dk2;

  private CT_ColorModel lt2;

  private CT_ColorModel accent1;

  private CT_ColorModel accent2;

  private CT_ColorModel accent3;

  private CT_ColorModel accent4;

  private CT_ColorModel accent5;

  private CT_ColorModel accent6;

  private CT_ColorModel hlink;

  private CT_ColorModel folHlink;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_ColorSchemeBuilder() {
  }

  public CT_ColorSchemeBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public CT_ColorSchemeBuilder setDk1(CT_ColorModel dk1) {
    this.dk1 = dk1;
    return this;
  }

  public CT_ColorSchemeBuilder setLt1(CT_ColorModel lt1) {
    this.lt1 = lt1;
    return this;
  }

  public CT_ColorSchemeBuilder setDk2(CT_ColorModel dk2) {
    this.dk2 = dk2;
    return this;
  }

  public CT_ColorSchemeBuilder setLt2(CT_ColorModel lt2) {
    this.lt2 = lt2;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent1(CT_ColorModel accent1) {
    this.accent1 = accent1;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent2(CT_ColorModel accent2) {
    this.accent2 = accent2;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent3(CT_ColorModel accent3) {
    this.accent3 = accent3;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent4(CT_ColorModel accent4) {
    this.accent4 = accent4;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent5(CT_ColorModel accent5) {
    this.accent5 = accent5;
    return this;
  }

  public CT_ColorSchemeBuilder setAccent6(CT_ColorModel accent6) {
    this.accent6 = accent6;
    return this;
  }

  public CT_ColorSchemeBuilder setHlink(CT_ColorModel hlink) {
    this.hlink = hlink;
    return this;
  }

  public CT_ColorSchemeBuilder setFolHlink(CT_ColorModel folHlink) {
    this.folHlink = folHlink;
    return this;
  }

  public CT_ColorSchemeBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ColorSchemeModel build() {
    return new CT_ColorSchemeModel(this.name, this.dk1, this.lt1, this.dk2, this.lt2, this.accent1, this.accent2, this.accent3, this.accent4, this.accent5, this.accent6, this.hlink, this.folHlink, this.extLst);
  }

  public CT_ColorSchemeBuilder from(CT_ColorSchemeModel value) {
    this.name = value.getName();
    this.dk1 = value.getDk1();
    this.lt1 = value.getLt1();
    this.dk2 = value.getDk2();
    this.lt2 = value.getLt2();
    this.accent1 = value.getAccent1();
    this.accent2 = value.getAccent2();
    this.accent3 = value.getAccent3();
    this.accent4 = value.getAccent4();
    this.accent5 = value.getAccent5();
    this.accent6 = value.getAccent6();
    this.hlink = value.getHlink();
    this.folHlink = value.getFolHlink();
    this.extLst = value.getExtLst();
    return this;
  }
}
