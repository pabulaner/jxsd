package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Scene3DModel;
import org.docx4j.dml.CTScene3D;

public class CT_Scene3DConverter {
  private CT_Scene3DConverter() {
  }

  public static CT_Scene3DModel fromDocx4J(CTScene3D value) {
    if (value == null) return null;
    return new CT_Scene3DModel(CT_CameraConverter.fromDocx4J(value.getCamera()), CT_LightRigConverter.fromDocx4J(value.getLightRig()), CT_BackdropConverter.fromDocx4J(value.getBackdrop()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTScene3D toDocx4J(CT_Scene3DModel value) {
    return null;
  }
}
