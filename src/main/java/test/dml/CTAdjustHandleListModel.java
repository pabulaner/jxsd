package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTAdjustHandleListModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAdjustHandleListModel
{
	
	private final Object value;
	
	public CTAdjustHandleListModel() {
		this.value = null;
	}
	
	public CTAdjustHandleListModel(CTXYAdjustHandleModel value) {
		this.value = value;
	}
	public CTAdjustHandleListModel(CTPolarAdjustHandleModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTXYAdjustHandleModel getAhXY() {
		return (CTXYAdjustHandleModel) value;
	}
	public CTPolarAdjustHandleModel getAhPolar() {
		return (CTPolarAdjustHandleModel) value;
	}
}
