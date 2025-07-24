package com.scell.model.drawingml.main;

public class ColorMappingModel {
  private final ColorSchemeIndexModel tx1;

  private final ColorSchemeIndexModel accent3;

  private final ColorSchemeIndexModel accent2;

  private final ColorSchemeIndexModel hlink;

  private final ColorSchemeIndexModel accent1;

  private final ColorSchemeIndexModel folHlink;

  private final ColorSchemeIndexModel accent6;

  private final ColorSchemeIndexModel bg2;

  private final ColorSchemeIndexModel accent5;

  private final ColorSchemeIndexModel bg1;

  private final ColorSchemeIndexModel tx2;

  private final ColorSchemeIndexModel accent4;

  private final OfficeArtExtensionListModel extLst;

  public ColorMappingModel(ColorSchemeIndexModel tx1, ColorSchemeIndexModel accent3,
      ColorSchemeIndexModel accent2, ColorSchemeIndexModel hlink, ColorSchemeIndexModel accent1,
      ColorSchemeIndexModel folHlink, ColorSchemeIndexModel accent6, ColorSchemeIndexModel bg2,
      ColorSchemeIndexModel accent5, ColorSchemeIndexModel bg1, ColorSchemeIndexModel tx2,
      ColorSchemeIndexModel accent4, OfficeArtExtensionListModel extLst) {
    this.tx1 = tx1;
    this.accent3 = accent3;
    this.accent2 = accent2;
    this.hlink = hlink;
    this.accent1 = accent1;
    this.folHlink = folHlink;
    this.accent6 = accent6;
    this.bg2 = bg2;
    this.accent5 = accent5;
    this.bg1 = bg1;
    this.tx2 = tx2;
    this.accent4 = accent4;
    this.extLst = extLst;
  }

  public ColorSchemeIndexModel getTx1() {
    return this.tx1;
  }

  public ColorSchemeIndexModel getAccent3() {
    return this.accent3;
  }

  public ColorSchemeIndexModel getAccent2() {
    return this.accent2;
  }

  public ColorSchemeIndexModel getHlink() {
    return this.hlink;
  }

  public ColorSchemeIndexModel getAccent1() {
    return this.accent1;
  }

  public ColorSchemeIndexModel getFolHlink() {
    return this.folHlink;
  }

  public ColorSchemeIndexModel getAccent6() {
    return this.accent6;
  }

  public ColorSchemeIndexModel getBg2() {
    return this.bg2;
  }

  public ColorSchemeIndexModel getAccent5() {
    return this.accent5;
  }

  public ColorSchemeIndexModel getBg1() {
    return this.bg1;
  }

  public ColorSchemeIndexModel getTx2() {
    return this.tx2;
  }

  public ColorSchemeIndexModel getAccent4() {
    return this.accent4;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
