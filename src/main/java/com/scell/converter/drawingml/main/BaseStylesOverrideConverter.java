package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.BaseStylesOverrideModel;
import org.docx4j.dml.CTBaseStylesOverride;

public class BaseStylesOverrideConverter {
  private BaseStylesOverrideConverter() {
  }

  public static BaseStylesOverrideModel fromDocx4J(CTBaseStylesOverride value) {
    if (value == null) return null;
    return new BaseStylesOverrideModel(ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeValueConverter.fromDocx4J(value.getFontScheme()), StyleMatrixConverter.fromDocx4J(value.getFmtScheme()));
  }

  public static class FontSchemeValueConverter {
    private FontSchemeValueConverter() {
    }

    public static BaseStylesOverrideModel.FontSchemeValueModel fromDocx4J(
        CTBaseStylesOverride.FontScheme value) {
      if (value == null) return null;
      return new BaseStylesOverrideModel.FontSchemeValueModel(StringValueConverter.fromDocx4J(value.getName()), FontCollectionValueConverter.fromDocx4J(value.getMajorFont()), FontCollectionValueConverter.fromDocx4J(value.getMinorFont()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }
  }
}
