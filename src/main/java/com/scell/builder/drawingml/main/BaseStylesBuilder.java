package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.BaseStylesModel;
import com.scell.model.drawingml.main.ColorSchemeModel;
import com.scell.model.drawingml.main.FontCollectionModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.StyleMatrixModel;

public class BaseStylesBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesModel.FontSchemeModel fontScheme;

  private StyleMatrixModel fmtScheme;

  private OfficeArtExtensionListModel extLst;

  public BaseStylesBuilder() {
  }

  public BaseStylesBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesBuilder setFontScheme(BaseStylesModel.FontSchemeModel fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public BaseStylesBuilder setFmtScheme(StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public BaseStylesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BaseStylesModel build() {
    return new BaseStylesModel(this.clrScheme, this.fontScheme, this.fmtScheme, this.extLst);
  }

  public BaseStylesBuilder from(BaseStylesModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    this.extLst = value.getExtLst();
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

    public BaseStylesModel.FontSchemeModel build() {
      return new BaseStylesModel.FontSchemeModel(this.name, this.majorFont, this.minorFont, this.extLst);
    }

    public FontSchemeBuilder from(BaseStylesModel.FontSchemeModel value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }
  }
}
