package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.chart.CTNumDataSourceModel.*;

// CHOICE MODEL
public class CTNumDataSourceModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTNumDataSourceModel() {
		this(-1, null);
	}
	
	private CTNumDataSourceModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTNumDataSourceModel createNumRef(CTNumRefModel value) {
		return new CTNumDataSourceModel(0, value);
	}
	public static CTNumDataSourceModel createNumLit(CTNumDataModel value) {
		return new CTNumDataSourceModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isNumRef() {
		return this.type == 0;
	}
	
	public CTNumRefModel getNumRef() {
		if (this.type != 0) throw new ClassCastException();
		return (CTNumRefModel) value;
	}
	public boolean isNumLit() {
		return this.type == 1;
	}
	
	public CTNumDataModel getNumLit() {
		if (this.type != 1) throw new ClassCastException();
		return (CTNumDataModel) value;
	}
}
