package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.GroupingBuilder;

/**
 * This is a generated sequence class.
 */
public class GroupingModel {
  private final GroupingValueModel val;

  public GroupingModel(GroupingValueModel val) {
    this.val = val;
  }

  public GroupingBuilder builder() {
    return new GroupingBuilder().from(this);
  }

  public GroupingValueModel getVal() {
    return this.val;
  }
}
