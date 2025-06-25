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
import test.dml.chart.CTAxDataSourceModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAxDataSourceModel
{
	
	private final Object value;
	
	public CTAxDataSourceModel() {
		this.value = null;
	}
	
	public CTAxDataSourceModel(CTMultiLvlStrRefModel value) {
		this.value = value;
	}
	public CTAxDataSourceModel(CTNumRefModel value) {
		this.value = value;
	}
	public CTAxDataSourceModel(CTNumDataModel value) {
		this.value = value;
	}
	public CTAxDataSourceModel(CTStrRefModel value) {
		this.value = value;
	}
	public CTAxDataSourceModel(CTStrDataModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTMultiLvlStrRefModel getMultiLvlStrRef() {
		return (CTMultiLvlStrRefModel) value;
	}
	public CTNumRefModel getNumRef() {
		return (CTNumRefModel) value;
	}
	public CTNumDataModel getNumLit() {
		return (CTNumDataModel) value;
	}
	public CTStrRefModel getStrRef() {
		return (CTStrRefModel) value;
	}
	public CTStrDataModel getStrLit() {
		return (CTStrDataModel) value;
	}
}
