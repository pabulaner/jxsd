package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Scene3DModel;
import org.docx4j.dml.CTScene3D;

public class Scene3DConverter {
  private Scene3DConverter() {
  }

  public static Scene3DModel fromDocx4J(CTScene3D value) {
    if (value == null) return null;
    return new Scene3DModel(CameraConverter.fromDocx4J(value.getCamera()), LightRigConverter.fromDocx4J(value.getLightRig()), BackdropConverter.fromDocx4J(value.getBackdrop()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
