package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.TextBodyPropertiesModel;
import org.docx4j.dml.CTTextBodyProperties;

/**
 * This is a generated sequence class.
 */
public class TextBodyPropertiesConverter {
  private TextBodyPropertiesConverter() {
  }

  public static TextBodyPropertiesModel fromDocx4j(CTTextBodyProperties value) {
    if (value == null) return null;
    TextBodyPropertiesModel.EG_TextAutofit egTextAutofit = new TextBodyPropertiesModel.EG_TextAutofit();
    if (value.getNoAutofit() != null) egTextAutofit = TextBodyPropertiesModel.EG_TextAutofit.newNoAutofit(TextNoAutofitConverter.fromDocx4j(value.getNoAutofit()));
    if (value.getNormAutofit() != null) egTextAutofit = TextBodyPropertiesModel.EG_TextAutofit.newNormAutofit(TextNormalAutofitConverter.fromDocx4j(value.getNormAutofit()));
    if (value.getSpAutoFit() != null) egTextAutofit = TextBodyPropertiesModel.EG_TextAutofit.newSpAutoFit(TextShapeAutofitConverter.fromDocx4j(value.getSpAutoFit()));
    TextBodyPropertiesModel.EG_Text3D egText3D = new TextBodyPropertiesModel.EG_Text3D();
    if (value.getSp3D() != null) egText3D = TextBodyPropertiesModel.EG_Text3D.newSp3D(Shape3DConverter.fromDocx4j(value.getSp3D()));
    if (value.getFlatTx() != null) egText3D = TextBodyPropertiesModel.EG_Text3D.newFlatTx(FlatTextConverter.fromDocx4j(value.getFlatTx()));
    return new TextBodyPropertiesModel(BooleanValueConverter.fromDocx4j(value.isCompatLnSpc()), TextVertOverflowTypeValueConverter.fromDocx4j(value.getVertOverflow()), Coordinate32ValueConverter.fromDocx4j(value.getBIns()), TextVerticalTypeValueConverter.fromDocx4j(value.getVert()), BooleanValueConverter.fromDocx4j(value.isAnchorCtr()), TextColumnCountValueConverter.fromDocx4j(value.getNumCol()), AngleValueConverter.fromDocx4j(value.getRot()), Coordinate32ValueConverter.fromDocx4j(value.getTIns()), Coordinate32ValueConverter.fromDocx4j(value.getLIns()), PositiveCoordinate32ValueConverter.fromDocx4j(value.getSpcCol()), TextWrappingTypeValueConverter.fromDocx4j(value.getWrap()), BooleanValueConverter.fromDocx4j(value.isFromWordArt()), BooleanValueConverter.fromDocx4j(value.isSpcFirstLastPara()), BooleanValueConverter.fromDocx4j(value.isUpright()), TextHorzOverflowTypeValueConverter.fromDocx4j(value.getHorzOverflow()), Coordinate32ValueConverter.fromDocx4j(value.getRIns()), BooleanValueConverter.fromDocx4j(value.isRtlCol()), BooleanValueConverter.fromDocx4j(value.isForceAA()), TextAnchoringTypeValueConverter.fromDocx4j(value.getAnchor()), PresetTextShapeConverter.fromDocx4j(value.getPrstTxWarp()), egTextAutofit, Scene3DConverter.fromDocx4j(value.getScene3D()), egText3D, OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextBodyProperties toDocx4j(TextBodyPropertiesModel value) {
    if (value == null) return null;
    CTTextBodyProperties result = new CTTextBodyProperties();
    result.setCompatLnSpc(BooleanValueConverter.toDocx4j(value.getCompatLnSpc()));
    result.setVertOverflow(TextVertOverflowTypeValueConverter.toDocx4j(value.getVertOverflow()));
    result.setBIns(Coordinate32ValueConverter.toDocx4j(value.getBIns()));
    result.setVert(TextVerticalTypeValueConverter.toDocx4j(value.getVert()));
    result.setAnchorCtr(BooleanValueConverter.toDocx4j(value.getAnchorCtr()));
    result.setNumCol(TextColumnCountValueConverter.toDocx4j(value.getNumCol()));
    result.setRot(AngleValueConverter.toDocx4j(value.getRot()));
    result.setTIns(Coordinate32ValueConverter.toDocx4j(value.getTIns()));
    result.setLIns(Coordinate32ValueConverter.toDocx4j(value.getLIns()));
    result.setSpcCol(PositiveCoordinate32ValueConverter.toDocx4j(value.getSpcCol()));
    result.setWrap(TextWrappingTypeValueConverter.toDocx4j(value.getWrap()));
    result.setFromWordArt(BooleanValueConverter.toDocx4j(value.getFromWordArt()));
    result.setSpcFirstLastPara(BooleanValueConverter.toDocx4j(value.getSpcFirstLastPara()));
    result.setUpright(BooleanValueConverter.toDocx4j(value.getUpright()));
    result.setHorzOverflow(TextHorzOverflowTypeValueConverter.toDocx4j(value.getHorzOverflow()));
    result.setRIns(Coordinate32ValueConverter.toDocx4j(value.getRIns()));
    result.setRtlCol(BooleanValueConverter.toDocx4j(value.getRtlCol()));
    result.setForceAA(BooleanValueConverter.toDocx4j(value.getForceAA()));
    result.setAnchor(TextAnchoringTypeValueConverter.toDocx4j(value.getAnchor()));
    result.setPrstTxWarp(PresetTextShapeConverter.toDocx4j(value.getPrstTxWarp()));
    result.setScene3D(Scene3DConverter.toDocx4j(value.getScene3D()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGTextAutofit().isNoAutofit()) result.setNoAutofit(TextNoAutofitConverter.toDocx4j(value.getEGTextAutofit().getNoAutofit()));
    if (value.getEGTextAutofit().isNormAutofit()) result.setNormAutofit(TextNormalAutofitConverter.toDocx4j(value.getEGTextAutofit().getNormAutofit()));
    if (value.getEGTextAutofit().isSpAutoFit()) result.setSpAutoFit(TextShapeAutofitConverter.toDocx4j(value.getEGTextAutofit().getSpAutoFit()));
    if (value.getEGText3D().isSp3D()) result.setSp3D(Shape3DConverter.toDocx4j(value.getEGText3D().getSp3D()));
    if (value.getEGText3D().isFlatTx()) result.setFlatTx(FlatTextConverter.toDocx4j(value.getEGText3D().getFlatTx()));
    return result;
  }
}
