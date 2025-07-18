package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import org.docx4j.dml.CTBlipFillProperties;

public class CT_BlipFillPropertiesConverter {
  private CT_BlipFillPropertiesConverter() {
  }

  public static CT_BlipFillPropertiesModel fromDocx4J(CTBlipFillProperties value) {
    if (value == null) return null;
    // look here false;
    CT_BlipFillPropertiesModel.EG_FillModePropertiesModel egFillModeProperties = new CT_BlipFillPropertiesModel.EG_FillModePropertiesModel();
    if (value.getTile() != null) egFillModeProperties = CT_BlipFillPropertiesModel.EG_FillModePropertiesModel.newTile(CT_TileInfoPropertiesConverter.fromDocx4J(value.getTile()));
    if (value.getStretch() != null) egFillModeProperties = CT_BlipFillPropertiesModel.EG_FillModePropertiesModel.newStretch(CT_StretchInfoPropertiesConverter.fromDocx4J(value.getStretch()));
    return new CT_BlipFillPropertiesModel(BooleanConverter.fromDocx4J(value.getRotWithShape()), UnsignedIntConverter.fromDocx4J(value.getDpi()), CT_BlipConverter.fromDocx4J(value.getBlip()), CT_RelativeRectConverter.fromDocx4J(value.getSrcRect()), egFillModeProperties);
  }

  public static CTBlipFillProperties toDocx4J(CT_BlipFillPropertiesModel value) {
    return null;
  }
}
