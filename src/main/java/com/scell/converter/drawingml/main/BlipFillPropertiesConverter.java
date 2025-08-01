package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import org.docx4j.dml.CTBlipFillProperties;

public class BlipFillPropertiesConverter {
  private BlipFillPropertiesConverter() {
  }

  public static BlipFillPropertiesModel fromDocx4J(CTBlipFillProperties value) {
    if (value == null) return null;
    BlipFillPropertiesModel.FillModePropertiesModel egFillModeProperties = new BlipFillPropertiesModel.FillModePropertiesModel();
    if (value.getTile() != null) egFillModeProperties = BlipFillPropertiesModel.FillModePropertiesModel.newTile(TileInfoPropertiesConverter.fromDocx4J(value.getTile()));
    if (value.getStretch() != null) egFillModeProperties = BlipFillPropertiesModel.FillModePropertiesModel.newStretch(StretchInfoPropertiesConverter.fromDocx4J(value.getStretch()));
    return new BlipFillPropertiesModel(BooleanValueConverter.fromDocx4J(value.isRotWithShape()), UnsignedIntValueConverter.fromDocx4J(value.getDpi()), BlipConverter.fromDocx4J(value.getBlip()), RelativeRectConverter.fromDocx4J(value.getSrcRect()), egFillModeProperties);
  }
}
