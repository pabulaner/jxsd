package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ColorChangeEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class ColorChangeEffectModel {
  private final boolean useA;

  private final ColorModel clrFrom;

  private final ColorModel clrTo;

  public ColorChangeEffectModel(boolean useA, ColorModel clrFrom, ColorModel clrTo) {
    this.useA = useA;
    this.clrFrom = clrFrom;
    this.clrTo = clrTo;
  }

  public ColorChangeEffectBuilder builder() {
    return new ColorChangeEffectBuilder().from(this);
  }

  public boolean getUseA() {
    return this.useA;
  }

  public ColorModel getClrFrom() {
    return this.clrFrom;
  }

  public ColorModel getClrTo() {
    return this.clrTo;
  }
}
