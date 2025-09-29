package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.FontCollectionValueBuilder;

/**
 * This is a generated sequence class.
 */
public class FontCollectionValueModel {
  private final TextFontValueModel latin;

  private final TextFontValueModel ea;

  private final TextFontValueModel cs;

  private final List<Font> font;

  private final OfficeArtExtensionListModel extLst;

  public FontCollectionValueModel(TextFontValueModel latin, TextFontValueModel ea,
      TextFontValueModel cs, List<Font> font, OfficeArtExtensionListModel extLst) {
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.font = font;
    this.extLst = extLst;
  }

  public FontCollectionValueBuilder builder() {
    return new FontCollectionValueBuilder().from(this);
  }

  public TextFontValueModel getLatin() {
    return this.latin;
  }

  public TextFontValueModel getEa() {
    return this.ea;
  }

  public TextFontValueModel getCs() {
    return this.cs;
  }

  public List<Font> getFont() {
    return this.font;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated sequence class.
   */
  public static class Font {
    private final String typeface;

    private final String script;

    public Font(String typeface, String script) {
      this.typeface = typeface;
      this.script = script;
    }

    public FontCollectionValueBuilder.Font builder() {
      return new FontCollectionValueBuilder.Font().from(this);
    }

    public String getTypeface() {
      return this.typeface;
    }

    public String getScript() {
      return this.script;
    }
  }
}
