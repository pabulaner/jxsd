package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.BaseStylesOverrideModel;
import org.docx4j.dml.CTBaseStylesOverride;

/**
 * This is a generated sequence class.
 */
public class BaseStylesOverrideConverter {
  private BaseStylesOverrideConverter() {
  }

  public static BaseStylesOverrideModel fromDocx4j(CTBaseStylesOverride value) {
    if (value == null) return null;
    return new BaseStylesOverrideModel(ColorSchemeConverter.fromDocx4j(value.getClrScheme()), FontScheme.fromDocx4j(value.getFontScheme()), StyleMatrixConverter.fromDocx4j(value.getFmtScheme()));
  }

  public static CTBaseStylesOverride toDocx4j(BaseStylesOverrideModel value) {
    if (value == null) return null;
    CTBaseStylesOverride result = new CTBaseStylesOverride();
    result.setClrScheme(ColorSchemeConverter.toDocx4j(value.getClrScheme()));
    result.setFontScheme(FontScheme.toDocx4j(value.getFontScheme()));
    result.setFmtScheme(StyleMatrixConverter.toDocx4j(value.getFmtScheme()));
    return result;
  }

  /**
   * This is a generated sequence class.
   */
  public static class FontScheme {
    private FontScheme() {
    }

    public static BaseStylesOverrideModel.FontScheme fromDocx4j(
        CTBaseStylesOverride.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesOverrideModel.FontScheme(StringValueConverter.fromDocx4j(value.getName()), FontCollectionValueConverter.fromDocx4j(value.getMajorFont()), FontCollectionValueConverter.fromDocx4j(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
    }

    public static CTBaseStylesOverride.FontScheme toDocx4j(
        BaseStylesOverrideModel.FontScheme value) {
      if (value == null) return null;
      CTBaseStylesOverride.FontScheme result = new CTBaseStylesOverride.FontScheme();
      result.setName(StringValueConverter.toDocx4j(value.getName()));
      result.setMajorFont(FontCollectionValueConverter.toDocx4j(value.getMajorFont()));
      result.setMinorFont(FontCollectionValueConverter.toDocx4j(value.getMinorFont()));
      result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
      return result;
    }
  }
}
