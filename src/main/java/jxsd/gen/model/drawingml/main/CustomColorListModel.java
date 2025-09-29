package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.CustomColorListBuilder;

/**
 * This is a generated sequence class.
 */
public class CustomColorListModel {
  private final List<CustomColorModel> custClr;

  public CustomColorListModel(List<CustomColorModel> custClr) {
    this.custClr = custClr;
  }

  public CustomColorListBuilder builder() {
    return new CustomColorListBuilder().from(this);
  }

  public List<CustomColorModel> getCustClr() {
    return this.custClr;
  }
}
