package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_FontCollectionModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_TextFontModel;
import com.scell.model.drawingml.main.ST_TextTypefaceModel;
import java.util.List;

public class CT_FontCollectionBuilder {
  private CT_TextFontModel latin;

  private CT_TextFontModel ea;

  private CT_TextFontModel cs;

  private List<CT_FontCollectionModel.FontModel> font;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_FontCollectionBuilder() {
  }

  public CT_FontCollectionBuilder setLatin(CT_TextFontModel latin) {
    this.latin = latin;
    return this;
  }

  public CT_FontCollectionBuilder setEa(CT_TextFontModel ea) {
    this.ea = ea;
    return this;
  }

  public CT_FontCollectionBuilder setCs(CT_TextFontModel cs) {
    this.cs = cs;
    return this;
  }

  public CT_FontCollectionBuilder setFont(List<CT_FontCollectionModel.FontModel> font) {
    this.font = font;
    return this;
  }

  public CT_FontCollectionBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_FontCollectionModel build() {
    return new CT_FontCollectionModel(this.latin, this.ea, this.cs, this.font, this.extLst);
  }

  public CT_FontCollectionBuilder from(CT_FontCollectionModel value) {
    this.latin = value.getLatin();
    this.ea = value.getEa();
    this.cs = value.getCs();
    this.font = value.getFont();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class FontBuilder {
    private ST_TextTypefaceModel typeface;

    private StringModel script;

    public FontBuilder() {
    }

    public FontBuilder setTypeface(ST_TextTypefaceModel typeface) {
      this.typeface = typeface;
      return this;
    }

    public FontBuilder setScript(StringModel script) {
      this.script = script;
      return this;
    }

    public CT_FontCollectionModel.FontModel build() {
      return new CT_FontCollectionModel.FontModel(this.typeface, this.script);
    }

    public FontBuilder from(CT_FontCollectionModel.FontModel value) {
      this.typeface = value.getTypeface();
      this.script = value.getScript();
      return this;
    }
  }
}
