package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextTabAlignTypeValueModel;
import jxsd.gen.model.drawingml.main.TextTabStopModel;

/**
 * This is a generated sequence class.
 */
public class TextTabStopBuilder {
  private int pos;

  private TextTabAlignTypeValueModel algn;

  public TextTabStopBuilder() {
  }

  public TextTabStopBuilder setPos(int pos) {
    this.pos = pos;
    return this;
  }

  public TextTabStopBuilder setAlgn(TextTabAlignTypeValueModel algn) {
    this.algn = algn;
    return this;
  }

  public TextTabStopBuilder from(TextTabStopModel value) {
    this.pos = value.getPos();
    this.algn = value.getAlgn();
    return this;
  }

  public TextTabStopModel build() {
    return new TextTabStopModel(this.pos, this.algn);
  }
}
