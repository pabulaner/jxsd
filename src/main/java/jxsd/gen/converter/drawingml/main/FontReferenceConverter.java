package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FontReferenceModel;
import org.docx4j.dml.CTFontReference;

/**
 * This is a generated sequence class.
 */
public class FontReferenceConverter {
  private FontReferenceConverter() {
  }

  public static FontReferenceModel fromDocx4j(CTFontReference value) {
    if (value == null) return null;
    FontReferenceModel.EG_ColorChoice egColorChoice = new FontReferenceModel.EG_ColorChoice();
    if (value.getScrgbClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getScrgbClr()));
    if (value.getSrgbClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getSrgbClr()));
    if (value.getHslClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getHslClr()));
    if (value.getSysClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getSysClr()));
    if (value.getSchemeClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getSchemeClr()));
    if (value.getPrstClr() != null) egColorChoice = FontReferenceConverter.newEGColorChoice(FontReferenceConverter.fromDocx4j(value.getPrstClr()));
    return new FontReferenceModel(FontCollectionIndexValueConverter.fromDocx4j(value.getIdx()), egColorChoice);
  }

  public static CTFontReference toDocx4j(FontReferenceModel value) {
    if (value == null) return null;
    CTFontReference result = new CTFontReference();
    result.setIdx(FontCollectionIndexValueConverter.toDocx4j(value.getIdx()));
    if (value.getEGColorChoice().isScrgbClr()) result.setScrgbClr(ScRgbColorConverter.toDocx4j(value.getEGColorChoice().getScrgbClr()));
    if (value.getEGColorChoice().isSrgbClr()) result.setSrgbClr(SRgbColorConverter.toDocx4j(value.getEGColorChoice().getSrgbClr()));
    if (value.getEGColorChoice().isHslClr()) result.setHslClr(HslColorConverter.toDocx4j(value.getEGColorChoice().getHslClr()));
    if (value.getEGColorChoice().isSysClr()) result.setSysClr(SystemColorConverter.toDocx4j(value.getEGColorChoice().getSysClr()));
    if (value.getEGColorChoice().isSchemeClr()) result.setSchemeClr(SchemeColorConverter.toDocx4j(value.getEGColorChoice().getSchemeClr()));
    if (value.getEGColorChoice().isPrstClr()) result.setPrstClr(PresetColorConverter.toDocx4j(value.getEGColorChoice().getPrstClr()));
    return result;
  }
}
