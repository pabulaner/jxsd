package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_FontCollectionModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTFontCollection;

public class CT_FontCollectionConverter {
  private CT_FontCollectionConverter() {
  }

  public static CT_FontCollectionModel fromDocx4J(CTFontCollection value) {
    if (value == null) return null;
    return new CT_FontCollectionModel(CT_TextFontConverter.fromDocx4J(value.getLatin()), CT_TextFontConverter.fromDocx4J(value.getEa()), CT_TextFontConverter.fromDocx4J(value.getCs()), value.getFont().stream().map(FontConverter::fromDocx4J).collect(Collectors.toList()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTFontCollection toDocx4J(CT_FontCollectionModel value) {
    return null;
  }

  public static class FontConverter {
    private FontConverter() {
    }

    public static CT_FontCollectionModel.FontModel fromDocx4J(CTFontCollection.Font value) {
      if (value == null) return null;
      return new CT_FontCollectionModel.FontModel(ST_TextTypefaceConverter.fromDocx4J(value.getTypeface()), StringConverter.fromDocx4J(value.getScript()));
    }

    public static CTFontCollection.Font toDocx4J(CT_FontCollectionModel.FontModel value) {
      return null;
    }
  }
}
