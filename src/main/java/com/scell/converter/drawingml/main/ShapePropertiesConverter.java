package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import org.docx4j.dml.CTShapeProperties;

public class ShapePropertiesConverter {
  private ShapePropertiesConverter() {
  }

  public static ShapePropertiesModel fromDocx4J(CTShapeProperties value) {
    if (value == null) return null;
    ShapePropertiesModel.GeometryModel egGeometry = new ShapePropertiesModel.GeometryModel();
    if (value.getCustGeom() != null) egGeometry = ShapePropertiesModel.GeometryModel.newCustGeom(CustomGeometry2DConverter.fromDocx4J(value.getCustGeom()));
    if (value.getPrstGeom() != null) egGeometry = ShapePropertiesModel.GeometryModel.newPrstGeom(PresetGeometry2DConverter.fromDocx4J(value.getPrstGeom()));
    ShapePropertiesModel.FillPropertiesModel egFillProperties = new ShapePropertiesModel.FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = ShapePropertiesModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    ShapePropertiesModel.EffectPropertiesModel egEffectProperties = new ShapePropertiesModel.EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = ShapePropertiesModel.EffectPropertiesModel.newEffectLst(EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = ShapePropertiesModel.EffectPropertiesModel.newEffectDag(EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new ShapePropertiesModel(BlackWhiteModeConverter.fromDocx4J(value.getBwMode()), Transform2DConverter.fromDocx4J(value.getXfrm()), egGeometry, egFillProperties, LinePropertiesConverter.fromDocx4J(value.getLn()), egEffectProperties, Scene3DConverter.fromDocx4J(value.getScene3D()), Shape3DConverter.fromDocx4J(value.getSp3D()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
