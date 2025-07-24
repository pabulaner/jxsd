package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TileInfoPropertiesModel;
import org.docx4j.dml.CTTileInfoProperties;

public class TileInfoPropertiesConverter {
  private TileInfoPropertiesConverter() {
  }

  public static TileInfoPropertiesModel fromDocx4J(CTTileInfoProperties value) {
    if (value == null) return null;
    return new TileInfoPropertiesModel(PercentageConverter.fromDocx4J(value.getSy()), CoordinateConverter.fromDocx4J(value.getTy()), PercentageConverter.fromDocx4J(value.getSx()), TileFlipModeConverter.fromDocx4J(value.getFlip()), CoordinateConverter.fromDocx4J(value.getTx()), RectAlignmentConverter.fromDocx4J(value.getAlgn()));
  }
}
