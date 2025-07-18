package com.scell.model.drawingml.main;

public class CT_ColorMappingModel {
  private final ST_ColorSchemeIndexModel tx1;

  private final ST_ColorSchemeIndexModel accent3;

  private final ST_ColorSchemeIndexModel accent2;

  private final ST_ColorSchemeIndexModel hlink;

  private final ST_ColorSchemeIndexModel accent1;

  private final ST_ColorSchemeIndexModel folHlink;

  private final ST_ColorSchemeIndexModel accent6;

  private final ST_ColorSchemeIndexModel bg2;

  private final ST_ColorSchemeIndexModel accent5;

  private final ST_ColorSchemeIndexModel bg1;

  private final ST_ColorSchemeIndexModel tx2;

  private final ST_ColorSchemeIndexModel accent4;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_ColorMappingModel(ST_ColorSchemeIndexModel tx1, ST_ColorSchemeIndexModel accent3,
      ST_ColorSchemeIndexModel accent2, ST_ColorSchemeIndexModel hlink,
      ST_ColorSchemeIndexModel accent1, ST_ColorSchemeIndexModel folHlink,
      ST_ColorSchemeIndexModel accent6, ST_ColorSchemeIndexModel bg2,
      ST_ColorSchemeIndexModel accent5, ST_ColorSchemeIndexModel bg1, ST_ColorSchemeIndexModel tx2,
      ST_ColorSchemeIndexModel accent4, CT_OfficeArtExtensionListModel extLst) {
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

  public ST_ColorSchemeIndexModel getTx1() {
    return this.tx1;
  }

  public ST_ColorSchemeIndexModel getAccent3() {
    return this.accent3;
  }

  public ST_ColorSchemeIndexModel getAccent2() {
    return this.accent2;
  }

  public ST_ColorSchemeIndexModel getHlink() {
    return this.hlink;
  }

  public ST_ColorSchemeIndexModel getAccent1() {
    return this.accent1;
  }

  public ST_ColorSchemeIndexModel getFolHlink() {
    return this.folHlink;
  }

  public ST_ColorSchemeIndexModel getAccent6() {
    return this.accent6;
  }

  public ST_ColorSchemeIndexModel getBg2() {
    return this.bg2;
  }

  public ST_ColorSchemeIndexModel getAccent5() {
    return this.accent5;
  }

  public ST_ColorSchemeIndexModel getBg1() {
    return this.bg1;
  }

  public ST_ColorSchemeIndexModel getTx2() {
    return this.tx2;
  }

  public ST_ColorSchemeIndexModel getAccent4() {
    return this.accent4;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
