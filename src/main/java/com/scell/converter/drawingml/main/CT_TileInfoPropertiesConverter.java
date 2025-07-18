package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TileInfoPropertiesModel;
import org.docx4j.dml.CTTileInfoProperties;

public class CT_TileInfoPropertiesConverter {
  private CT_TileInfoPropertiesConverter() {
  }

  public static CT_TileInfoPropertiesModel fromDocx4J(CTTileInfoProperties value) {
    if (value == null) return null;
    return new CT_TileInfoPropertiesModel(ST_PercentageConverter.fromDocx4J(value.getSy()), ST_CoordinateConverter.fromDocx4J(value.getTy()), ST_PercentageConverter.fromDocx4J(value.getSx()), ST_TileFlipModeConverter.fromDocx4J(value.getFlip()), ST_CoordinateConverter.fromDocx4J(value.getTx()), ST_RectAlignmentConverter.fromDocx4J(value.getAlgn()));
  }

  public static CTTileInfoProperties toDocx4J(CT_TileInfoPropertiesModel value) {
    return null;
  }
}
