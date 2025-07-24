package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.BaseStylesOverrideModel;
import com.scell.model.drawingml.main.ColorSchemeModel;
import com.scell.model.drawingml.main.FontCollectionModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.StyleMatrixModel;

public class BaseStylesOverrideBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesOverrideModel.FontSchemeModel fontScheme;

  private StyleMatrixModel fmtScheme;

  public BaseStylesOverrideBuilder() {
  }

  public BaseStylesOverrideBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesOverrideBuilder setFontScheme(
      BaseStylesOverrideModel.FontSchemeModel fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public BaseStylesOverrideBuilder setFmtScheme(StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public BaseStylesOverrideModel build() {
    return new BaseStylesOverrideModel(this.clrScheme, this.fontScheme, this.fmtScheme);
  }

  public BaseStylesOverrideBuilder from(BaseStylesOverrideModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    return this;
  }

  public static class FontSchemeBuilder {
    private StringModel name;

    private FontCollectionModel majorFont;

    private FontCollectionModel minorFont;

    private OfficeArtExtensionListModel extLst;

    public FontSchemeBuilder() {
    }

    public FontSchemeBuilder setName(StringModel name) {
      this.name = name;
      return this;
    }

    public FontSchemeBuilder setMajorFont(FontCollectionModel majorFont) {
      this.majorFont = majorFont;
      return this;
    }

    public FontSchemeBuilder setMinorFont(FontCollectionModel minorFont) {
      this.minorFont = minorFont;
      return this;
    }

    public FontSchemeBuilder setExtLst(OfficeArtExtensionListModel extLst) {
      this.extLst = extLst;
      return this;
    }

    public BaseStylesOverrideModel.FontSchemeModel build() {
      return new BaseStylesOverrideModel.FontSchemeModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeBuilder from(BaseStylesOverrideModel.FontSchemeModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
