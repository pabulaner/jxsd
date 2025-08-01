package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.FontCollectionValueModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.TextFontValueModel;
import com.scell.model.drawingml.main.TextTypefaceValueModel;
import java.util.List;

public class FontCollectionValueBuilder {
  private TextFontValueModel latin;

  private TextFontValueModel ea;

  private TextFontValueModel cs;

  private List<FontCollectionValueModel.FontValueModel> font;

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

  public FontCollectionValueBuilder setFont(List<FontCollectionValueModel.FontValueModel> font) {
    this.font = font;
    return this;
  }

  public FontCollectionValueBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public FontCollectionValueModel build() {
    return new FontCollectionValueModel(this.latin, this.ea, this.cs, this.font, this.extLst);
  }

  public FontCollectionValueBuilder from(FontCollectionValueModel value) {
    this.latin = value.getLatin();
    this.ea = value.getEa();
    this.cs = value.getCs();
    this.font = value.getFont();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class FontValueBuilder {
    private TextTypefaceValueModel typeface;

    private StringValueModel script;

    public FontValueBuilder() {
    }

    public FontValueBuilder setTypeface(TextTypefaceValueModel typeface) {
      this.typeface = typeface;
      return this;
    }

    public FontValueBuilder setScript(StringValueModel script) {
      this.script = script;
      return this;
    }

    public FontCollectionValueModel.FontValueModel build() {
      return new FontCollectionValueModel.FontValueModel(this.typeface, this.script);
    }

    public FontValueBuilder from(FontCollectionValueModel.FontValueModel value) {
      this.typeface = value.getTypeface();
      this.script = value.getScript();
      return this;
    }
  }
}
