package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.BaseStylesOverrideModel;
import com.scell.model.drawingml.main.ColorSchemeModel;
import com.scell.model.drawingml.main.FontCollectionValueModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.StyleMatrixModel;

public class BaseStylesOverrideBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesOverrideModel.FontSchemeValueModel fontScheme;

  private StyleMatrixModel fmtScheme;

  public BaseStylesOverrideBuilder() {
  }

  public BaseStylesOverrideBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesOverrideBuilder setFontScheme(
      BaseStylesOverrideModel.FontSchemeValueModel fontScheme) {
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

  public static class FontSchemeValueBuilder {
    private StringValueModel name;

    private FontCollectionValueModel majorFont;

    private FontCollectionValueModel minorFont;

    private OfficeArtExtensionListModel extLst;

    public FontSchemeValueBuilder() {
    }

    public FontSchemeValueBuilder setName(StringValueModel name) {
      this.name = name;
      return this;
    }

    public FontSchemeValueBuilder setMajorFont(FontCollectionValueModel majorFont) {
      this.majorFont = majorFont;
      return this;
    }

    public FontSchemeValueBuilder setMinorFont(FontCollectionValueModel minorFont) {
      this.minorFont = minorFont;
      return this;
    }

    public FontSchemeValueBuilder setExtLst(OfficeArtExtensionListModel extLst) {
      this.extLst = extLst;
      return this;
    }

    public BaseStylesOverrideModel.FontSchemeValueModel build() {
      return new BaseStylesOverrideModel.FontSchemeValueModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeValueBuilder from(BaseStylesOverrideModel.FontSchemeValueModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
