package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.FontCollectionModel;
import java.util.stream.Collectors;
import org.docx4j.dml.FontCollection;

public class FontCollectionConverter {
  private FontCollectionConverter() {
  }

  public static FontCollectionModel fromDocx4J(FontCollection value) {
    if (value == null) return null;
    return new FontCollectionModel(TextFontConverter.fromDocx4J(value.getLatin()), TextFontConverter.fromDocx4J(value.getEa()), TextFontConverter.fromDocx4J(value.getCs()), value.getFont().stream().map(FontConverter::fromDocx4J).collect(Collectors.toList()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static class FontConverter {
    private FontConverter() {
    }

    public static FontCollectionModel.FontModel fromDocx4J(FontCollection.Font value) {
      if (value == null) return null;
      return new FontCollectionModel.FontModel(TextTypefaceConverter.fromDocx4J(value.getTypeface()), StringConverter.fromDocx4J(value.getScript()));
    }
  }
}
