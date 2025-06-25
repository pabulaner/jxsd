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
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTTxModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTxModel
{
	
	private final Object value;
	
	public CTTxModel() {
		this.value = null;
	}
	
	public CTTxModel(CTStrRefModel value) {
		this.value = value;
	}
	public CTTxModel(CTTextBodyModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTStrRefModel getStrRef() {
		return (CTStrRefModel) value;
	}
	public CTTextBodyModel getRich() {
		return (CTTextBodyModel) value;
	}
}
