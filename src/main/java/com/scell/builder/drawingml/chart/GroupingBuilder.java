package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GroupingModel;

public class GroupingBuilder {
  private GroupingModel val;

  public GroupingBuilder() {
  }

  public GroupingBuilder setVal(GroupingModel val) {
    this.val = val;
    return this;
  }

  public GroupingModel build() {
    return new GroupingModel(this.val);
  }

  public GroupingBuilder from(GroupingModel value) {
    this.val = value.getVal();
    return this;
  }
}
