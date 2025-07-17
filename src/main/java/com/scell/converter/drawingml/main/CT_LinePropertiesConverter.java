package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import org.docx4j.dml.CTLineProperties;

public class CT_LinePropertiesConverter {
  private CT_LinePropertiesConverter() {
  }

  public static CT_LinePropertiesModel fromDocx4j(CTLineProperties value) {
    if (value == null) return null;
    return new CT_LinePropertiesModel(ST_LineWidthConverter.fromDocx4j(value.getW()), ST_LineCapConverter.fromDocx4j(value.getCap()), ST_CompoundLineConverter.fromDocx4j(value.getCmpd()), ST_PenAlignmentConverter.fromDocx4j(value.getAlgn()), NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill()), PrstDashOrCustDashConverter.fromDocx4j(value.getPrstDashOrCustDash()), RoundOrBevelOrMiterConverter.fromDocx4j(value.getRoundOrBevelOrMiter()), CT_LineEndPropertiesConverter.fromDocx4j(value.getHeadEnd()), CT_LineEndPropertiesConverter.fromDocx4j(value.getTailEnd()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineProperties toDocx4j(CT_LinePropertiesModel value) {
    return null;
  }

  public static class NoFillOrSolidFillOrGradFillConverter {
    private NoFillOrSolidFillOrGradFillConverter() {
    }

    public static CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel fromDocx4j(
        CTLineProperties.NoFillOrSolidFillOrGradFill value) {
      if (value == null) return null;
    }

    public static CTLineProperties.NoFillOrSolidFillOrGradFill toDocx4j(
        CT_LinePropertiesModel.NoFillOrSolidFillOrGradFillModel value) {
      return null;
    }
  }

  public static class PrstDashOrCustDashConverter {
    private PrstDashOrCustDashConverter() {
    }

    public static CT_LinePropertiesModel.PrstDashOrCustDashModel fromDocx4j(
        CTLineProperties.PrstDashOrCustDash value) {
      if (value == null) return null;
    }

    public static CTLineProperties.PrstDashOrCustDash toDocx4j(
        CT_LinePropertiesModel.PrstDashOrCustDashModel value) {
      return null;
    }
  }

  public static class RoundOrBevelOrMiterConverter {
    private RoundOrBevelOrMiterConverter() {
    }

    public static CT_LinePropertiesModel.RoundOrBevelOrMiterModel fromDocx4j(
        CTLineProperties.RoundOrBevelOrMiter value) {
      if (value == null) return null;
    }

    public static CTLineProperties.RoundOrBevelOrMiter toDocx4j(
        CT_LinePropertiesModel.RoundOrBevelOrMiterModel value) {
      return null;
    }
  }
}
