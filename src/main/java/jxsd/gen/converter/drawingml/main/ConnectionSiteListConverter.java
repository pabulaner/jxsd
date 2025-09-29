package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.ConnectionSiteListModel;
import org.docx4j.dml.CTConnectionSiteList;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteListConverter {
  private ConnectionSiteListConverter() {
  }

  public static ConnectionSiteListModel fromDocx4j(CTConnectionSiteList value) {
    if (value == null) return null;
    return new ConnectionSiteListModel(value.getCxn().stream().map(ConnectionSiteConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTConnectionSiteList toDocx4j(ConnectionSiteListModel value) {
    if (value == null) return null;
    CTConnectionSiteList result = new CTConnectionSiteList();
    result.getCxn().addAll(value.getCxn().stream().map(ConnectionSiteConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
