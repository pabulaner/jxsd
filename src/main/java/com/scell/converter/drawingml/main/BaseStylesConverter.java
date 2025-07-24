package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.BaseStylesModel;
import org.docx4j.dml.BaseStyles;

public class BaseStylesConverter {
  private BaseStylesConverter() {
  }

  public static BaseStylesModel fromDocx4J(BaseStyles value) {
    if (value == null) return null;
    return new BaseStylesModel(ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeConverter.fromDocx4J(value.getFontScheme()), StyleMatrixConverter.fromDocx4J(value.getFmtScheme()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static BaseStylesModel.FontSchemeModel fromDocx4J(BaseStyles.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesModel.FontSchemeModel(StringConverter.fromDocx4J(value.getName()), FontCollectionConverter.fromDocx4J(value.getMajorFont()), FontCollectionConverter.fromDocx4J(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }
  }
}
