package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GroupShapePropertiesModel;
import org.docx4j.dml.CTGroupShapeProperties;

public class GroupShapePropertiesConverter {
  private GroupShapePropertiesConverter() {
  }

  public static GroupShapePropertiesModel fromDocx4J(CTGroupShapeProperties value) {
    if (value == null) return null;
    GroupShapePropertiesModel.FillPropertiesModel egFillProperties = new GroupShapePropertiesModel.FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = GroupShapePropertiesModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    GroupShapePropertiesModel.EffectPropertiesModel egEffectProperties = new GroupShapePropertiesModel.EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = GroupShapePropertiesModel.EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = GroupShapePropertiesModel.EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new GroupShapePropertiesModel(BlackWhiteModeConverter.fromDocx4J(value.getBwMode()), GroupTransform2DConverter.fromDocx4J(value.getXfrm()), egFillProperties, egEffectProperties, Scene3DConverter.fromDocx4J(value.getScene3D()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
