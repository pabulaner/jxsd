package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_TextBodyPropertiesModel;
import org.docx4j.dml.CTTextBodyProperties;

public class CT_TextBodyPropertiesConverter {
  private CT_TextBodyPropertiesConverter() {
  }

  public static CT_TextBodyPropertiesModel fromDocx4j(CTTextBodyProperties value) {
    if (value == null) return null;
    return new CT_TextBodyPropertiesModel(BooleanConverter.fromDocx4j(value.getCompatLnSpc()), ST_TextVertOverflowTypeConverter.fromDocx4j(value.getVertOverflow()), ST_Coordinate32Converter.fromDocx4j(value.getBIns()), ST_TextVerticalTypeConverter.fromDocx4j(value.getVert()), BooleanConverter.fromDocx4j(value.getAnchorCtr()), ST_TextColumnCountConverter.fromDocx4j(value.getNumCol()), ST_AngleConverter.fromDocx4j(value.getRot()), ST_Coordinate32Converter.fromDocx4j(value.getTIns()), ST_Coordinate32Converter.fromDocx4j(value.getLIns()), ST_PositiveCoordinate32Converter.fromDocx4j(value.getSpcCol()), ST_TextWrappingTypeConverter.fromDocx4j(value.getWrap()), BooleanConverter.fromDocx4j(value.getFromWordArt()), BooleanConverter.fromDocx4j(value.getSpcFirstLastPara()), BooleanConverter.fromDocx4j(value.getUpright()), ST_TextHorzOverflowTypeConverter.fromDocx4j(value.getHorzOverflow()), ST_Coordinate32Converter.fromDocx4j(value.getRIns()), BooleanConverter.fromDocx4j(value.getRtlCol()), BooleanConverter.fromDocx4j(value.getForceAA()), ST_TextAnchoringTypeConverter.fromDocx4j(value.getAnchor()), CT_PresetTextShapeConverter.fromDocx4j(value.getPrstTxWarp()), NoAutofitOrNormAutofitOrSpAutoFitConverter.fromDocx4j(value.getNoAutofitOrNormAutofitOrSpAutoFit()), CT_Scene3DConverter.fromDocx4j(value.getScene3d()), Sp3dOrFlatTxConverter.fromDocx4j(value.getSp3dOrFlatTx()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTextBodyProperties toDocx4j(CT_TextBodyPropertiesModel value) {
    return null;
  }

  public static class NoAutofitOrNormAutofitOrSpAutoFitConverter {
    private NoAutofitOrNormAutofitOrSpAutoFitConverter() {
    }

    public static CT_TextBodyPropertiesModel.NoAutofitOrNormAutofitOrSpAutoFitModel fromDocx4j(
        CTTextBodyProperties.NoAutofitOrNormAutofitOrSpAutoFit value) {
      if (value == null) return null;
    }

    public static CTTextBodyProperties.NoAutofitOrNormAutofitOrSpAutoFit toDocx4j(
        CT_TextBodyPropertiesModel.NoAutofitOrNormAutofitOrSpAutoFitModel value) {
      return null;
    }
  }

  public static class Sp3dOrFlatTxConverter {
    private Sp3dOrFlatTxConverter() {
    }

    public static CT_TextBodyPropertiesModel.Sp3dOrFlatTxModel fromDocx4j(
        CTTextBodyProperties.Sp3dOrFlatTx value) {
      if (value == null) return null;
    }

    public static CTTextBodyProperties.Sp3dOrFlatTx toDocx4j(
        CT_TextBodyPropertiesModel.Sp3dOrFlatTxModel value) {
      return null;
    }
  }
}
