package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionValueModel;
import org.docx4j.dml.STLightRigDirection;

public class LightRigDirectionValueConverter {
  private LightRigDirectionValueConverter() {
  }

  public static LightRigDirectionValueModel fromDocx4J(STLightRigDirection value) {
    if (value == null) return null;
    if (value == STLightRigDirection.TL) return LightRigDirectionValueModel.TL;
    if (value == STLightRigDirection.T) return LightRigDirectionValueModel.T;
    if (value == STLightRigDirection.TR) return LightRigDirectionValueModel.TR;
    if (value == STLightRigDirection.L) return LightRigDirectionValueModel.L;
    if (value == STLightRigDirection.R) return LightRigDirectionValueModel.R;
    if (value == STLightRigDirection.BL) return LightRigDirectionValueModel.BL;
    if (value == STLightRigDirection.B) return LightRigDirectionValueModel.B;
    if (value == STLightRigDirection.BR) return LightRigDirectionValueModel.BR;
    return null;
  }
}
