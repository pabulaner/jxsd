package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LinePropertiesModel;
import org.docx4j.dml.CTLineProperties;

public class LinePropertiesConverter {
  private LinePropertiesConverter() {
  }

  public static LinePropertiesModel fromDocx4J(CTLineProperties value) {
    if (value == null) return null;
    LinePropertiesModel.LineFillPropertiesModel egLineFillProperties = new LinePropertiesModel.LineFillPropertiesModel();
    if (value.getNoFill() != null) egLineFillProperties = LinePropertiesModel.LineFillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egLineFillProperties = LinePropertiesModel.LineFillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egLineFillProperties = LinePropertiesModel.LineFillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getPattFill() != null) egLineFillProperties = LinePropertiesModel.LineFillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    LinePropertiesModel.LineDashPropertiesModel egLineDashProperties = new LinePropertiesModel.LineDashPropertiesModel();
    if (value.getPrstDash() != null) egLineDashProperties = LinePropertiesModel.LineDashPropertiesModel.newPrstDash(PresetLineDashPropertiesConverter.fromDocx4J(value.getPrstDash()));
    if (value.getCustDash() != null) egLineDashProperties = LinePropertiesModel.LineDashPropertiesModel.newCustDash(DashStopListConverter.fromDocx4J(value.getCustDash()));
    LinePropertiesModel.LineJoinPropertiesModel egLineJoinProperties = new LinePropertiesModel.LineJoinPropertiesModel();
    if (value.getRound() != null) egLineJoinProperties = LinePropertiesModel.LineJoinPropertiesModel.newRound(LineJoinRoundConverter.fromDocx4J(value.getRound()));
    if (value.getBevel() != null) egLineJoinProperties = LinePropertiesModel.LineJoinPropertiesModel.newBevel(LineJoinBevelConverter.fromDocx4J(value.getBevel()));
    if (value.getMiter() != null) egLineJoinProperties = LinePropertiesModel.LineJoinPropertiesModel.newMiter(LineJoinMiterPropertiesConverter.fromDocx4J(value.getMiter()));
    return new LinePropertiesModel(LineWidthValueConverter.fromDocx4J(value.getW()), LineCapValueConverter.fromDocx4J(value.getCap()), CompoundLineValueConverter.fromDocx4J(value.getCmpd()), PenAlignmentValueConverter.fromDocx4J(value.getAlgn()), egLineFillProperties, egLineDashProperties, egLineJoinProperties, LineEndPropertiesConverter.fromDocx4J(value.getHeadEnd()), LineEndPropertiesConverter.fromDocx4J(value.getTailEnd()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
