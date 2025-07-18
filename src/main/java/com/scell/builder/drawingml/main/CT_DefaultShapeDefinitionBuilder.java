package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_DefaultShapeDefinitionModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_ShapeStyleModel;
import com.scell.model.drawingml.main.CT_TextBodyPropertiesModel;
import com.scell.model.drawingml.main.CT_TextListStyleModel;

public class CT_DefaultShapeDefinitionBuilder {
  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyPropertiesModel bodyPr;

  private CT_TextListStyleModel lstStyle;

  private CT_ShapeStyleModel style;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_DefaultShapeDefinitionBuilder() {
  }

  public CT_DefaultShapeDefinitionBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_DefaultShapeDefinitionBuilder setBodyPr(CT_TextBodyPropertiesModel bodyPr) {
    this.bodyPr = bodyPr;
    return this;
  }

  public CT_DefaultShapeDefinitionBuilder setLstStyle(CT_TextListStyleModel lstStyle) {
    this.lstStyle = lstStyle;
    return this;
  }

  public CT_DefaultShapeDefinitionBuilder setStyle(CT_ShapeStyleModel style) {
    this.style = style;
    return this;
  }

  public CT_DefaultShapeDefinitionBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DefaultShapeDefinitionModel build() {
    return new CT_DefaultShapeDefinitionModel(this.spPr, this.bodyPr, this.lstStyle, this.style, this.extLst);
  }

  public CT_DefaultShapeDefinitionBuilder from(CT_DefaultShapeDefinitionModel value) {
    this.spPr = value.getSpPr();
    this.bodyPr = value.getBodyPr();
    this.lstStyle = value.getLstStyle();
    this.style = value.getStyle();
    this.extLst = value.getExtLst();
    return this;
  }
}
