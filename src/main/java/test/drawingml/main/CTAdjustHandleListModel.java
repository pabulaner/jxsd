package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTAdjustHandleListModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTAdjustHandleListModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTAdjustHandleListModel() {
		this(-1, null);
	}
	
	private CTAdjustHandleListModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTAdjustHandleListModel createAhXY(CTXYAdjustHandleModel value) {
		return new CTAdjustHandleListModel(0, value);
	}
	public static CTAdjustHandleListModel createAhPolar(CTPolarAdjustHandleModel value) {
		return new CTAdjustHandleListModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isAhXY() {
		return this.type == 0;
	}
	
	public CTXYAdjustHandleModel getAhXY() {
		if (this.type != 0) throw new ClassCastException();
		return (CTXYAdjustHandleModel) value;
	}
	public boolean isAhPolar() {
		return this.type == 1;
	}
	
	public CTPolarAdjustHandleModel getAhPolar() {
		if (this.type != 1) throw new ClassCastException();
		return (CTPolarAdjustHandleModel) value;
	}
}
