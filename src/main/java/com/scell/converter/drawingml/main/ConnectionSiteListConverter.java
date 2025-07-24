package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ConnectionSiteListModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTConnectionSiteList;

public class ConnectionSiteListConverter {
  private ConnectionSiteListConverter() {
  }

  public static ConnectionSiteListModel fromDocx4J(CTConnectionSiteList value) {
    if (value == null) return null;
    return new ConnectionSiteListModel(value.getCxn().stream().map(ConnectionSiteConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
