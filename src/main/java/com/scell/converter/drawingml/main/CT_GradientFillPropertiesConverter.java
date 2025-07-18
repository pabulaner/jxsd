package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import org.docx4j.dml.CTGradientFillProperties;

public class CT_GradientFillPropertiesConverter {
  private CT_GradientFillPropertiesConverter() {
  }

  public static CT_GradientFillPropertiesModel fromDocx4J(CTGradientFillProperties value) {
    if (value == null) return null;
    // look here false;
    CT_GradientFillPropertiesModel.EG_ShadePropertiesModel egShadeProperties = new CT_GradientFillPropertiesModel.EG_ShadePropertiesModel();
    if (value.getLin() != null) egShadeProperties = CT_GradientFillPropertiesModel.EG_ShadePropertiesModel.newLin(CT_LinearShadePropertiesConverter.fromDocx4J(value.getLin()));
    if (value.getPath() != null) egShadeProperties = CT_GradientFillPropertiesModel.EG_ShadePropertiesModel.newPath(CT_PathShadePropertiesConverter.fromDocx4J(value.getPath()));
    return new CT_GradientFillPropertiesModel(BooleanConverter.fromDocx4J(value.getRotWithShape()), ST_TileFlipModeConverter.fromDocx4J(value.getFlip()), CT_GradientStopListConverter.fromDocx4J(value.getGsLst()), egShadeProperties, CT_RelativeRectConverter.fromDocx4J(value.getTileRect()));
  }

  public static CTGradientFillProperties toDocx4J(CT_GradientFillPropertiesModel value) {
    return null;
  }
}
