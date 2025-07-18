package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_TextBodyPropertiesModel;
import org.docx4j.dml.CTTextBodyProperties;

public class CT_TextBodyPropertiesConverter {
  private CT_TextBodyPropertiesConverter() {
  }

  public static CT_TextBodyPropertiesModel fromDocx4J(CTTextBodyProperties value) {
    if (value == null) return null;
    // look here false;
    CT_TextBodyPropertiesModel.EG_TextAutofitModel egTextAutofit = new CT_TextBodyPropertiesModel.EG_TextAutofitModel();
    if (value.getNoAutofit() != null) egTextAutofit = CT_TextBodyPropertiesModel.EG_TextAutofitModel.newNoAutofit(CT_TextNoAutofitConverter.fromDocx4J(value.getNoAutofit()));
    if (value.getNormAutofit() != null) egTextAutofit = CT_TextBodyPropertiesModel.EG_TextAutofitModel.newNormAutofit(CT_TextNormalAutofitConverter.fromDocx4J(value.getNormAutofit()));
    if (value.getSpAutoFit() != null) egTextAutofit = CT_TextBodyPropertiesModel.EG_TextAutofitModel.newSpAutoFit(CT_TextShapeAutofitConverter.fromDocx4J(value.getSpAutoFit()));
    // look here false;
    CT_TextBodyPropertiesModel.EG_Text3DModel egText3D = new CT_TextBodyPropertiesModel.EG_Text3DModel();
    if (value.getSp3D() != null) egText3D = CT_TextBodyPropertiesModel.EG_Text3DModel.newSp3D(CT_Shape3DConverter.fromDocx4J(value.getSp3D()));
    if (value.getFlatTx() != null) egText3D = CT_TextBodyPropertiesModel.EG_Text3DModel.newFlatTx(CT_FlatTextConverter.fromDocx4J(value.getFlatTx()));
    return new CT_TextBodyPropertiesModel(BooleanConverter.fromDocx4J(value.getCompatLnSpc()), ST_TextVertOverflowTypeConverter.fromDocx4J(value.getVertOverflow()), ST_Coordinate32Converter.fromDocx4J(value.getBIns()), ST_TextVerticalTypeConverter.fromDocx4J(value.getVert()), BooleanConverter.fromDocx4J(value.getAnchorCtr()), ST_TextColumnCountConverter.fromDocx4J(value.getNumCol()), ST_AngleConverter.fromDocx4J(value.getRot()), ST_Coordinate32Converter.fromDocx4J(value.getTIns()), ST_Coordinate32Converter.fromDocx4J(value.getLIns()), ST_PositiveCoordinate32Converter.fromDocx4J(value.getSpcCol()), ST_TextWrappingTypeConverter.fromDocx4J(value.getWrap()), BooleanConverter.fromDocx4J(value.getFromWordArt()), BooleanConverter.fromDocx4J(value.getSpcFirstLastPara()), BooleanConverter.fromDocx4J(value.getUpright()), ST_TextHorzOverflowTypeConverter.fromDocx4J(value.getHorzOverflow()), ST_Coordinate32Converter.fromDocx4J(value.getRIns()), BooleanConverter.fromDocx4J(value.getRtlCol()), BooleanConverter.fromDocx4J(value.getForceAA()), ST_TextAnchoringTypeConverter.fromDocx4J(value.getAnchor()), CT_PresetTextShapeConverter.fromDocx4J(value.getPrstTxWarp()), egTextAutofit, CT_Scene3DConverter.fromDocx4J(value.getScene3D()), egText3D, CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTextBodyProperties toDocx4J(CT_TextBodyPropertiesModel value) {
    return null;
  }
}
