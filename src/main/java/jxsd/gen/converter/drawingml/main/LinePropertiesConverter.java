package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LinePropertiesModel;
import org.docx4j.dml.CTLineProperties;

/**
 * This is a generated sequence class.
 */
public class LinePropertiesConverter {
  private LinePropertiesConverter() {
  }

  public static LinePropertiesModel fromDocx4j(CTLineProperties value) {
    if (value == null) return null;
    LinePropertiesModel.EG_LineFillProperties egLineFillProperties = new LinePropertiesModel.EG_LineFillProperties();
    if (value.getNoFill() != null) egLineFillProperties = LinePropertiesConverter.newEGLineFillProperties(LinePropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) egLineFillProperties = LinePropertiesConverter.newEGLineFillProperties(LinePropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) egLineFillProperties = LinePropertiesConverter.newEGLineFillProperties(LinePropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getPattFill() != null) egLineFillProperties = LinePropertiesConverter.newEGLineFillProperties(LinePropertiesConverter.fromDocx4j(value.getPattFill()));
    LinePropertiesModel.EG_LineDashProperties egLineDashProperties = new LinePropertiesModel.EG_LineDashProperties();
    if (value.getPrstDash() != null) egLineDashProperties = LinePropertiesConverter.newEGLineDashProperties(LinePropertiesConverter.fromDocx4j(value.getPrstDash()));
    if (value.getCustDash() != null) egLineDashProperties = LinePropertiesConverter.newEGLineDashProperties(LinePropertiesConverter.fromDocx4j(value.getCustDash()));
    LinePropertiesModel.EG_LineJoinProperties egLineJoinProperties = new LinePropertiesModel.EG_LineJoinProperties();
    if (value.getRound() != null) egLineJoinProperties = LinePropertiesConverter.newEGLineJoinProperties(LinePropertiesConverter.fromDocx4j(value.getRound()));
    if (value.getBevel() != null) egLineJoinProperties = LinePropertiesConverter.newEGLineJoinProperties(LinePropertiesConverter.fromDocx4j(value.getBevel()));
    if (value.getMiter() != null) egLineJoinProperties = LinePropertiesConverter.newEGLineJoinProperties(LinePropertiesConverter.fromDocx4j(value.getMiter()));
    return new LinePropertiesModel(LineWidthValueConverter.fromDocx4j(value.getW()), LineCapValueConverter.fromDocx4j(value.getCap()), CompoundLineValueConverter.fromDocx4j(value.getCmpd()), PenAlignmentValueConverter.fromDocx4j(value.getAlgn()), egLineFillProperties, egLineDashProperties, egLineJoinProperties, LineEndPropertiesConverter.fromDocx4j(value.getHeadEnd()), LineEndPropertiesConverter.fromDocx4j(value.getTailEnd()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineProperties toDocx4j(LinePropertiesModel value) {
    if (value == null) return null;
    CTLineProperties result = new CTLineProperties();
    result.setW(LineWidthValueConverter.toDocx4j(value.getW()));
    result.setCap(LineCapValueConverter.toDocx4j(value.getCap()));
    result.setCmpd(CompoundLineValueConverter.toDocx4j(value.getCmpd()));
    result.setAlgn(PenAlignmentValueConverter.toDocx4j(value.getAlgn()));
    result.setHeadEnd(LineEndPropertiesConverter.toDocx4j(value.getHeadEnd()));
    result.setTailEnd(LineEndPropertiesConverter.toDocx4j(value.getTailEnd()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getEGLineFillProperties().isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getEGLineFillProperties().getNoFill()));
    if (value.getEGLineFillProperties().isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getEGLineFillProperties().getSolidFill()));
    if (value.getEGLineFillProperties().isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getEGLineFillProperties().getGradFill()));
    if (value.getEGLineFillProperties().isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getEGLineFillProperties().getPattFill()));
    if (value.getEGLineDashProperties().isPrstDash()) result.setPrstDash(PresetLineDashPropertiesConverter.toDocx4j(value.getEGLineDashProperties().getPrstDash()));
    if (value.getEGLineDashProperties().isCustDash()) result.setCustDash(DashStopListConverter.toDocx4j(value.getEGLineDashProperties().getCustDash()));
    if (value.getEGLineJoinProperties().isRound()) result.setRound(LineJoinRoundConverter.toDocx4j(value.getEGLineJoinProperties().getRound()));
    if (value.getEGLineJoinProperties().isBevel()) result.setBevel(LineJoinBevelConverter.toDocx4j(value.getEGLineJoinProperties().getBevel()));
    if (value.getEGLineJoinProperties().isMiter()) result.setMiter(LineJoinMiterPropertiesConverter.toDocx4j(value.getEGLineJoinProperties().getMiter()));
    return result;
  }
}
