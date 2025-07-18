package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import java.util.List;

public class CT_FontCollectionModel {
  private final CT_TextFontModel latin;

  private final CT_TextFontModel ea;

  private final CT_TextFontModel cs;

  private final List<FontModel> font;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_FontCollectionModel(CT_TextFontModel latin, CT_TextFontModel ea, CT_TextFontModel cs,
      List<FontModel> font, CT_OfficeArtExtensionListModel extLst) {
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.font = font;
    this.extLst = extLst;
  }

  public CT_TextFontModel getLatin() {
    return this.latin;
  }

  public CT_TextFontModel getEa() {
    return this.ea;
  }

  public CT_TextFontModel getCs() {
    return this.cs;
  }

  public List<FontModel> getFont() {
    return this.font;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FontModel {
    private final ST_TextTypefaceModel typeface;

    private final StringModel script;

    public FontModel(ST_TextTypefaceModel typeface, StringModel script) {
      this.typeface = typeface;
      this.script = script;
    }

    public ST_TextTypefaceModel getTypeface() {
      return this.typeface;
    }

    public StringModel getScript() {
      return this.script;
    }
  }
}
