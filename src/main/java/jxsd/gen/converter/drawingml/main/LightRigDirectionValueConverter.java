package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LightRigDirectionValueModel;
import org.docx4j.dml.STLightRigDirection;

/**
 * This is a generated enum class.
 */
public class LightRigDirectionValueConverter {
  private LightRigDirectionValueConverter() {
  }

  public static LightRigDirectionValueModel fromDocx4j(STLightRigDirection value) {
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

  public static STLightRigDirection toDocx4j(LightRigDirectionValueModel value) {
    if (value == null) return null;
    if (value == LightRigDirectionValueModel.TL) return STLightRigDirection.TL;
    if (value == LightRigDirectionValueModel.T) return STLightRigDirection.T;
    if (value == LightRigDirectionValueModel.TR) return STLightRigDirection.TR;
    if (value == LightRigDirectionValueModel.L) return STLightRigDirection.L;
    if (value == LightRigDirectionValueModel.R) return STLightRigDirection.R;
    if (value == LightRigDirectionValueModel.BL) return STLightRigDirection.BL;
    if (value == LightRigDirectionValueModel.B) return STLightRigDirection.B;
    if (value == LightRigDirectionValueModel.BR) return STLightRigDirection.BR;
    return null;
  }
}
