package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.ColorSchemeModel;
import org.docx4j.dml.CTColorScheme;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeConverter {
  private ColorSchemeConverter() {
  }

  public static ColorSchemeModel fromDocx4j(CTColorScheme value) {
    if (value == null) return null;
    return new ColorSchemeModel(StringValueConverter.fromDocx4j(value.getName()), ColorConverter.fromDocx4j(value.getDk1()), ColorConverter.fromDocx4j(value.getLt1()), ColorConverter.fromDocx4j(value.getDk2()), ColorConverter.fromDocx4j(value.getLt2()), ColorConverter.fromDocx4j(value.getAccent1()), ColorConverter.fromDocx4j(value.getAccent2()), ColorConverter.fromDocx4j(value.getAccent3()), ColorConverter.fromDocx4j(value.getAccent4()), ColorConverter.fromDocx4j(value.getAccent5()), ColorConverter.fromDocx4j(value.getAccent6()), ColorConverter.fromDocx4j(value.getHlink()), ColorConverter.fromDocx4j(value.getFolHlink()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTColorScheme toDocx4j(ColorSchemeModel value) {
    if (value == null) return null;
    CTColorScheme result = new CTColorScheme();
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    result.setDk1(ColorConverter.toDocx4j(value.getDk1()));
    result.setLt1(ColorConverter.toDocx4j(value.getLt1()));
    result.setDk2(ColorConverter.toDocx4j(value.getDk2()));
    result.setLt2(ColorConverter.toDocx4j(value.getLt2()));
    result.setAccent1(ColorConverter.toDocx4j(value.getAccent1()));
    result.setAccent2(ColorConverter.toDocx4j(value.getAccent2()));
    result.setAccent3(ColorConverter.toDocx4j(value.getAccent3()));
    result.setAccent4(ColorConverter.toDocx4j(value.getAccent4()));
    result.setAccent5(ColorConverter.toDocx4j(value.getAccent5()));
    result.setAccent6(ColorConverter.toDocx4j(value.getAccent6()));
    result.setHlink(ColorConverter.toDocx4j(value.getHlink()));
    result.setFolHlink(ColorConverter.toDocx4j(value.getFolHlink()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
