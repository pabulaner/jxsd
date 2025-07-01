package test.drawingml.main;

import test.XMLSchema.StringModel;

public class CTBaseStylesOverrideModel {
  private final CTColorSchemeModel clrScheme;

  private final FontSchemeModel fontScheme;

  private final CTStyleMatrixModel fmtScheme;

  public CTBaseStylesOverrideModel(CTColorSchemeModel clrScheme, FontSchemeModel fontScheme,
      CTStyleMatrixModel fmtScheme) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
  }

  public CTColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public FontSchemeModel getFontScheme() {
    return this.fontScheme;
  }

  public CTStyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public static class FontSchemeModel {
    private final StringModel name;

    private final CTFontCollectionModel majorFont;

    private final CTFontCollectionModel minorFont;

    private final CTOfficeArtExtensionListModel extLst;

    public FontSchemeModel(StringModel name, CTFontCollectionModel majorFont,
        CTFontCollectionModel minorFont, CTOfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public StringModel getName() {
      return this.name;
    }

    public CTFontCollectionModel getMajorFont() {
      return this.majorFont;
    }

    public CTFontCollectionModel getMinorFont() {
      return this.minorFont;
    }

    public CTOfficeArtExtensionListModel getExtLst() {
      return this.extLst;
    }
  }
}
