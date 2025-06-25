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
import test.dml.chart.CTSerTxModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSerTxModel
{
	
	private final Object value;
	
	public CTSerTxModel() {
		this.value = null;
	}
	
	public CTSerTxModel(CTStrRefModel value) {
		this.value = value;
	}
	public CTSerTxModel(STXstringModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTStrRefModel getStrRef() {
		return (CTStrRefModel) value;
	}
	public STXstringModel getV() {
		return (STXstringModel) value;
	}
}
