package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.BaseStylesValueModel;
import com.scell.model.drawingml.main.ColorSchemeModel;
import com.scell.model.drawingml.main.FontCollectionValueModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.StyleMatrixModel;

public class BaseStylesValueBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesValueModel.FontSchemeValueModel fontScheme;

  private StyleMatrixModel fmtScheme;

  private OfficeArtExtensionListModel extLst;

  public BaseStylesValueBuilder() {
  }

  public BaseStylesValueBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesValueBuilder setFontScheme(
      BaseStylesValueModel.FontSchemeValueModel fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public BaseStylesValueBuilder setFmtScheme(StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public BaseStylesValueBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BaseStylesValueModel build() {
    return new BaseStylesValueModel(this.clrScheme, this.fontScheme, this.fmtScheme, this.extLst);
  }

  public BaseStylesValueBuilder from(BaseStylesValueModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    this.extLst = value.getExtLst();
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

    public BaseStylesValueModel.FontSchemeValueModel build() {
      return new BaseStylesValueModel.FontSchemeValueModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeValueBuilder from(BaseStylesValueModel.FontSchemeValueModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
