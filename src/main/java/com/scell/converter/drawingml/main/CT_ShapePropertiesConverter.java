package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import org.docx4j.dml.CTShapeProperties;

public class CT_ShapePropertiesConverter {
  private CT_ShapePropertiesConverter() {
  }

  public static CT_ShapePropertiesModel fromDocx4j(CTShapeProperties value) {
    if (value == null) return null;
    return new CT_ShapePropertiesModel(ST_BlackWhiteModeConverter.fromDocx4j(value.getBwMode()), CT_Transform2DConverter.fromDocx4j(value.getXfrm()), CustGeomOrPrstGeomConverter.fromDocx4j(value.getCustGeomOrPrstGeom()), NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill()), CT_LinePropertiesConverter.fromDocx4j(value.getLn()), EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag()), CT_Scene3DConverter.fromDocx4j(value.getScene3d()), CT_Shape3DConverter.fromDocx4j(value.getSp3d()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShapeProperties toDocx4j(CT_ShapePropertiesModel value) {
    return null;
  }

  public static class CustGeomOrPrstGeomConverter {
    private CustGeomOrPrstGeomConverter() {
    }

    public static CT_ShapePropertiesModel.CustGeomOrPrstGeomModel fromDocx4j(
        CTShapeProperties.CustGeomOrPrstGeom value) {
      if (value == null) return null;
    }

    public static CTShapeProperties.CustGeomOrPrstGeom toDocx4j(
        CT_ShapePropertiesModel.CustGeomOrPrstGeomModel value) {
      return null;
    }
  }

  public static class NoFillOrSolidFillOrGradFillConverter {
    private NoFillOrSolidFillOrGradFillConverter() {
    }

    public static CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel fromDocx4j(
        CTShapeProperties.NoFillOrSolidFillOrGradFill value) {
      if (value == null) return null;
    }

    public static CTShapeProperties.NoFillOrSolidFillOrGradFill toDocx4j(
        CT_ShapePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
      return null;
    }
  }

  public static class EffectLstOrEffectDagConverter {
    private EffectLstOrEffectDagConverter() {
    }

    public static CT_ShapePropertiesModel.EffectLstOrEffectDagModel fromDocx4j(
        CTShapeProperties.EffectLstOrEffectDag value) {
      if (value == null) return null;
    }

    public static CTShapeProperties.EffectLstOrEffectDag toDocx4j(
        CT_ShapePropertiesModel.EffectLstOrEffectDagModel value) {
      return null;
    }
  }
}
