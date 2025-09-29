package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BaseStylesValueModel;
import jxsd.gen.model.drawingml.main.ColorSchemeModel;
import jxsd.gen.model.drawingml.main.FontCollectionValueModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.StyleMatrixModel;

/**
 * This is a generated sequence class.
 */
public class BaseStylesValueBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesValueModel.FontScheme fontScheme;

  private StyleMatrixModel fmtScheme;

  private OfficeArtExtensionListModel extLst;

  public BaseStylesValueBuilder() {
  }

  public BaseStylesValueBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesValueBuilder setFontScheme(BaseStylesValueModel.FontScheme fontScheme) {
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

  public BaseStylesValueBuilder from(BaseStylesValueModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    this.extLst = value.getExtLst();
    return this;
  }

  public BaseStylesValueModel build() {
    return new BaseStylesValueModel(this.clrScheme, this.fontScheme, this.fmtScheme, this.extLst);
  }

  /**
   * This is a generated sequence class.
   */
  public static class FontScheme {
    private String name;

    private FontCollectionValueModel majorFont;

    private FontCollectionValueModel minorFont;

    private OfficeArtExtensionListModel extLst;

    public FontScheme() {
    }

    public FontScheme setName(String name) {
      this.name = name;
      return this;
    }

    public FontScheme setMajorFont(FontCollectionValueModel majorFont) {
      this.majorFont = majorFont;
      return this;
    }

    public FontScheme setMinorFont(FontCollectionValueModel minorFont) {
      this.minorFont = minorFont;
      return this;
    }

    public FontScheme setExtLst(OfficeArtExtensionListModel extLst) {
      this.extLst = extLst;
      return this;
    }

    public FontScheme from(BaseStylesValueModel.FontScheme value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }

    public BaseStylesValueModel.FontScheme build() {
      return new BaseStylesValueModel.FontScheme(this.name, this.majorFont, this.minorFont, this.extLst);
    }
  }
}
