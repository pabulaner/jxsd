package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TileInfoPropertiesModel;
import org.docx4j.dml.CTTileInfoProperties;

public class CT_TileInfoPropertiesConverter {
  private CT_TileInfoPropertiesConverter() {
  }

  public static CT_TileInfoPropertiesModel fromDocx4j(CTTileInfoProperties value) {
    if (value == null) return null;
    return new CT_TileInfoPropertiesModel(ST_PercentageConverter.fromDocx4j(value.getSy()), ST_CoordinateConverter.fromDocx4j(value.getTy()), ST_PercentageConverter.fromDocx4j(value.getSx()), ST_TileFlipModeConverter.fromDocx4j(value.getFlip()), ST_CoordinateConverter.fromDocx4j(value.getTx()), ST_RectAlignmentConverter.fromDocx4j(value.getAlgn()));
  }

  public static CTTileInfoProperties toDocx4j(CT_TileInfoPropertiesModel value) {
    return null;
  }
}
