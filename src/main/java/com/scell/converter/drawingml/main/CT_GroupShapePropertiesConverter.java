package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GroupShapePropertiesModel;
import org.docx4j.dml.CTGroupShapeProperties;

public class CT_GroupShapePropertiesConverter {
  private CT_GroupShapePropertiesConverter() {
  }

  public static CT_GroupShapePropertiesModel fromDocx4j(CTGroupShapeProperties value) {
    if (value == null) return null;
    return new CT_GroupShapePropertiesModel(ST_BlackWhiteModeConverter.fromDocx4j(value.getBwMode()), CT_GroupTransform2DConverter.fromDocx4j(value.getXfrm()), NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill()), EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag()), CT_Scene3DConverter.fromDocx4j(value.getScene3d()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGroupShapeProperties toDocx4j(CT_GroupShapePropertiesModel value) {
    return null;
  }

  public static class NoFillOrSolidFillOrGradFillConverter {
    private NoFillOrSolidFillOrGradFillConverter() {
    }

    public static CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel fromDocx4j(
        CTGroupShapeProperties.NoFillOrSolidFillOrGradFill value) {
      if (value == null) return null;
    }

    public static CTGroupShapeProperties.NoFillOrSolidFillOrGradFill toDocx4j(
        CT_GroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
      return null;
    }
  }

  public static class EffectLstOrEffectDagConverter {
    private EffectLstOrEffectDagConverter() {
    }

    public static CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel fromDocx4j(
        CTGroupShapeProperties.EffectLstOrEffectDag value) {
      if (value == null) return null;
    }

    public static CTGroupShapeProperties.EffectLstOrEffectDag toDocx4j(
        CT_GroupShapePropertiesModel.EffectLstOrEffectDagModel value) {
      return null;
    }
  }
}
