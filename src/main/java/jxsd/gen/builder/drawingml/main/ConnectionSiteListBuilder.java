package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.ConnectionSiteListModel;
import jxsd.gen.model.drawingml.main.ConnectionSiteModel;

/**
 * This is a generated sequence class.
 */
public class ConnectionSiteListBuilder {
  private List<ConnectionSiteModel> cxn;

  public ConnectionSiteListBuilder() {
  }

  public ConnectionSiteListBuilder setCxn(List<ConnectionSiteModel> cxn) {
    this.cxn = cxn;
    return this;
  }

  public ConnectionSiteListBuilder from(ConnectionSiteListModel value) {
    this.cxn = value.getCxn();
    return this;
  }

  public ConnectionSiteListModel build() {
    return new ConnectionSiteListModel(this.cxn);
  }
}
