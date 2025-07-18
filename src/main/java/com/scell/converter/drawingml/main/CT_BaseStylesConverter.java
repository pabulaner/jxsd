package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_BaseStylesModel;
import org.docx4j.dml.CTBaseStyles;

public class CT_BaseStylesConverter {
  private CT_BaseStylesConverter() {
  }

  public static CT_BaseStylesModel fromDocx4J(CTBaseStyles value) {
    if (value == null) return null;
    return new CT_BaseStylesModel(CT_ColorSchemeConverter.fromDocx4J(value.getClrScheme()), FontSchemeConverter.fromDocx4J(value.getFontScheme()), CT_StyleMatrixConverter.fromDocx4J(value.getFmtScheme()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBaseStyles toDocx4J(CT_BaseStylesModel value) {
    return null;
  }

  public static class FontSchemeConverter {
    private FontSchemeConverter() {
    }

    public static CT_BaseStylesModel.FontSchemeModel fromDocx4J(CTBaseStyles.FontScheme value) {
      if (value == null) return null;
      return new CT_BaseStylesModel.FontSchemeModel(StringConverter.fromDocx4J(value.getName()), CT_FontCollectionConverter.fromDocx4J(value.getMajorFont()), CT_FontCollectionConverter.fromDocx4J(value.getMinorFont()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
    }

    public static CTBaseStyles.FontScheme toDocx4J(CT_BaseStylesModel.FontSchemeModel value) {
      return null;
    }
  }
}
