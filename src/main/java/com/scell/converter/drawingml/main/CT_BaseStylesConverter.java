package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_BaseStylesModel;
import org.docx4j.dml.CTBaseStyles;

public class CT_BaseStylesConverter {
  private CT_BaseStylesConverter() {
  }

  public static CT_BaseStylesModel fromDocx4j(CTBaseStyles value) {
    if (value == null) return null;
    return new CT_BaseStylesModel(CT_ColorSchemeConverter.fromDocx4j(value.getClrScheme()), FontSchemeConverter.fromDocx4j(value.getFontScheme()), CT_StyleMatrixConverter.fromDocx4j(value.getFmtScheme()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBaseStyles toDocx4j(CT_BaseStylesModel value) {
    return null;
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static CT_BaseStylesModel.FontSchemeModel fromDocx4j(CTBaseStyles.FontScheme value) {
      if (value == null) return null;
      return new CT_BaseStylesModel.FontSchemeModel(StringConverter.fromDocx4j(value.getName()), CT_FontCollectionConverter.fromDocx4j(value.getMajorFont()), CT_FontCollectionConverter.fromDocx4j(value.getMinorFont()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
    }

    public static CTBaseStyles.FontScheme toDocx4j(CT_BaseStylesModel.FontSchemeModel value) {
      return null;
    }
  }
}
