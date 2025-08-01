package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigModel;
import org.docx4j.dml.CTLightRig;

public class LightRigConverter {
  private LightRigConverter() {
  }

  public static LightRigModel fromDocx4J(CTLightRig value) {
    if (value == null) return null;
    return new LightRigModel(LightRigTypeValueConverter.fromDocx4J(value.getRig()), LightRigDirectionValueConverter.fromDocx4J(value.getDir()), SphereCoordsConverter.fromDocx4J(value.getRot()));
  }
}
