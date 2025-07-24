package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.BaseStylesOverrideModel;
import org.docx4j.dml.CTBaseStylesOverride;

public class BaseStylesOverrideConverter {
  private BaseStylesOverrideConverter() {
  }

  public static BaseStylesOverrideModel fromDocx4J(CTBaseStylesOverride value) {
    if (value == null) return null;
    return new BaseStylesOverrideModel(ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeConverter.fromDocx4J(value.getFontScheme()), StyleMatrixConverter.fromDocx4J(value.getFmtScheme()));
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static BaseStylesOverrideModel.FontSchemeModel fromDocx4J(
        CTBaseStylesOverride.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesOverrideModel.FontSchemeModel(StringConverter.fromDocx4J(value.getName()), FontCollectionConverter.fromDocx4J(value.getMajorFont()), FontCollectionConverter.fromDocx4J(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }
  }
}
