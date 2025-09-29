package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.BaseStylesValueModel;
import org.docx4j.dml.BaseStyles;

/**
 * This is a generated sequence class.
 */
public class BaseStylesValueConverter {
  private BaseStylesValueConverter() {
  }

  public static BaseStylesValueModel fromDocx4j(BaseStyles value) {
    if (value == null) return null;
    return new BaseStylesValueModel(ColorSchemeConverter.fromDocx4j(value.getClrScheme()), FontScheme.fromDocx4j(value.getFontScheme()), StyleMatrixConverter.fromDocx4j(value.getFmtScheme()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static BaseStyles toDocx4j(BaseStylesValueModel value) {
    if (value == null) return null;
    BaseStyles result = new BaseStyles();
    result.setClrScheme(ColorSchemeConverter.toDocx4j(value.getClrScheme()));
    result.setFontScheme(FontScheme.toDocx4j(value.getFontScheme()));
    result.setFmtScheme(StyleMatrixConverter.toDocx4j(value.getFmtScheme()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }

  /**
   * This is a generated sequence class.
   */
  public static class FontScheme {
    private FontScheme() {
    }

    public static BaseStylesValueModel.FontScheme fromDocx4j(BaseStyles.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesValueModel.FontScheme(StringValueConverter.fromDocx4j(value.getName()), FontCollectionValueConverter.fromDocx4j(value.getMajorFont()), FontCollectionValueConverter.fromDocx4j(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
    }

    public static BaseStyles.FontScheme toDocx4j(BaseStylesValueModel.FontScheme value) {
      if (value == null) return null;
      BaseStyles.FontScheme result = new BaseStyles.FontScheme();
      result.setName(StringValueConverter.toDocx4j(value.getName()));
      result.setMajorFont(FontCollectionValueConverter.toDocx4j(value.getMajorFont()));
      result.setMinorFont(FontCollectionValueConverter.toDocx4j(value.getMinorFont()));
      result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
      return result;
    }
  }
}
