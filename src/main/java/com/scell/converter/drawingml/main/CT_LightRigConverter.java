package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LightRigModel;
import org.docx4j.dml.CTLightRig;

public class CT_LightRigConverter {
  private CT_LightRigConverter() {
  }

  public static CT_LightRigModel fromDocx4J(CTLightRig value) {
    if (value == null) return null;
    return new CT_LightRigModel(ST_LightRigTypeConverter.fromDocx4J(value.getRig()), ST_LightRigDirectionConverter.fromDocx4J(value.getDir()), CT_SphereCoordsConverter.fromDocx4J(value.getRot()));
  }

  public static CTLightRig toDocx4J(CT_LightRigModel value) {
    return null;
  }
}
