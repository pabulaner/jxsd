package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.TextBodyPropertiesModel;
import org.docx4j.dml.CTTextBodyProperties;

public class TextBodyPropertiesConverter {
  private TextBodyPropertiesConverter() {
  }

  public static TextBodyPropertiesModel fromDocx4J(CTTextBodyProperties value) {
    if (value == null) return null;
    TextBodyPropertiesModel.TextAutofitModel egTextAutofit = new TextBodyPropertiesModel.TextAutofitModel();
    if (value.getNoAutofit() != null) egTextAutofit = TextBodyPropertiesModel.TextAutofitModel.newNoAutofit(TextNoAutofitConverter.fromDocx4J(value.getNoAutofit()));
    if (value.getNormAutofit() != null) egTextAutofit = TextBodyPropertiesModel.TextAutofitModel.newNormAutofit(TextNormalAutofitConverter.fromDocx4J(value.getNormAutofit()));
    if (value.getSpAutoFit() != null) egTextAutofit = TextBodyPropertiesModel.TextAutofitModel.newSpAutoFit(TextShapeAutofitConverter.fromDocx4J(value.getSpAutoFit()));
    TextBodyPropertiesModel.Text3DModel egText3D = new TextBodyPropertiesModel.Text3DModel();
    if (value.getSp3D() != null) egText3D = TextBodyPropertiesModel.Text3DModel.newSp3D(Shape3DConverter.fromDocx4J(value.getSp3D()));
    if (value.getFlatTx() != null) egText3D = TextBodyPropertiesModel.Text3DModel.newFlatTx(FlatTextConverter.fromDocx4J(value.getFlatTx()));
    return new TextBodyPropertiesModel(BooleanValueConverter.fromDocx4J(value.isCompatLnSpc()), TextVertOverflowTypeValueConverter.fromDocx4J(value.getVertOverflow()), Coordinate32ValueConverter.fromDocx4J(value.getBIns()), TextVerticalTypeValueConverter.fromDocx4J(value.getVert()), BooleanValueConverter.fromDocx4J(value.isAnchorCtr()), TextColumnCountValueConverter.fromDocx4J(value.getNumCol()), AngleValueConverter.fromDocx4J(value.getRot()), Coordinate32ValueConverter.fromDocx4J(value.getTIns()), Coordinate32ValueConverter.fromDocx4J(value.getLIns()), PositiveCoordinate32ValueConverter.fromDocx4J(value.getSpcCol()), TextWrappingTypeValueConverter.fromDocx4J(value.getWrap()), BooleanValueConverter.fromDocx4J(value.isFromWordArt()), BooleanValueConverter.fromDocx4J(value.isSpcFirstLastPara()), BooleanValueConverter.fromDocx4J(value.isUpright()), TextHorzOverflowTypeValueConverter.fromDocx4J(value.getHorzOverflow()), Coordinate32ValueConverter.fromDocx4J(value.getRIns()), BooleanValueConverter.fromDocx4J(value.isRtlCol()), BooleanValueConverter.fromDocx4J(value.isForceAA()), TextAnchoringTypeValueConverter.fromDocx4J(value.getAnchor()), PresetTextShapeConverter.fromDocx4J(value.getPrstTxWarp()), egTextAutofit, Scene3DConverter.fromDocx4J(value.getScene3D()), egText3D, OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
