package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BevelModel;
import org.docx4j.dml.CTBevel;

public class CT_BevelConverter {
  private CT_BevelConverter() {
  }

  public static CT_BevelModel fromDocx4J(CTBevel value) {
    if (value == null) return null;
    return new CT_BevelModel(ST_PositiveCoordinateConverter.fromDocx4J(value.getH()), ST_PositiveCoordinateConverter.fromDocx4J(value.getW()), ST_BevelPresetTypeConverter.fromDocx4J(value.getPrst()));
  }

  public static CTBevel toDocx4J(CT_BevelModel value) {
    return null;
  }
}
