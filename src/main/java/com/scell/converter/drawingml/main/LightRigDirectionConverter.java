package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionModel;
import org.docx4j.dml.STLightRigDirection;

public class LightRigDirectionConverter {
  private LightRigDirectionConverter() {
  }

  public static LightRigDirectionModel fromDocx4J(STLightRigDirection value) {
    if (value == null) return null;
    if (value == STLightRigDirection.TL) return LightRigDirectionModel.TL;
    if (value == STLightRigDirection.T) return LightRigDirectionModel.T;
    if (value == STLightRigDirection.TR) return LightRigDirectionModel.TR;
    if (value == STLightRigDirection.L) return LightRigDirectionModel.L;
    if (value == STLightRigDirection.R) return LightRigDirectionModel.R;
    if (value == STLightRigDirection.BL) return LightRigDirectionModel.BL;
    if (value == STLightRigDirection.B) return LightRigDirectionModel.B;
    if (value == STLightRigDirection.BR) return LightRigDirectionModel.BR;
    return null;
  }
}
