package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.ConnectionSiteListBuilder;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteListModel {
  private final List<ConnectionSiteModel> cxn;

  public ConnectionSiteListModel(List<ConnectionSiteModel> cxn) {
    this.cxn = cxn;
  }

  public ConnectionSiteListBuilder builder() {
    return new ConnectionSiteListBuilder().from(this);
  }

  public List<ConnectionSiteModel> getCxn() {
    return this.cxn;
  }
}
