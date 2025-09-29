package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import org.docx4j.dml.CTShapeProperties;

/**
 * This is a generated sequence class.
 */
public class ShapePropertiesConverter {
  private ShapePropertiesConverter() {
  }

  public static ShapePropertiesModel fromDocx4j(CTShapeProperties value) {
    if (value == null) return null;
    ShapePropertiesModel.EG_Geometry egGeometry = new ShapePropertiesModel.EG_Geometry();
    if (value.getCustGeom() != null) egGeometry = ShapePropertiesConverter.newEGGeometry(ShapePropertiesConverter.fromDocx4j(value.getCustGeom()));
    if (value.getPrstGeom() != null) egGeometry = ShapePropertiesConverter.newEGGeometry(ShapePropertiesConverter.fromDocx4j(value.getPrstGeom()));
    ShapePropertiesModel.EG_FillProperties egFillProperties = new ShapePropertiesModel.EG_FillProperties();
    if (value.getNoFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = ShapePropertiesConverter.newEGFillProperties(ShapePropertiesConverter.fromDocx4j(value.getGrpFill()));
    ShapePropertiesModel.EG_EffectProperties egEffectProperties = new ShapePropertiesModel.EG_EffectProperties();
    if (value.getEffectLst() != null) egEffectProperties = ShapePropertiesConverter.newEGEffectProperties(ShapePropertiesConverter.fromDocx4j(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = ShapePropertiesConverter.newEGEffectProperties(ShapePropertiesConverter.fromDocx4j(value.getEffectDag()));
    return new ShapePropertiesModel(BlackWhiteModeValueConverter.fromDocx4j(value.getBwMode()), Transform2DConverter.fromDocx4j(value.getXfrm()), egGeometry, egFillProperties, LinePropertiesConverter.fromDocx4j(value.getLn()), egEffectProperties, Scene3DConverter.fromDocx4j(value.getScene3D()), Shape3DConverter.fromDocx4j(value.getSp3D()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShapeProperties toDocx4j(ShapePropertiesModel value) {
    if (value == null) return null;
    CTShapeProperties result = new CTShapeProperties();
    result.setBwMode(BlackWhiteModeValueConverter.toDocx4j(value.getBwMode()));
    result.setXfrm(Transform2DConverter.toDocx4j(value.getXfrm()));
    result.setLn(LinePropertiesConverter.toDocx4j(value.getLn()));
    result.setScene3D(Scene3DConverter.toDocx4j(value.getScene3D()));
    result.setSp3D(Shape3DConverter.toDocx4j(value.getSp3D()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGGeometry().isCustGeom()) result.setCustGeom(CustomGeometry2DConverter.toDocx4j(value.getEGGeometry().getCustGeom()));
    if (value.getEGGeometry().isPrstGeom()) result.setPrstGeom(PresetGeometry2DConverter.toDocx4j(value.getEGGeometry().getPrstGeom()));
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
