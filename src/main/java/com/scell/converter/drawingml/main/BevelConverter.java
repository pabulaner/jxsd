package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BevelModel;
import org.docx4j.dml.CTBevel;

public class BevelConverter {
  private BevelConverter() {
  }

  public static BevelModel fromDocx4J(CTBevel value) {
    if (value == null) return null;
    return new BevelModel(PositiveCoordinateValueConverter.fromDocx4J(value.getH()), PositiveCoordinateValueConverter.fromDocx4J(value.getW()), BevelPresetTypeValueConverter.fromDocx4J(value.getPrst()));
  }
}
