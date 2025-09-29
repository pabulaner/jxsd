package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LightRigModel;
import org.docx4j.dml.CTLightRig;

/**
 * This is a generated sequence class.
 */
public class LightRigConverter {
  private LightRigConverter() {
  }

  public static LightRigModel fromDocx4j(CTLightRig value) {
    if (value == null) return null;
    return new LightRigModel(LightRigTypeValueConverter.fromDocx4j(value.getRig()), LightRigDirectionValueConverter.fromDocx4j(value.getDir()), SphereCoordsConverter.fromDocx4j(value.getRot()));
  }

  public static CTLightRig toDocx4j(LightRigModel value) {
    if (value == null) return null;
    CTLightRig result = new CTLightRig();
    result.setRig(LightRigTypeValueConverter.toDocx4j(value.getRig()));
    result.setDir(LightRigDirectionValueConverter.toDocx4j(value.getDir()));
    result.setRot(SphereCoordsConverter.toDocx4j(value.getRot()));
    return result;
  }
}
