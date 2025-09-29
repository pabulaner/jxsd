package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.FontCollectionValueModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.TextFontValueModel;

/**
 * This is a generated sequence class.
 */
public class FontCollectionValueBuilder {
  private TextFontValueModel latin;

  private TextFontValueModel ea;

  private TextFontValueModel cs;

  private List<FontCollectionValueModel.Font> font;

  private OfficeArtExtensionListModel extLst;

  public FontCollectionValueBuilder() {
  }

  public FontCollectionValueBuilder setLatin(TextFontValueModel latin) {
    this.latin = latin;
    return this;
  }

  public FontCollectionValueBuilder setEa(TextFontValueModel ea) {
    this.ea = ea;
    return this;
  }

  public FontCollectionValueBuilder setCs(TextFontValueModel cs) {
    this.cs = cs;
    return this;
  }

  public FontCollectionValueBuilder setFont(List<FontCollectionValueModel.Font> font) {
    this.font = font;
    return this;
  }

  public FontCollectionValueBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public FontCollectionValueBuilder from(FontCollectionValueModel value) {
    this.latin = value.getLatin();
    this.ea = value.getEa();
    this.cs = value.getCs();
    this.font = value.getFont();
    this.extLst = value.getExtLst();
    return this;
  }

  public FontCollectionValueModel build() {
    return new FontCollectionValueModel(this.latin, this.ea, this.cs, this.font, this.extLst);
  }

  /**
   * This is a generated sequence class.
   */
  public static class Font {
    private String typeface;

    private String script;

    public Font() {
    }

    public Font setTypeface(String typeface) {
      this.typeface = typeface;
      return this;
    }

    public Font setScript(String script) {
      this.script = script;
      return this;
    }

    public Font from(FontCollectionValueModel.Font value) {
      this.typeface = value.getTypeface();
      this.script = value.getScript();
      return this;
    }

    public FontCollectionValueModel.Font build() {
      return new FontCollectionValueModel.Font(this.typeface, this.script);
    }
  }
}
