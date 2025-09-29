package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LightRigDirectionValueBuilder;
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
    if (value == LightRigDirectionValueBuilder.TL) return LightRigDirectionValueModel.TL;
    if (value == LightRigDirectionValueBuilder.T) return LightRigDirectionValueModel.T;
    if (value == LightRigDirectionValueBuilder.TR) return LightRigDirectionValueModel.TR;
    if (value == LightRigDirectionValueBuilder.L) return LightRigDirectionValueModel.L;
    if (value == LightRigDirectionValueBuilder.R) return LightRigDirectionValueModel.R;
    if (value == LightRigDirectionValueBuilder.BL) return LightRigDirectionValueModel.BL;
    if (value == LightRigDirectionValueBuilder.B) return LightRigDirectionValueModel.B;
    if (value == LightRigDirectionValueBuilder.BR) return LightRigDirectionValueModel.BR;
    return null;
  }

  public static STLightRigDirection toDocx4j(LightRigDirectionValueModel value) {
    if (value == null) return null;
    if (value == LightRigDirectionValueModel.TL) return LightRigDirectionValueBuilder.TL;
    if (value == LightRigDirectionValueModel.T) return LightRigDirectionValueBuilder.T;
    if (value == LightRigDirectionValueModel.TR) return LightRigDirectionValueBuilder.TR;
    if (value == LightRigDirectionValueModel.L) return LightRigDirectionValueBuilder.L;
    if (value == LightRigDirectionValueModel.R) return LightRigDirectionValueBuilder.R;
    if (value == LightRigDirectionValueModel.BL) return LightRigDirectionValueBuilder.BL;
    if (value == LightRigDirectionValueModel.B) return LightRigDirectionValueBuilder.B;
    if (value == LightRigDirectionValueModel.BR) return LightRigDirectionValueBuilder.BR;
    return null;
  }
}
