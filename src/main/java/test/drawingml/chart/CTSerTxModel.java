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
import test.drawingml.chart.CTSerTxModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTSerTxModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTSerTxModel() {
		this(-1, null);
	}
	
	private CTSerTxModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTSerTxModel createStrRef(CTStrRefModel value) {
		return new CTSerTxModel(0, value);
	}
	public static CTSerTxModel createV(STXstringModel value) {
		return new CTSerTxModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isStrRef() {
		return this.type == 0;
	}
	
	public CTStrRefModel getStrRef() {
		if (this.type != 0) throw new ClassCastException();
		return (CTStrRefModel) value;
	}
	public boolean isV() {
		return this.type == 1;
	}
	
	public STXstringModel getV() {
		if (this.type != 1) throw new ClassCastException();
		return (STXstringModel) value;
	}
}
