package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.CustomColorListModel;
import jxsd.gen.model.drawingml.main.CustomColorModel;

/**
 * This is a generated sequence class.
 */
public class CustomColorListBuilder {
  private List<CustomColorModel> custClr;

  public CustomColorListBuilder() {
  }

  public CustomColorListBuilder setCustClr(List<CustomColorModel> custClr) {
    this.custClr = custClr;
    return this;
  }

  public CustomColorListBuilder from(CustomColorListModel value) {
    this.custClr = value.getCustClr();
    return this;
  }

  public CustomColorListModel build() {
    return new CustomColorListModel(this.custClr);
  }
}
