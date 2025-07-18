package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import org.docx4j.dml.CTShapeProperties;

public class CT_ShapePropertiesConverter {
  private CT_ShapePropertiesConverter() {
  }

  public static CT_ShapePropertiesModel fromDocx4J(CTShapeProperties value) {
    if (value == null) return null;
    // look here false;
    CT_ShapePropertiesModel.EG_GeometryModel egGeometry = new CT_ShapePropertiesModel.EG_GeometryModel();
    if (value.getCustGeom() != null) egGeometry = CT_ShapePropertiesModel.EG_GeometryModel.newCustGeom(CT_CustomGeometry2DConverter.fromDocx4J(value.getCustGeom()));
    if (value.getPrstGeom() != null) egGeometry = CT_ShapePropertiesModel.EG_GeometryModel.newPrstGeom(CT_PresetGeometry2DConverter.fromDocx4J(value.getPrstGeom()));
    // look here false;
    CT_ShapePropertiesModel.EG_FillPropertiesModel egFillProperties = new CT_ShapePropertiesModel.EG_FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = CT_ShapePropertiesModel.EG_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    // look here false;
    CT_ShapePropertiesModel.EG_EffectPropertiesModel egEffectProperties = new CT_ShapePropertiesModel.EG_EffectPropertiesModel();
    if (value.getEffectLst() != null) egEffectProperties = CT_ShapePropertiesModel.EG_EffectPropertiesModel.newEffectLst(CT_EffectListConverter.fromDocx4J(value.getEffectLst()));
    if (value.getEffectDag() != null) egEffectProperties = CT_ShapePropertiesModel.EG_EffectPropertiesModel.newEffectDag(CT_EffectContainerConverter.fromDocx4J(value.getEffectDag()));
    return new CT_ShapePropertiesModel(ST_BlackWhiteModeConverter.fromDocx4J(value.getBwMode()), CT_Transform2DConverter.fromDocx4J(value.getXfrm()), egGeometry, egFillProperties, CT_LinePropertiesConverter.fromDocx4J(value.getLn()), egEffectProperties, CT_Scene3DConverter.fromDocx4J(value.getScene3D()), CT_Shape3DConverter.fromDocx4J(value.getSp3D()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTShapeProperties toDocx4J(CT_ShapePropertiesModel value) {
    return null;
  }
}
