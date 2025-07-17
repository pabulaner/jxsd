package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_FontCollectionModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTFontCollection;

public class CT_FontCollectionConverter {
  private CT_FontCollectionConverter() {
  }

  public static CT_FontCollectionModel fromDocx4j(CTFontCollection value) {
    if (value == null) return null;
    return new CT_FontCollectionModel(CT_TextFontConverter.fromDocx4j(value.getLatin()), CT_TextFontConverter.fromDocx4j(value.getEa()), CT_TextFontConverter.fromDocx4j(value.getCs()), value.getFont().stream().map(FontConverter::fromDocx4j).collect(Collectors.toList()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTFontCollection toDocx4j(CT_FontCollectionModel value) {
    return null;
  }

  public static class FontConverter {
    private FontConverter() {
    }

    public static CT_FontCollectionModel.FontModel fromDocx4j(CTFontCollection.Font value) {
      if (value == null) return null;
      return new CT_FontCollectionModel.FontModel(ST_TextTypefaceConverter.fromDocx4j(value.getTypeface()), StringConverter.fromDocx4j(value.getScript()));
    }

    public static CTFontCollection.Font toDocx4j(CT_FontCollectionModel.FontModel value) {
      return null;
    }
  }
}
