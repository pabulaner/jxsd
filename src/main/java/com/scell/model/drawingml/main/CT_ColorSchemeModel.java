package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class CT_ColorSchemeModel {
  private final StringModel name;

  private final CT_ColorModel dk1;

  private final CT_ColorModel lt1;

  private final CT_ColorModel dk2;

  private final CT_ColorModel lt2;

  private final CT_ColorModel accent1;

  private final CT_ColorModel accent2;

  private final CT_ColorModel accent3;

  private final CT_ColorModel accent4;

  private final CT_ColorModel accent5;

  private final CT_ColorModel accent6;

  private final CT_ColorModel hlink;

  private final CT_ColorModel folHlink;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_ColorSchemeModel(StringModel name, CT_ColorModel dk1, CT_ColorModel lt1,
      CT_ColorModel dk2, CT_ColorModel lt2, CT_ColorModel accent1, CT_ColorModel accent2,
      CT_ColorModel accent3, CT_ColorModel accent4, CT_ColorModel accent5, CT_ColorModel accent6,
      CT_ColorModel hlink, CT_ColorModel folHlink, CT_OfficeArtExtensionListModel extLst) {
    this.name = name;
    this.dk1 = dk1;
    this.lt1 = lt1;
    this.dk2 = dk2;
    this.lt2 = lt2;
    this.accent1 = accent1;
    this.accent2 = accent2;
    this.accent3 = accent3;
    this.accent4 = accent4;
    this.accent5 = accent5;
    this.accent6 = accent6;
    this.hlink = hlink;
    this.folHlink = folHlink;
    this.extLst = extLst;
  }

  public StringModel getName() {
    return this.name;
  }

  public CT_ColorModel getDk1() {
    return this.dk1;
  }

  public CT_ColorModel getLt1() {
    return this.lt1;
  }

  public CT_ColorModel getDk2() {
    return this.dk2;
  }

  public CT_ColorModel getLt2() {
    return this.lt2;
  }

  public CT_ColorModel getAccent1() {
    return this.accent1;
  }

  public CT_ColorModel getAccent2() {
    return this.accent2;
  }

  public CT_ColorModel getAccent3() {
    return this.accent3;
  }

  public CT_ColorModel getAccent4() {
    return this.accent4;
  }

  public CT_ColorModel getAccent5() {
    return this.accent5;
  }

  public CT_ColorModel getAccent6() {
    return this.accent6;
  }

  public CT_ColorModel getHlink() {
    return this.hlink;
  }

  public CT_ColorModel getFolHlink() {
    return this.folHlink;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
