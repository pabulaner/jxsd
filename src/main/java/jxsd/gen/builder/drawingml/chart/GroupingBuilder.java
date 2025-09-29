package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GroupingModel;
import jxsd.gen.model.drawingml.chart.GroupingValueModel;

/**
 * This is a generated sequence class.
 */
public class GroupingBuilder {
  private GroupingValueModel val;

  public GroupingBuilder() {
  }

  public GroupingBuilder setVal(GroupingValueModel val) {
    this.val = val;
    return this;
  }

  public GroupingBuilder from(GroupingModel value) {
    this.val = value.getVal();
    return this;
  }

  public GroupingModel build() {
    return new GroupingModel(this.val);
  }
}
