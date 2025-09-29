package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BaseStylesOverrideModel;
import jxsd.gen.model.drawingml.main.ColorSchemeModel;
import jxsd.gen.model.drawingml.main.FontCollectionValueModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.StyleMatrixModel;

/**
 * This is a generated sequence class.
 */
public class BaseStylesOverrideBuilder {
  private ColorSchemeModel clrScheme;

  private BaseStylesOverrideModel.FontScheme fontScheme;

  private StyleMatrixModel fmtScheme;

  public BaseStylesOverrideBuilder() {
  }

  public BaseStylesOverrideBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public BaseStylesOverrideBuilder setFontScheme(BaseStylesOverrideModel.FontScheme fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

  public BaseStylesOverrideBuilder setFmtScheme(StyleMatrixModel fmtScheme) {
    this.fmtScheme = fmtScheme;
    return this;
  }

  public BaseStylesOverrideBuilder from(BaseStylesOverrideModel value) {
    this.clrScheme = value.getClrScheme();
    this.fontScheme = value.getFontScheme();
    this.fmtScheme = value.getFmtScheme();
    return this;
  }

  public BaseStylesOverrideModel build() {
    return new BaseStylesOverrideModel(this.clrScheme, this.fontScheme, this.fmtScheme);
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

    public FontScheme from(BaseStylesOverrideModel.FontScheme value) {
      this.name = value.getName();
      this.majorFont = value.getMajorFont();
      this.minorFont = value.getMinorFont();
      this.extLst = value.getExtLst();
      return this;
    }

    public BaseStylesOverrideModel.FontScheme build() {
      return new BaseStylesOverrideModel.FontScheme(this.name, this.majorFont, this.minorFont, this.extLst);
    }
  }
}
