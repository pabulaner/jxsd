package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BaseStylesValueBuilder;

/**
 * This is a generated sequence class.
 */
public class BaseStylesValueModel {
  private final ColorSchemeModel clrScheme;

  private final FontScheme fontScheme;

  private final StyleMatrixModel fmtScheme;

  private final OfficeArtExtensionListModel extLst;

  public BaseStylesValueModel(ColorSchemeModel clrScheme, FontScheme fontScheme,
      StyleMatrixModel fmtScheme, OfficeArtExtensionListModel extLst) {
    this.clrScheme = clrScheme;
    this.fontScheme = fontScheme;
    this.fmtScheme = fmtScheme;
    this.extLst = extLst;
  }

  public BaseStylesValueBuilder builder() {
    return new BaseStylesValueBuilder().from(this);
  }

  public ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public FontScheme getFontScheme() {
    return this.fontScheme;
  }

  public StyleMatrixModel getFmtScheme() {
    return this.fmtScheme;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated sequence class.
   */
  public static class FontScheme {
    private final String name;

    private final FontCollectionValueModel majorFont;

    private final FontCollectionValueModel minorFont;

    private final OfficeArtExtensionListModel extLst;

    public FontScheme(String name, FontCollectionValueModel majorFont,
        FontCollectionValueModel minorFont, OfficeArtExtensionListModel extLst) {
      this.name = name;
      this.majorFont = majorFont;
      this.minorFont = minorFont;
      this.extLst = extLst;
    }

    public BaseStylesValueBuilder.FontScheme builder() {
      return new BaseStylesValueBuilder.FontScheme().from(this);
    }

    public String getName() {
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
