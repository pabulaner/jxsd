package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.StyleMatrixReferenceModel;
import org.docx4j.dml.CTStyleMatrixReference;

/**
 * This is a generated sequence class.
 */
public class StyleMatrixReferenceConverter {
  private StyleMatrixReferenceConverter() {
  }

  public static StyleMatrixReferenceModel fromDocx4j(CTStyleMatrixReference value) {
    if (value == null) return null;
    StyleMatrixReferenceModel.EG_ColorChoice egColorChoice = new StyleMatrixReferenceModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newScrgbClr(ScRgbColorConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newSrgbClr(SRgbColorConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newHslClr(HslColorConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newSysClr(SystemColorConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newSchemeClr(SchemeColorConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = StyleMatrixReferenceModel.EG_ColorChoice.newPrstClr(PresetColorConverter.fromDocx4j(value.getPrstClr()));
    return new StyleMatrixReferenceModel(StyleMatrixColumnIndexValueConverter.fromDocx4j(value.getIdx()), egColorChoice);
  }

  public static CTStyleMatrixReference toDocx4j(StyleMatrixReferenceModel value) {
    if (value == null) return null;
    CTStyleMatrixReference result = new CTStyleMatrixReference();
    result.setIdx(StyleMatrixColumnIndexValueConverter.toDocx4j(value.getIdx()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
