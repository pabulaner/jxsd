package com.scell.model.drawingml.main;

public class ColorMappingModel {
  private final ColorSchemeIndexValueModel tx1;

  private final ColorSchemeIndexValueModel accent3;

  private final ColorSchemeIndexValueModel accent2;

  private final ColorSchemeIndexValueModel hlink;

  private final ColorSchemeIndexValueModel accent1;

  private final ColorSchemeIndexValueModel folHlink;

  private final ColorSchemeIndexValueModel accent6;

  private final ColorSchemeIndexValueModel bg2;

  private final ColorSchemeIndexValueModel accent5;

  private final ColorSchemeIndexValueModel bg1;

  private final ColorSchemeIndexValueModel tx2;

  private final ColorSchemeIndexValueModel accent4;

  private final OfficeArtExtensionListModel extLst;

  public ColorMappingModel(ColorSchemeIndexValueModel tx1, ColorSchemeIndexValueModel accent3,
      ColorSchemeIndexValueModel accent2, ColorSchemeIndexValueModel hlink,
      ColorSchemeIndexValueModel accent1, ColorSchemeIndexValueModel folHlink,
      ColorSchemeIndexValueModel accent6, ColorSchemeIndexValueModel bg2,
      ColorSchemeIndexValueModel accent5, ColorSchemeIndexValueModel bg1,
      ColorSchemeIndexValueModel tx2, ColorSchemeIndexValueModel accent4,
      OfficeArtExtensionListModel extLst) {
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

  public ColorSchemeIndexValueModel getTx1() {
    return this.tx1;
  }

  public ColorSchemeIndexValueModel getAccent3() {
    return this.accent3;
  }

  public ColorSchemeIndexValueModel getAccent2() {
    return this.accent2;
  }

  public ColorSchemeIndexValueModel getHlink() {
    return this.hlink;
  }

  public ColorSchemeIndexValueModel getAccent1() {
    return this.accent1;
  }

  public ColorSchemeIndexValueModel getFolHlink() {
    return this.folHlink;
  }

  public ColorSchemeIndexValueModel getAccent6() {
    return this.accent6;
  }

  public ColorSchemeIndexValueModel getBg2() {
    return this.bg2;
  }

  public ColorSchemeIndexValueModel getAccent5() {
    return this.accent5;
  }

  public ColorSchemeIndexValueModel getBg1() {
    return this.bg1;
  }

  public ColorSchemeIndexValueModel getTx2() {
    return this.tx2;
  }

  public ColorSchemeIndexValueModel getAccent4() {
    return this.accent4;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
