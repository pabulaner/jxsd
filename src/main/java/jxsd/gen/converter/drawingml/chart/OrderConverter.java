package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrderModel;
import org.docx4j.dml.chart.CTOrder;

/**
 * This is a generated sequence class.
 */
public class OrderConverter {
  private OrderConverter() {
  }

  public static OrderModel fromDocx4j(CTOrder value) {
    if (value == null) return null;
    return new OrderModel(OrderValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTOrder toDocx4j(OrderModel value) {
    if (value == null) return null;
    CTOrder result = new CTOrder();
    result.setVal(OrderValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
