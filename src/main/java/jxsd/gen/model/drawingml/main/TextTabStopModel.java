package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextTabStopBuilder;

/**
 * This is a generated sequence class.
 */
public class TextTabStopModel {
  private final int pos;

  private final TextTabAlignTypeValueModel algn;

  public TextTabStopModel(int pos, TextTabAlignTypeValueModel algn) {
    this.pos = pos;
    this.algn = algn;
  }

  public TextTabStopBuilder builder() {
    return new TextTabStopBuilder().from(this);
  }

  public int getPos() {
    return this.pos;
  }

  public TextTabAlignTypeValueModel getAlgn() {
    return this.algn;
  }
}
