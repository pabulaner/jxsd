package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.DefaultShapeDefinitionBuilder;

/**
 * This is a generated sequence class.
 */
public class DefaultShapeDefinitionModel {
  private final ShapePropertiesModel spPr;

  private final TextBodyPropertiesModel bodyPr;

  private final TextListStyleModel lstStyle;

  private final ShapeStyleModel style;

  private final OfficeArtExtensionListModel extLst;

  public DefaultShapeDefinitionModel(ShapePropertiesModel spPr, TextBodyPropertiesModel bodyPr,
      TextListStyleModel lstStyle, ShapeStyleModel style, OfficeArtExtensionListModel extLst) {
    this.spPr = spPr;
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.style = style;
    this.extLst = extLst;
  }

  public DefaultShapeDefinitionBuilder builder() {
    return new DefaultShapeDefinitionBuilder().from(this);
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public TextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
