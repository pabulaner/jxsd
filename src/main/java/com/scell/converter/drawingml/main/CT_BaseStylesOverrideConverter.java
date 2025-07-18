package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_BaseStylesOverrideModel;
import org.docx4j.dml.CTBaseStylesOverride;

public class CT_BaseStylesOverrideConverter {
  private CT_BaseStylesOverrideConverter() {
  }

  public static CT_BaseStylesOverrideModel fromDocx4J(CTBaseStylesOverride value) {
    if (value == null) return null;
    return new CT_BaseStylesOverrideModel(CT_ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeConverter.fromDocx4J(value.getFontScheme()), CT_StyleMatrixConverter.fromDocx4J(value.getFmtScheme()));
  }

  public static CTBaseStylesOverride toDocx4J(CT_BaseStylesOverrideModel value) {
    return null;
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static CT_BaseStylesOverrideModel.FontSchemeModel fromDocx4J(
        CTBaseStylesOverride.FontScheme value) {
      if (value == null) return null;
      return new CT_BaseStylesOverrideModel.FontSchemeModel(StringConverter.fromDocx4J(value.getName()), CT_FontCollectionConverter.fromDocx4J(value.getMajorFont()), CT_FontCollectionConverter.fromDocx4J(value.getMinorFont()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }

    public static CTBaseStylesOverride.FontScheme toDocx4J(
        CT_BaseStylesOverrideModel.FontSchemeModel value) {
      return null;
    }
  }
}
