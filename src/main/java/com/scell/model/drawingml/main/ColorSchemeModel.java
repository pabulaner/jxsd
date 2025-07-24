package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class ColorSchemeModel {
  private final StringModel name;

  private final ColorModel dk1;

  private final ColorModel lt1;

  private final ColorModel dk2;

  private final ColorModel lt2;

  private final ColorModel accent1;

  private final ColorModel accent2;

  private final ColorModel accent3;

  private final ColorModel accent4;

  private final ColorModel accent5;

  private final ColorModel accent6;

  private final ColorModel hlink;

  private final ColorModel folHlink;

  private final OfficeArtExtensionListModel extLst;

  public ColorSchemeModel(StringModel name, ColorModel dk1, ColorModel lt1, ColorModel dk2,
      ColorModel lt2, ColorModel accent1, ColorModel accent2, ColorModel accent3,
      ColorModel accent4, ColorModel accent5, ColorModel accent6, ColorModel hlink,
      ColorModel folHlink, OfficeArtExtensionListModel extLst) {
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

  public ColorModel getDk1() {
    return this.dk1;
  }

  public ColorModel getLt1() {
    return this.lt1;
  }

  public ColorModel getDk2() {
    return this.dk2;
  }

  public ColorModel getLt2() {
    return this.lt2;
  }

  public ColorModel getAccent1() {
    return this.accent1;
  }

  public ColorModel getAccent2() {
    return this.accent2;
  }

  public ColorModel getAccent3() {
    return this.accent3;
  }

  public ColorModel getAccent4() {
    return this.accent4;
  }

  public ColorModel getAccent5() {
    return this.accent5;
  }

  public ColorModel getAccent6() {
    return this.accent6;
  }

  public ColorModel getHlink() {
    return this.hlink;
  }

  public ColorModel getFolHlink() {
    return this.folHlink;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
