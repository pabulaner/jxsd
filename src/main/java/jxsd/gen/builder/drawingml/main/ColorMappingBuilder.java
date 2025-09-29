package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorMappingModel;
import jxsd.gen.model.drawingml.main.ColorSchemeIndexValueModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class ColorMappingBuilder {
  private ColorSchemeIndexValueModel tx1;

  private ColorSchemeIndexValueModel accent3;

  private ColorSchemeIndexValueModel accent2;

  private ColorSchemeIndexValueModel hlink;

  private ColorSchemeIndexValueModel accent1;

  private ColorSchemeIndexValueModel folHlink;

  private ColorSchemeIndexValueModel accent6;

  private ColorSchemeIndexValueModel bg2;

  private ColorSchemeIndexValueModel accent5;

  private ColorSchemeIndexValueModel bg1;

  private ColorSchemeIndexValueModel tx2;

  private ColorSchemeIndexValueModel accent4;

  private OfficeArtExtensionListModel extLst;

  public ColorMappingBuilder() {
  }

  public ColorMappingBuilder setTx1(ColorSchemeIndexValueModel tx1) {
    this.tx1 = tx1;
    return this;
  }

  public ColorMappingBuilder setAccent3(ColorSchemeIndexValueModel accent3) {
    this.accent3 = accent3;
    return this;
  }

  public ColorMappingBuilder setAccent2(ColorSchemeIndexValueModel accent2) {
    this.accent2 = accent2;
    return this;
  }

  public ColorMappingBuilder setHlink(ColorSchemeIndexValueModel hlink) {
    this.hlink = hlink;
    return this;
  }

  public ColorMappingBuilder setAccent1(ColorSchemeIndexValueModel accent1) {
    this.accent1 = accent1;
    return this;
  }

  public ColorMappingBuilder setFolHlink(ColorSchemeIndexValueModel folHlink) {
    this.folHlink = folHlink;
    return this;
  }

  public ColorMappingBuilder setAccent6(ColorSchemeIndexValueModel accent6) {
    this.accent6 = accent6;
    return this;
  }

  public ColorMappingBuilder setBg2(ColorSchemeIndexValueModel bg2) {
    this.bg2 = bg2;
    return this;
  }

  public ColorMappingBuilder setAccent5(ColorSchemeIndexValueModel accent5) {
    this.accent5 = accent5;
    return this;
  }

  public ColorMappingBuilder setBg1(ColorSchemeIndexValueModel bg1) {
    this.bg1 = bg1;
    return this;
  }

  public ColorMappingBuilder setTx2(ColorSchemeIndexValueModel tx2) {
    this.tx2 = tx2;
    return this;
  }

  public ColorMappingBuilder setAccent4(ColorSchemeIndexValueModel accent4) {
    this.accent4 = accent4;
    return this;
  }

  public ColorMappingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
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

  public ColorMappingModel build() {
    return new ColorMappingModel(this.tx1, this.accent3, this.accent2, this.hlink, this.accent1, this.folHlink, this.accent6, this.bg2, this.accent5, this.bg1, this.tx2, this.accent4, this.extLst);
  }
}
