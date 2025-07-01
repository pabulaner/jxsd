package test.drawingml.main;

import test.XMLSchema.StringModel;

public class CTFontCollectionModel {
  private final CTTextFontModel latin;

  private final CTTextFontModel ea;

  private final CTTextFontModel cs;

  private final FontModel font;

  private final CTOfficeArtExtensionListModel extLst;

  public CTFontCollectionModel(CTTextFontModel latin, CTTextFontModel ea, CTTextFontModel cs,
      FontModel font, CTOfficeArtExtensionListModel extLst) {
    this.latin = latin;
    this.ea = ea;
    this.cs = cs;
    this.font = font;
    this.extLst = extLst;
  }

  public CTTextFontModel getLatin() {
    return this.latin;
  }

  public CTTextFontModel getEa() {
    return this.ea;
  }

  public CTTextFontModel getCs() {
    return this.cs;
  }

  public FontModel getFont() {
    return this.font;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class FontModel {
    private final STTextTypefaceModel typeface;

    private final StringModel script;

    public FontModel(STTextTypefaceModel typeface, StringModel script) {
      this.typeface = typeface;
      this.script = script;
    }

    public STTextTypefaceModel getTypeface() {
      return this.typeface;
    }

    public StringModel getScript() {
      return this.script;
    }
  }
}
