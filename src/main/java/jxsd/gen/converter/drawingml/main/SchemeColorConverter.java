package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.SchemeColorModel;
import org.docx4j.dml.CTSchemeColor;

/**
 * This is a generated sequence class.
 */
public class SchemeColorConverter {
  private SchemeColorConverter() {
  }

  public static SchemeColorModel fromDocx4j(CTSchemeColor value) {
    if (value == null) return null;
    List<SchemeColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SchemeColorModel(SchemeColorValValueConverter.fromDocx4j(value.getVal()), egColorTransform);
    }

    public static CTSchemeColor toDocx4j(SchemeColorModel value) {
      if (value == null) return null;
      CTSchemeColor result = new CTSchemeColor();
      result.setVal(SchemeColorValValueConverter.toDocx4j(value.getVal()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
