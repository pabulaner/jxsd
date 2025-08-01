package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.BaseStylesValueModel;
import org.docx4j.dml.BaseStyles;

public class BaseStylesValueConverter {
  private BaseStylesValueConverter() {
  }

  public static BaseStylesValueModel fromDocx4J(BaseStyles value) {
    if (value == null) return null;
    return new BaseStylesValueModel(ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeValueConverter.fromDocx4J(value.getFontScheme()), StyleMatrixConverter.fromDocx4J(value.getFmtScheme()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static class FontSchemeValueConverter {
    private FontSchemeValueConverter() {
    }

    public static BaseStylesValueModel.FontSchemeValueModel fromDocx4J(
        BaseStyles.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesValueModel.FontSchemeValueModel(StringValueConverter.fromDocx4J(value.getName()), FontCollectionValueConverter.fromDocx4J(value.getMajorFont()), FontCollectionValueConverter.fromDocx4J(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }
  }
}
