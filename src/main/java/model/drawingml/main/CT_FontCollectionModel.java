package model.drawingml.main;

import java.util.List;
import model.XMLSchema.stringModel;

public class CT_FontCollectionModel {
  private final CT_TextFontModel latin;

  private final CT_TextFontModel ea;

  private final CT_TextFontModel cs;

  private final List<fontModel> font;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_FontCollectionModel(CT_TextFontModel latin, CT_TextFontModel ea, CT_TextFontModel cs,
      List<fontModel> font, CT_OfficeArtExtensionListModel extLst) {
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

  public List<fontModel> getFont() {
    return this.font;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class fontModel {
    private final ST_TextTypefaceModel typeface;

    private final stringModel script;

    public fontModel(ST_TextTypefaceModel typeface, stringModel script) {
      this.typeface = typeface;
      this.script = script;
    }

    public ST_TextTypefaceModel getTypeface() {
      return this.typeface;
    }

    public stringModel getScript() {
      return this.script;
    }
  }
}
