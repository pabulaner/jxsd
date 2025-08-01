package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import java.util.List;

public class FontCollectionValueModel {
  private final TextFontValueModel latin;

  private final TextFontValueModel ea;

  private final TextFontValueModel cs;

  private final List<FontValueModel> font;

  private final OfficeArtExtensionListModel extLst;

  public FontCollectionValueModel(TextFontValueModel latin, TextFontValueModel ea,
      TextFontValueModel cs, List<FontValueModel> font, OfficeArtExtensionListModel extLst) {
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.font = font;
    this.extLst = extLst;
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

  public List<FontValueModel> getFont() {
    return this.font;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FontValueModel {
    private final TextTypefaceValueModel typeface;

    private final StringValueModel script;

    public FontValueModel(TextTypefaceValueModel typeface, StringValueModel script) {
      this.typeface = typeface;
      this.script = script;
    }

    public TextTypefaceValueModel getTypeface() {
      return this.typeface;
    }

    public StringValueModel getScript() {
      return this.script;
    }
  }
}
