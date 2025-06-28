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
import test.drawingml.chart.CTAxDataSourceModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTAxDataSourceModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTAxDataSourceModel() {
		this(-1, null);
	}
	
	private CTAxDataSourceModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTAxDataSourceModel createMultiLvlStrRef(CTMultiLvlStrRefModel value) {
		return new CTAxDataSourceModel(0, value);
	}
	public static CTAxDataSourceModel createNumRef(CTNumRefModel value) {
		return new CTAxDataSourceModel(1, value);
	}
	public static CTAxDataSourceModel createNumLit(CTNumDataModel value) {
		return new CTAxDataSourceModel(2, value);
	}
	public static CTAxDataSourceModel createStrRef(CTStrRefModel value) {
		return new CTAxDataSourceModel(3, value);
	}
	public static CTAxDataSourceModel createStrLit(CTStrDataModel value) {
		return new CTAxDataSourceModel(4, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isMultiLvlStrRef() {
		return this.type == 0;
	}
	
	public CTMultiLvlStrRefModel getMultiLvlStrRef() {
		if (this.type != 0) throw new ClassCastException();
		return (CTMultiLvlStrRefModel) value;
	}
	public boolean isNumRef() {
		return this.type == 1;
	}
	
	public CTNumRefModel getNumRef() {
		if (this.type != 1) throw new ClassCastException();
		return (CTNumRefModel) value;
	}
	public boolean isNumLit() {
		return this.type == 2;
	}
	
	public CTNumDataModel getNumLit() {
		if (this.type != 2) throw new ClassCastException();
		return (CTNumDataModel) value;
	}
	public boolean isStrRef() {
		return this.type == 3;
	}
	
	public CTStrRefModel getStrRef() {
		if (this.type != 3) throw new ClassCastException();
		return (CTStrRefModel) value;
	}
	public boolean isStrLit() {
		return this.type == 4;
	}
	
	public CTStrDataModel getStrLit() {
		if (this.type != 4) throw new ClassCastException();
		return (CTStrDataModel) value;
	}
}
