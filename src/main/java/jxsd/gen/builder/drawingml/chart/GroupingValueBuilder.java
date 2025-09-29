package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GroupingValueModel;

/**
 * This is a generated enum class.
 */
public class GroupingValueBuilder {
  private GroupingValueModel value;

  public GroupingValueBuilder() {
  }

  public GroupingValueBuilder setValue(GroupingValueModel value) {
    this.value = value;
    return this;
  }

  public GroupingValueBuilder from(GroupingValueModel value) {
    this.value = value;
    return this;
  }

  public GroupingValueModel build() {
    return this.value;
  }
}
