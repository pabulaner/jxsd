package test.dml.chart;

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
import test.dml.chartDrawing.*;
import test.dml.chart.CTNumDataSourceModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNumDataSourceModel
{
	
	private final Object value;
	
	public CTNumDataSourceModel() {
		this.value = null;
	}
	
	public CTNumDataSourceModel(CTNumRefModel value) {
		this.value = value;
	}
	public CTNumDataSourceModel(CTNumDataModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTNumRefModel getNumRef() {
		return (CTNumRefModel) value;
	}
	public CTNumDataModel getNumLit() {
		return (CTNumDataModel) value;
	}
}
