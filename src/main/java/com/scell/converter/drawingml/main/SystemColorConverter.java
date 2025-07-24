package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.SystemColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTSystemColor;

public class SystemColorConverter {
  private SystemColorConverter() {
  }

  public static SystemColorModel fromDocx4J(CTSystemColor value) {
    if (value == null) return null;
    List<SystemColorModel.ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      return new SystemColorModel.ColorTransformModel();
    } ).collect(Collectors.toList());
    return new SystemColorModel(SystemColorValConverter.fromDocx4J(value.getVal()), HexBinary3Converter.fromDocx4J(value.getLastClr()), egColorTransform);
  }
}
