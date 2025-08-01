package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GroupingValueModel;

public class GroupingValueBuilder {
  private GroupingValueModel value;

  public GroupingValueBuilder() {
    this.value = null;
  }

  public GroupingValueBuilder from(GroupingValueModel value) {
    this.value = value;
    return this;
  }

  public GroupingValueModel build() {
    return this.value;
  }

  public GroupingValueBuilder setValue(GroupingValueModel value) {
    this.value = value;
    return this;
  }
}
