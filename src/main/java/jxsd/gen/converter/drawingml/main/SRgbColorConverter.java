package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
import org.docx4j.dml.CTSRgbColor;

/**
 * This is a generated sequence class.
 */
public class SRgbColorConverter {
  private SRgbColorConverter() {
  }

  public static SRgbColorModel fromDocx4j(CTSRgbColor value) {
    if (value == null) return null;
    List<SRgbColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SRgbColorModel(HexBinary3ValueConverter.fromDocx4j(value.getVal()), egColorTransform);
    }

    public static CTSRgbColor toDocx4j(SRgbColorModel value) {
      if (value == null) return null;
      CTSRgbColor result = new CTSRgbColor();
      result.setVal(HexBinary3ValueConverter.toDocx4j(value.getVal()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
