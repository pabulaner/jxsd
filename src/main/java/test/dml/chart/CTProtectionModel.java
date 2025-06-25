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
import test.dml.chart.CTProtectionModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTProtectionModel
{
	
	private final CTBooleanModel chartObject;
	private final CTBooleanModel data;
	private final CTBooleanModel formatting;
	private final CTBooleanModel selection;
	private final CTBooleanModel userInterface;
	
	public CTProtectionModel(CTBooleanModel chartObject, CTBooleanModel data, CTBooleanModel formatting, CTBooleanModel selection, CTBooleanModel userInterface) {
		this.chartObject = chartObject;
		this.data = data;
		this.formatting = formatting;
		this.selection = selection;
		this.userInterface = userInterface;
	}
	
	public CTBooleanModel getChartObject() {
		return this.chartObject;
	}
	public CTBooleanModel getData() {
		return this.data;
	}
	public CTBooleanModel getFormatting() {
		return this.formatting;
	}
	public CTBooleanModel getSelection() {
		return this.selection;
	}
	public CTBooleanModel getUserInterface() {
		return this.userInterface;
	}
}
