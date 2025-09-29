package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Scene3DModel;
import org.docx4j.dml.CTScene3D;

/**
 * This is a generated sequence class.
 */
public class Scene3DConverter {
  private Scene3DConverter() {
  }

  public static Scene3DModel fromDocx4j(CTScene3D value) {
    if (value == null) return null;
    return new Scene3DModel(CameraConverter.fromDocx4j(value.getCamera()), LightRigConverter.fromDocx4j(value.getLightRig()), BackdropConverter.fromDocx4j(value.getBackdrop()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScene3D toDocx4j(Scene3DModel value) {
    if (value == null) return null;
    CTScene3D result = new CTScene3D();
    result.setCamera(CameraConverter.toDocx4j(value.getCamera()));
    result.setLightRig(LightRigConverter.toDocx4j(value.getLightRig()));
    result.setBackdrop(BackdropConverter.toDocx4j(value.getBackdrop()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
