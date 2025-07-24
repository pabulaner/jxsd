package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DefaultShapeDefinitionModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;
import com.scell.model.drawingml.main.TextBodyPropertiesModel;
import com.scell.model.drawingml.main.TextListStyleModel;

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

  public DefaultShapeDefinitionModel build() {
    return new DefaultShapeDefinitionModel(this.spPr, this.bodyPr, this.lstStyle, this.style, this.extLst);
  }

  public DefaultShapeDefinitionBuilder from(DefaultShapeDefinitionModel value) {
    this.spPr = value.getSpPr();
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.style = value.getStyle();
    this.extLst = value.getExtLst();
    return this;
  }
}
