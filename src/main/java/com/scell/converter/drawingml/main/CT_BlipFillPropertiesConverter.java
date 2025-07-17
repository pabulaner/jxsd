package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import org.docx4j.dml.CTBlipFillProperties;

public class CT_BlipFillPropertiesConverter {
  private CT_BlipFillPropertiesConverter() {
  }

  public static CT_BlipFillPropertiesModel fromDocx4j(CTBlipFillProperties value) {
    if (value == null) return null;
    return new CT_BlipFillPropertiesModel(BooleanConverter.fromDocx4j(value.getRotWithShape()), UnsignedIntConverter.fromDocx4j(value.getDpi()), CT_BlipConverter.fromDocx4j(value.getBlip()), CT_RelativeRectConverter.fromDocx4j(value.getSrcRect()), TileOrStretchConverter.fromDocx4j(value.getTileOrStretch()));
  }

  public static CTBlipFillProperties toDocx4j(CT_BlipFillPropertiesModel value) {
    return null;
  }

  public static class TileOrStretchConverter {
    private TileOrStretchConverter() {
    }

    public static CT_BlipFillPropertiesModel.TileOrStretchModel fromDocx4j(
        CTBlipFillProperties.TileOrStretch value) {
      if (value == null) return null;
    }

    public static CTBlipFillProperties.TileOrStretch toDocx4j(
        CT_BlipFillPropertiesModel.TileOrStretchModel value) {
      return null;
    }
  }
}
