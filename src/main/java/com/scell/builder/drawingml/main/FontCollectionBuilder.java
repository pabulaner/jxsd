package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.FontCollectionModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.TextFontModel;
import com.scell.model.drawingml.main.TextTypefaceModel;
import java.util.List;

public class FontCollectionBuilder {
  private TextFontModel latin;

  private TextFontModel ea;

  private TextFontModel cs;

  private List<FontCollectionModel.FontModel> font;

  private OfficeArtExtensionListModel extLst;

  public FontCollectionBuilder() {
  }

  public FontCollectionBuilder setLatin(TextFontModel latin) {
    this.latin = latin;
    return this;
  }

  public FontCollectionBuilder setEa(TextFontModel ea) {
    this.ea = ea;
    return this;
  }

  public FontCollectionBuilder setCs(TextFontModel cs) {
    this.cs = cs;
    return this;
  }

  public FontCollectionBuilder setFont(List<FontCollectionModel.FontModel> font) {
    this.font = font;
    return this;
  }

  public FontCollectionBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public FontCollectionModel build() {
    return new FontCollectionModel(this.latin, this.ea, this.cs, this.font, this.extLst);
  }

  public FontCollectionBuilder from(FontCollectionModel value) {
    this.latin = value.getLatin();
    this.ea = value.getEa();
    this.cs = value.getCs();
    this.font = value.getFont();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class FontBuilder {
    private TextTypefaceModel typeface;

    private StringModel script;

    public FontBuilder() {
    }

    public FontBuilder setTypeface(TextTypefaceModel typeface) {
      this.typeface = typeface;
      return this;
    }

    public FontBuilder setScript(StringModel script) {
      this.script = script;
      return this;
    }

    public FontCollectionModel.FontModel build() {
      return new FontCollectionModel.FontModel(this.typeface, this.script);
    }

    public FontBuilder from(FontCollectionModel.FontModel value) {
      this.typeface = value.getTypeface();
      this.script = value.getScript();
      return this;
    }
  }
}
