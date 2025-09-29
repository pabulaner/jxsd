package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.DefaultShapeDefinitionModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.ShapeStyleModel;
import jxsd.gen.model.drawingml.main.TextBodyPropertiesModel;
import jxsd.gen.model.drawingml.main.TextListStyleModel;

/**
 * This is a generated sequence class.
 */
public class DefaultShapeDefinitionBuilder {
  private ShapePropertiesModel spPr;

  private TextBodyPropertiesModel bodyPr;

  private TextListStyleModel lstStyle;

  private ShapeStyleModel style;

  private OfficeArtExtensionListModel extLst;

  public DefaultShapeDefinitionBuilder() {
  }

  public DefaultShapeDefinitionBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public DefaultShapeDefinitionBuilder setBodyPr(TextBodyPropertiesModel bodyPr) {
    this.bodyPr = bodyPr;
    return this;
  }

  public DefaultShapeDefinitionBuilder setLstStyle(TextListStyleModel lstStyle) {
    this.lstStyle = lstStyle;
    return this;
  }

  public DefaultShapeDefinitionBuilder setStyle(ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public DefaultShapeDefinitionBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DefaultShapeDefinitionBuilder from(DefaultShapeDefinitionModel value) {
    this.spPr = value.getSpPr();
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.style = value.getStyle();
    this.extLst = value.getExtLst();
    return this;
  }

  public DefaultShapeDefinitionModel build() {
    return new DefaultShapeDefinitionModel(this.spPr, this.bodyPr, this.lstStyle, this.style, this.extLst);
  }
}
