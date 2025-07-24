package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigModel;
import org.docx4j.dml.CTLightRig;

public class LightRigConverter {
  private LightRigConverter() {
  }

  public static LightRigModel fromDocx4J(CTLightRig value) {
    if (value == null) return null;
    return new LightRigModel(LightRigTypeConverter.fromDocx4J(value.getRig()), LightRigDirectionConverter.fromDocx4J(value.getDir()), SphereCoordsConverter.fromDocx4J(value.getRot()));
  }
}
