package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_BaseStylesModel;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;
import com.scell.model.drawingml.main.CT_FontCollectionModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_StyleMatrixModel;

public class CT_BaseStylesBuilder {
  private CT_ColorSchemeModel clrScheme;

  private CT_BaseStylesModel.FontSchemeModel fontScheme;

  private CT_StyleMatrixModel fmtScheme;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_BaseStylesBuilder() {
  }

  public CT_BaseStylesBuilder setClrScheme(CT_ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public CT_BaseStylesBuilder setFontScheme(CT_BaseStylesModel.FontSchemeModel fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public CT_BaseStylesBuilder setFmtScheme(CT_StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public CT_BaseStylesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BaseStylesModel build() {
    return new CT_BaseStylesModel(this.clrScheme, this.fontScheme, this.fmtScheme, this.extLst);
  }

  public CT_BaseStylesBuilder from(CT_BaseStylesModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class FontSchemeBuilder {
    private StringModel name;

    private CT_FontCollectionModel majorFont;

    private CT_FontCollectionModel minorFont;

    private CT_OfficeArtExtensionListModel extLst;

    public FontSchemeBuilder() {
    }

    public FontSchemeBuilder setName(StringModel name) {
      this.name = name;
      return this;
    }

    public FontSchemeBuilder setMajorFont(CT_FontCollectionModel majorFont) {
      this.majorFont = majorFont;
      return this;
    }

    public FontSchemeBuilder setMinorFont(CT_FontCollectionModel minorFont) {
      this.minorFont = minorFont;
      return this;
    }

    public FontSchemeBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
      this.extLst = extLst;
      return this;
    }

    public CT_BaseStylesModel.FontSchemeModel build() {
      return new CT_BaseStylesModel.FontSchemeModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeBuilder from(CT_BaseStylesModel.FontSchemeModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
