package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class BaseStylesOverrideModel {
  private final ColorSchemeModel clrScheme;

  private final FontSchemeModel fontScheme;

  private final StyleMatrixModel fmtScheme;

  public BaseStylesOverrideModel(ColorSchemeModel clrScheme, FontSchemeModel fontScheme,
      StyleMatrixModel fmtScheme) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
  }

  public ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public FontSchemeModel getFontScheme() {
    return this.fontScheme;
  }

  public StyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public static class FontSchemeModel {
    private final StringModel name;

    private final FontCollectionModel majorFont;

    private final FontCollectionModel minorFont;

    private final OfficeArtExtensionListModel extLst;

    public FontSchemeModel(StringModel name, FontCollectionModel majorFont,
        FontCollectionModel minorFont, OfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public StringModel getName() {
      return this.name;
    }

    public FontCollectionModel getMajorFont() {
      return this.majorFont;
    }

    public FontCollectionModel getMinorFont() {
      return this.minorFont;
    }

    public OfficeArtExtensionListModel getExtLst() {
      return this.extLst;
    }
  }
}
