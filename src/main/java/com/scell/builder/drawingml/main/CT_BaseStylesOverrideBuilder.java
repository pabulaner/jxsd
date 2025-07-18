package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_BaseStylesOverrideModel;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;
import com.scell.model.drawingml.main.CT_FontCollectionModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_StyleMatrixModel;

public class CT_BaseStylesOverrideBuilder {
  private CT_ColorSchemeModel clrScheme;

  private CT_BaseStylesOverrideModel.FontSchemeModel fontScheme;

  private CT_StyleMatrixModel fmtScheme;

  public CT_BaseStylesOverrideBuilder() {
  }

  public CT_BaseStylesOverrideBuilder setClrScheme(CT_ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public CT_BaseStylesOverrideBuilder setFontScheme(
      CT_BaseStylesOverrideModel.FontSchemeModel fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public CT_BaseStylesOverrideBuilder setFmtScheme(CT_StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public CT_BaseStylesOverrideModel build() {
    return new CT_BaseStylesOverrideModel(this.clrScheme, this.fontScheme, this.fmtScheme);
  }

  public CT_BaseStylesOverrideBuilder from(CT_BaseStylesOverrideModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
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

    public CT_BaseStylesOverrideModel.FontSchemeModel build() {
      return new CT_BaseStylesOverrideModel.FontSchemeModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeBuilder from(CT_BaseStylesOverrideModel.FontSchemeModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
