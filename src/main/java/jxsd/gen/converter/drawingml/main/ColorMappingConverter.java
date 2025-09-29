package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorMappingModel;
import org.docx4j.dml.CTColorMapping;

/**
 * This is a generated sequence class.
 */
public class ColorMappingConverter {
  private ColorMappingConverter() {
  }

  public static ColorMappingModel fromDocx4j(CTColorMapping value) {
    if (value == null) return null;
    return new ColorMappingModel(ColorSchemeIndexValueConverter.fromDocx4j(value.getTx1()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent3()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent2()), ColorSchemeIndexValueConverter.fromDocx4j(value.getHlink()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent1()), ColorSchemeIndexValueConverter.fromDocx4j(value.getFolHlink()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent6()), ColorSchemeIndexValueConverter.fromDocx4j(value.getBg2()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent5()), ColorSchemeIndexValueConverter.fromDocx4j(value.getBg1()), ColorSchemeIndexValueConverter.fromDocx4j(value.getTx2()), ColorSchemeIndexValueConverter.fromDocx4j(value.getAccent4()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTColorMapping toDocx4j(ColorMappingModel value) {
    if (value == null) return null;
    CTColorMapping result = new CTColorMapping();
    result.setTx1(ColorSchemeIndexValueConverter.toDocx4j(value.getTx1()));
    result.setAccent3(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent3()));
    result.setAccent2(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent2()));
    result.setHlink(ColorSchemeIndexValueConverter.toDocx4j(value.getHlink()));
    result.setAccent1(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent1()));
    result.setFolHlink(ColorSchemeIndexValueConverter.toDocx4j(value.getFolHlink()));
    result.setAccent6(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent6()));
    result.setBg2(ColorSchemeIndexValueConverter.toDocx4j(value.getBg2()));
    result.setAccent5(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent5()));
    result.setBg1(ColorSchemeIndexValueConverter.toDocx4j(value.getBg1()));
    result.setTx2(ColorSchemeIndexValueConverter.toDocx4j(value.getTx2()));
    result.setAccent4(ColorSchemeIndexValueConverter.toDocx4j(value.getAccent4()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
