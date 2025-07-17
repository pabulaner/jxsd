package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BevelModel;
import org.docx4j.dml.CTBevel;

public class CT_BevelConverter {
  private CT_BevelConverter() {
  }

  public static CT_BevelModel fromDocx4j(CTBevel value) {
    if (value == null) return null;
    return new CT_BevelModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getH()), ST_PositiveCoordinateConverter.fromDocx4j(value.getW()), ST_BevelPresetTypeConverter.fromDocx4j(value.getPrst()));
  }

  public static CTBevel toDocx4j(CT_BevelModel value) {
    return null;
  }
}
