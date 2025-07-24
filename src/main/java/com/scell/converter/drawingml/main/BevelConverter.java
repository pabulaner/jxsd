package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BevelModel;
import org.docx4j.dml.CTBevel;

public class BevelConverter {
  private BevelConverter() {
  }

  public static BevelModel fromDocx4J(CTBevel value) {
    if (value == null) return null;
    return new BevelModel(PositiveCoordinateConverter.fromDocx4J(value.getH()), PositiveCoordinateConverter.fromDocx4J(value.getW()), BevelPresetTypeConverter.fromDocx4J(value.getPrst()));
  }
}
