package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import org.docx4j.dml.chart.CTExtensionList;

/**
 * This is a generated sequence class.
 */
public class ExtensionListConverter {
  private ExtensionListConverter() {
  }

  public static ExtensionListModel fromDocx4j(CTExtensionList value) {
    if (value == null) return null;
    return new ExtensionListModel(value.getExt().stream().map(ExtensionConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTExtensionList toDocx4j(ExtensionListModel value) {
    if (value == null) return null;
    CTExtensionList result = new CTExtensionList();
    result.getExt().addAll(value.getExt().stream().map(ExtensionConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
