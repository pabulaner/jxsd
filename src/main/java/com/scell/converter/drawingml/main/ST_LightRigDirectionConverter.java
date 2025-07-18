package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LightRigDirectionModel;
import org.docx4j.dml.STLightRigDirection;

public class ST_LightRigDirectionConverter {
  private ST_LightRigDirectionConverter() {
  }

  public static ST_LightRigDirectionModel fromDocx4J(STLightRigDirection value) {
    if (value == null) return null;
    if (value == STLightRigDirection.TL) return ST_LightRigDirectionModel.TL;
    if (value == STLightRigDirection.T) return ST_LightRigDirectionModel.T;
    if (value == STLightRigDirection.TR) return ST_LightRigDirectionModel.TR;
    if (value == STLightRigDirection.L) return ST_LightRigDirectionModel.L;
    if (value == STLightRigDirection.R) return ST_LightRigDirectionModel.R;
    if (value == STLightRigDirection.BL) return ST_LightRigDirectionModel.BL;
    if (value == STLightRigDirection.B) return ST_LightRigDirectionModel.B;
    if (value == STLightRigDirection.BR) return ST_LightRigDirectionModel.BR;
    return null;
  }

  public static STLightRigDirection toDocx4J(ST_LightRigDirectionModel value) {
    return null;
  }
}
