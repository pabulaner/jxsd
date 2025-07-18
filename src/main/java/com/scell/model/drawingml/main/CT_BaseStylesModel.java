package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class CT_BaseStylesModel {
  private final CT_ColorSchemeModel clrScheme;

  private final FontSchemeModel fontScheme;

  private final CT_StyleMatrixModel fmtScheme;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_BaseStylesModel(CT_ColorSchemeModel clrScheme, FontSchemeModel fontScheme,
      CT_StyleMatrixModel fmtScheme, CT_OfficeArtExtensionListModel extLst) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
    this.extLst = extLst;
  }

  public CT_ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public FontSchemeModel getFontScheme() {
    return this.fontScheme;
  }

  public CT_StyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FontSchemeModel {
    private final StringModel name;

    private final CT_FontCollectionModel majorFont;

    private final CT_FontCollectionModel minorFont;

    private final CT_OfficeArtExtensionListModel extLst;

    public FontSchemeModel(StringModel name, CT_FontCollectionModel majorFont,
        CT_FontCollectionModel minorFont, CT_OfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public StringModel getName() {
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
