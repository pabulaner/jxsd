package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.SystemColorModel;
import org.docx4j.dml.CTSystemColor;

/**
 * This is a generated sequence class.
 */
public class SystemColorConverter {
  private SystemColorConverter() {
  }

  public static SystemColorModel fromDocx4j(CTSystemColor value) {
    if (value == null) return null;
    List<SystemColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SystemColorModel(SystemColorValValueConverter.fromDocx4j(value.getVal()), HexBinary3ValueConverter.fromDocx4j(value.getLastClr()), egColorTransform);
    }

    public static CTSystemColor toDocx4j(SystemColorModel value) {
      if (value == null) return null;
      CTSystemColor result = new CTSystemColor();
      result.setVal(SystemColorValValueConverter.toDocx4j(value.getVal()));
      result.setLastClr(HexBinary3ValueConverter.toDocx4j(value.getLastClr()));
      result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
