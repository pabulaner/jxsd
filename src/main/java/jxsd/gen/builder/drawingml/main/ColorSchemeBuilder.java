package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.ColorSchemeModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeBuilder {
  private String name;

  private ColorModel dk1;

  private ColorModel lt1;

  private ColorModel dk2;

  private ColorModel lt2;

  private ColorModel accent1;

  private ColorModel accent2;

  private ColorModel accent3;

  private ColorModel accent4;

  private ColorModel accent5;

  private ColorModel accent6;

  private ColorModel hlink;

  private ColorModel folHlink;

  private OfficeArtExtensionListModel extLst;

  public ColorSchemeBuilder() {
  }

  public ColorSchemeBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public ColorSchemeBuilder setDk1(ColorModel dk1) {
    this.dk1 = dk1;
    return this;
  }

  public ColorSchemeBuilder setLt1(ColorModel lt1) {
    this.lt1 = lt1;
    return this;
  }

  public ColorSchemeBuilder setDk2(ColorModel dk2) {
    this.dk2 = dk2;
    return this;
  }

  public ColorSchemeBuilder setLt2(ColorModel lt2) {
    this.lt2 = lt2;
    return this;
  }

  public ColorSchemeBuilder setAccent1(ColorModel accent1) {
    this.accent1 = accent1;
    return this;
  }

  public ColorSchemeBuilder setAccent2(ColorModel accent2) {
    this.accent2 = accent2;
    return this;
  }

  public ColorSchemeBuilder setAccent3(ColorModel accent3) {
    this.accent3 = accent3;
    return this;
  }

  public ColorSchemeBuilder setAccent4(ColorModel accent4) {
    this.accent4 = accent4;
    return this;
  }

  public ColorSchemeBuilder setAccent5(ColorModel accent5) {
    this.accent5 = accent5;
    return this;
  }

  public ColorSchemeBuilder setAccent6(ColorModel accent6) {
    this.accent6 = accent6;
    return this;
  }

  public ColorSchemeBuilder setHlink(ColorModel hlink) {
    this.hlink = hlink;
    return this;
  }

  public ColorSchemeBuilder setFolHlink(ColorModel folHlink) {
    this.folHlink = folHlink;
    return this;
  }

  public ColorSchemeBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ColorSchemeBuilder from(ColorSchemeModel value) {
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

  public ColorSchemeModel build() {
    return new ColorSchemeModel(this.name, this.dk1, this.lt1, this.dk2, this.lt2, this.accent1, this.accent2, this.accent3, this.accent4, this.accent5, this.accent6, this.hlink, this.folHlink, this.extLst);
  }
}
