package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import org.docx4j.dml.CTGradientFillProperties;

public class GradientFillPropertiesConverter {
  private GradientFillPropertiesConverter() {
  }

  public static GradientFillPropertiesModel fromDocx4J(CTGradientFillProperties value) {
    if (value == null) return null;
    GradientFillPropertiesModel.ShadePropertiesModel egShadeProperties = new GradientFillPropertiesModel.ShadePropertiesModel();
    if (value.getLin() != null) egShadeProperties = GradientFillPropertiesModel.ShadePropertiesModel.newLin(LinearShadePropertiesConverter.fromDocx4J(value.getLin()));
    if (value.getPath() != null) egShadeProperties = GradientFillPropertiesModel.ShadePropertiesModel.newPath(PathShadePropertiesConverter.fromDocx4J(value.getPath()));
    return new GradientFillPropertiesModel(BooleanConverter.fromDocx4J(value.isRotWithShape()), TileFlipModeConverter.fromDocx4J(value.getFlip()), GradientStopListConverter.fromDocx4J(value.getGsLst()), egShadeProperties, RelativeRectConverter.fromDocx4J(value.getTileRect()));
  }
}
