package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.FontCollectionValueModel;
import org.docx4j.dml.FontCollection;

/**
 * This is a generated sequence class.
 */
public class FontCollectionValueConverter {
  private FontCollectionValueConverter() {
  }

  public static FontCollectionValueModel fromDocx4j(FontCollection value) {
    if (value == null) return null;
    return new FontCollectionValueModel(TextFontValueConverter.fromDocx4j(value.getLatin()), TextFontValueConverter.fromDocx4j(value.getEa()), TextFontValueConverter.fromDocx4j(value.getCs()), value.getFont().stream().map(Font::fromDocx4j).collect(Collectors.toList()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static FontCollection toDocx4j(FontCollectionValueModel value) {
    if (value == null) return null;
    FontCollection result = new FontCollection();
    result.setLatin(TextFontValueConverter.toDocx4j(value.getLatin()));
    result.setEa(TextFontValueConverter.toDocx4j(value.getEa()));
    result.setCs(TextFontValueConverter.toDocx4j(value.getCs()));
    result.getFont().addAll(value.getFont().stream().map(Font::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }

  /**
   * This is a generated sequence class.
   */
  public static class Font {
    private Font() {
    }

    public static FontCollectionValueModel.Font fromDocx4j(FontCollection.Font value) {
      if (value == null) return null;
      return new FontCollectionValueModel.Font(TextTypefaceValueConverter.fromDocx4j(value.getTypeface()), StringValueConverter.fromDocx4j(value.getScript()));
    }

    public static FontCollection.Font toDocx4j(FontCollectionValueModel.Font value) {
      if (value == null) return null;
      FontCollection.Font result = new FontCollection.Font();
      result.setTypeface(TextTypefaceValueConverter.toDocx4j(value.getTypeface()));
      result.setScript(StringValueConverter.toDocx4j(value.getScript()));
      return result;
    }
  }
}
