package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.TextSpacingBuilder;

/**
 * This is a generated choice class.
 */
public class TextSpacingModel {
  private final int type;

  private final Object value;

  public TextSpacingModel() {
    this(-1, null);
  }

  private TextSpacingModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public TextSpacingBuilder builder() {
    return new TextSpacingBuilder().from(this);
  }

  public static TextSpacingModel newSpcPct(TextSpacingPercentModel value) {
    return new TextSpacingModel(0, value);
  }

  public boolean isSpcPct() {
    return this.type == 0;
  }

  public TextSpacingPercentModel getSpcPct() {
    return (TextSpacingPercentModel) this.value;
  }

  public static TextSpacingModel newSpcPts(TextSpacingPointModel value) {
    return new TextSpacingModel(1, value);
  }

  public boolean isSpcPts() {
    return this.type == 1;
  }

  public TextSpacingPointModel getSpcPts() {
    return (TextSpacingPointModel) this.value;
  }
}
