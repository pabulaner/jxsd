package model.drawingml.main;

import model.XMLSchema.stringModel;

public class CT_BaseStylesOverrideModel {
  private final CT_ColorSchemeModel clrScheme;

  private final fontSchemeModel fontScheme;

  private final CT_StyleMatrixModel fmtScheme;

  public CT_BaseStylesOverrideModel(CT_ColorSchemeModel clrScheme, fontSchemeModel fontScheme,
      CT_StyleMatrixModel fmtScheme) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
  }

  public CT_ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public fontSchemeModel getFontScheme() {
    return this.fontScheme;
  }

  public CT_StyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public static class fontSchemeModel {
    private final stringModel name;

    private final CT_FontCollectionModel majorFont;

    private final CT_FontCollectionModel minorFont;

    private final CT_OfficeArtExtensionListModel extLst;

    public fontSchemeModel(stringModel name, CT_FontCollectionModel majorFont,
        CT_FontCollectionModel minorFont, CT_OfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public stringModel getName() {
      return this.name;
    }

    public CT_FontCollectionModel getMajorFont() {
      return this.majorFont;
    }

    public CT_FontCollectionModel getMinorFont() {
      return this.minorFont;
    }

    public CT_OfficeArtExtensionListModel getExtLst() {
      return this.extLst;
    }
  }
}
