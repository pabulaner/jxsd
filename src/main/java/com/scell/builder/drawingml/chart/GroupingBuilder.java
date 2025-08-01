package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GroupingModel;
import com.scell.model.drawingml.chart.GroupingValueModel;

public class GroupingBuilder {
  private GroupingValueModel val;

  public GroupingBuilder() {
  }

  public GroupingBuilder setVal(GroupingValueModel val) {
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
