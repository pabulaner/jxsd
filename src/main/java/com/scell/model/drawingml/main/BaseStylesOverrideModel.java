package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;

public class BaseStylesOverrideModel {
  private final ColorSchemeModel clrScheme;

  private final FontSchemeValueModel fontScheme;

  private final StyleMatrixModel fmtScheme;

  public BaseStylesOverrideModel(ColorSchemeModel clrScheme, FontSchemeValueModel fontScheme,
      StyleMatrixModel fmtScheme) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
  }

  public ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public FontSchemeValueModel getFontScheme() {
    return this.fontScheme;
  }

  public StyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public static class FontSchemeValueModel {
    private final StringValueModel name;

    private final FontCollectionValueModel majorFont;

    private final FontCollectionValueModel minorFont;

    private final OfficeArtExtensionListModel extLst;

    public FontSchemeValueModel(StringValueModel name, FontCollectionValueModel majorFont,
        FontCollectionValueModel minorFont, OfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public StringValueModel getName() {
      return this.name;
    }

    public FontCollectionValueModel getMajorFont() {
      return this.majorFont;
    }

    public FontCollectionValueModel getMinorFont() {
      return this.minorFont;
    }

    public OfficeArtExtensionListModel getExtLst() {
      return this.extLst;
    }
  }
}
