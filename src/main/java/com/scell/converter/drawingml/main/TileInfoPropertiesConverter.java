package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TileInfoPropertiesModel;
import org.docx4j.dml.CTTileInfoProperties;

public class TileInfoPropertiesConverter {
  private TileInfoPropertiesConverter() {
  }

  public static TileInfoPropertiesModel fromDocx4J(CTTileInfoProperties value) {
    if (value == null) return null;
    return new TileInfoPropertiesModel(PercentageValueConverter.fromDocx4J(value.getSy()), CoordinateValueConverter.fromDocx4J(value.getTy()), PercentageValueConverter.fromDocx4J(value.getSx()), TileFlipModeValueConverter.fromDocx4J(value.getFlip()), CoordinateValueConverter.fromDocx4J(value.getTx()), RectAlignmentValueConverter.fromDocx4J(value.getAlgn()));
  }
}
