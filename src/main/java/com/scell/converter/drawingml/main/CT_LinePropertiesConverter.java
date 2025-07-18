package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LinePropertiesModel;
import org.docx4j.dml.CTLineProperties;

public class CT_LinePropertiesConverter {
  private CT_LinePropertiesConverter() {
  }

  public static CT_LinePropertiesModel fromDocx4J(CTLineProperties value) {
    if (value == null) return null;
    // look here false;
    CT_LinePropertiesModel.EG_LineFillPropertiesModel egLineFillProperties = new CT_LinePropertiesModel.EG_LineFillPropertiesModel();
    if (value.getNoFill() != null) egLineFillProperties = CT_LinePropertiesModel.EG_LineFillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egLineFillProperties = CT_LinePropertiesModel.EG_LineFillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egLineFillProperties = CT_LinePropertiesModel.EG_LineFillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getPattFill() != null) egLineFillProperties = CT_LinePropertiesModel.EG_LineFillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    // look here false;
    CT_LinePropertiesModel.EG_LineDashPropertiesModel egLineDashProperties = new CT_LinePropertiesModel.EG_LineDashPropertiesModel();
    if (value.getPrstDash() != null) egLineDashProperties = CT_LinePropertiesModel.EG_LineDashPropertiesModel.newPrstDash(CT_PresetLineDashPropertiesConverter.fromDocx4J(value.getPrstDash()));
    if (value.getCustDash() != null) egLineDashProperties = CT_LinePropertiesModel.EG_LineDashPropertiesModel.newCustDash(CT_DashStopListConverter.fromDocx4J(value.getCustDash()));
    // look here false;
    CT_LinePropertiesModel.EG_LineJoinPropertiesModel egLineJoinProperties = new CT_LinePropertiesModel.EG_LineJoinPropertiesModel();
    if (value.getRound() != null) egLineJoinProperties = CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newRound(CT_LineJoinRoundConverter.fromDocx4J(value.getRound()));
    if (value.getBevel() != null) egLineJoinProperties = CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newBevel(CT_LineJoinBevelConverter.fromDocx4J(value.getBevel()));
    if (value.getMiter() != null) egLineJoinProperties = CT_LinePropertiesModel.EG_LineJoinPropertiesModel.newMiter(CT_LineJoinMiterPropertiesConverter.fromDocx4J(value.getMiter()));
    return new CT_LinePropertiesModel(ST_LineWidthConverter.fromDocx4J(value.getW()), ST_LineCapConverter.fromDocx4J(value.getCap()), ST_CompoundLineConverter.fromDocx4J(value.getCmpd()), ST_PenAlignmentConverter.fromDocx4J(value.getAlgn()), egLineFillProperties, egLineDashProperties, egLineJoinProperties, CT_LineEndPropertiesConverter.fromDocx4J(value.getHeadEnd()), CT_LineEndPropertiesConverter.fromDocx4J(value.getTailEnd()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLineProperties toDocx4J(CT_LinePropertiesModel value) {
    return null;
  }
}
