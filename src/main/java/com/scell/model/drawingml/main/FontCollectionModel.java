package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import java.util.List;

public class FontCollectionModel {
  private final TextFontModel latin;

  private final TextFontModel ea;

  private final TextFontModel cs;

  private final List<FontModel> font;

  private final OfficeArtExtensionListModel extLst;

  public FontCollectionModel(TextFontModel latin, TextFontModel ea, TextFontModel cs,
      List<FontModel> font, OfficeArtExtensionListModel extLst) {
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.font = font;
    this.extLst = extLst;
  }

  public TextFontModel getLatin() {
    return this.latin;
  }

  public TextFontModel getEa() {
    return this.ea;
  }

  public TextFontModel getCs() {
    return this.cs;
  }

  public List<FontModel> getFont() {
    return this.font;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FontModel {
    private final TextTypefaceModel typeface;

    private final StringModel script;

    public FontModel(TextTypefaceModel typeface, StringModel script) {
      this.typeface = typeface;
      this.script = script;
    }

    public TextTypefaceModel getTypeface() {
      return this.typeface;
    }

    public StringModel getScript() {
      return this.script;
    }
  }
}
