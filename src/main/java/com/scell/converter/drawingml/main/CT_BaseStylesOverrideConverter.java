package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_BaseStylesOverrideModel;
import org.docx4j.dml.CTBaseStylesOverride;

public class CT_BaseStylesOverrideConverter {
  private CT_BaseStylesOverrideConverter() {
  }

  public static CT_BaseStylesOverrideModel fromDocx4j(CTBaseStylesOverride value) {
    if (value == null) return null;
    return new CT_BaseStylesOverrideModel(CT_ColorSchemeConverter.fromDocx4j(value.getClrScheme()), FontSchemeConverter.fromDocx4j(value.getFontScheme()), CT_StyleMatrixConverter.fromDocx4j(value.getFmtScheme()));
  }

  public static CTBaseStylesOverride toDocx4j(CT_BaseStylesOverrideModel value) {
    return null;
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static CT_BaseStylesOverrideModel.FontSchemeModel fromDocx4j(
        CTBaseStylesOverride.FontScheme value) {
      if (value == null) return null;
      return new CT_BaseStylesOverrideModel.FontSchemeModel(StringConverter.fromDocx4j(value.getName()), CT_FontCollectionConverter.fromDocx4j(value.getMajorFont()), CT_FontCollectionConverter.fromDocx4j(value.getMinorFont()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
    }

    public static CTBaseStylesOverride.FontScheme toDocx4j(
        CT_BaseStylesOverrideModel.FontSchemeModel value) {
      return null;
    }
  }
}
