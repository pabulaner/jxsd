package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GroupShapePropertiesModel;
import org.docx4j.dml.CTGroupShapeProperties;

public class CT_GroupShapePropertiesConverter {
  private CT_GroupShapePropertiesConverter() {
  }

  public static CT_GroupShapePropertiesModel fromDocx4J(CTGroupShapeProperties value) {
    if (value == null) return null;
    // look here false;
    CT_GroupShapePropertiesModel.EG_FillPropertiesModel egFillProperties = new CT_GroupShapePropertiesModel.EG_FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = CT_GroupShapePropertiesModel.EG_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    // look here false;
    CT_GroupShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties = new CT_GroupShapePropertiesModel.EG_EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = CT_GroupShapePropertiesModel.EG_EffectPropertiesModel.newEffectLst(CT_EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = CT_GroupShapePropertiesModel.EG_EffectPropertiesModel.newEffectDag(CT_EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new CT_GroupShapePropertiesModel(ST_BlackWhiteModeConverter.fromDocx4J(value.getBwMode()), CT_GroupTransform2DConverter.fromDocx4J(value.getXfrm()), egFillProperties, egEffectProperties, CT_Scene3DConverter.fromDocx4J(value.getScene3D()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTGroupShapeProperties toDocx4J(CT_GroupShapePropertiesModel value) {
    return null;
  }
}
