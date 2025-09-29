package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GroupShapePropertiesModel;
import org.docx4j.dml.CTGroupShapeProperties;

/**
 * This is a generated sequence class.
 */
public class GroupShapePropertiesConverter {
  private GroupShapePropertiesConverter() {
  }

  public static GroupShapePropertiesModel fromDocx4j(CTGroupShapeProperties value) {
    if (value == null) return null;
    GroupShapePropertiesModel.EG_FillProperties egFillProperties = new GroupShapePropertiesModel.EG_FillProperties();
    if (value.getNoFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = GroupShapePropertiesConverter.newEGFillProperties(GroupShapePropertiesConverter.fromDocx4j(value.getGrpFill()));
    GroupShapePropertiesModel.EG_EffectProperties egEffectProperties = new GroupShapePropertiesModel.EG_EffectProperties();
    if (value.getEffectLst() != null) egEffectProperties = GroupShapePropertiesConverter.newEGEffectProperties(GroupShapePropertiesConverter.fromDocx4j(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = GroupShapePropertiesConverter.newEGEffectProperties(GroupShapePropertiesConverter.fromDocx4j(value.getEffectDag()));
    return new GroupShapePropertiesModel(BlackWhiteModeValueConverter.fromDocx4j(value.getBwMode()), GroupTransform2DConverter.fromDocx4j(value.getXfrm()), egFillProperties, egEffectProperties, Scene3DConverter.fromDocx4j(value.getScene3D()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGroupShapeProperties toDocx4j(GroupShapePropertiesModel value) {
    if (value == null) return null;
    CTGroupShapeProperties result = new CTGroupShapeProperties();
    result.setBwMode(BlackWhiteModeValueConverter.toDocx4j(value.getBwMode()));
    result.setXfrm(GroupTransform2DConverter.toDocx4j(value.getXfrm()));
    result.setScene3D(Scene3DConverter.toDocx4j(value.getScene3D()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGFillProperties().isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getNoFill()));
    if (value.getEGFillProperties().isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getSolidFill()));
    if (value.getEGFillProperties().isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGradFill()));
    if (value.getEGFillProperties().isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getBlipFill()));
    if (value.getEGFillProperties().isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getPattFill()));
    if (value.getEGFillProperties().isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGrpFill()));
    if (value.getEGEffectProperties().isEffectLst()) result.setEffectLst(EffectListConverter.toDocx4j(value.getEGEffectProperties().getEffectLst()));
    if (value.getEGEffectProperties().isEffectDag()) result.setEffectDag(EffectContainerConverter.toDocx4j(value.getEGEffectProperties().getEffectDag()));
    return result;
  }
}
