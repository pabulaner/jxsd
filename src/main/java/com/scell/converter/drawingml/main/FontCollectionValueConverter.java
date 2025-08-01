package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.FontCollectionValueModel;
import java.util.stream.Collectors;
import org.docx4j.dml.FontCollection;

public class FontCollectionValueConverter {
  private FontCollectionValueConverter() {
  }

  public static FontCollectionValueModel fromDocx4J(FontCollection value) {
    if (value == null) return null;
    return new FontCollectionValueModel(TextFontValueConverter.fromDocx4J(value.getLatin()), TextFontValueConverter.fromDocx4J(value.getEa()), TextFontValueConverter.fromDocx4J(value.getCs()), value.getFont().stream().map(FontValueConverter::fromDocx4J).collect(Collectors.toList()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static class FontValueConverter {
    private FontValueConverter() {
    }

    public static FontCollectionValueModel.FontValueModel fromDocx4J(FontCollection.Font value) {
      if (value == null) return null;
      return new FontCollectionValueModel.FontValueModel(TextTypefaceValueConverter.fromDocx4J(value.getTypeface()), StringValueConverter.fromDocx4J(value.getScript()));
    }
  }
}
