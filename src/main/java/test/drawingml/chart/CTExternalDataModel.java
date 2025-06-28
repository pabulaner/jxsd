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
import test.drawingml.chart.CTExternalDataModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTExternalDataModel
{
	
	private final STRelationshipIdModel id;
	private final CTBooleanModel autoUpdate;
	
	public CTExternalDataModel(STRelationshipIdModel id, CTBooleanModel autoUpdate) {
		this.id = id;
		this.autoUpdate = autoUpdate;
	}
	
	public STRelationshipIdModel getId() {
		return this.id;
	}
	public CTBooleanModel getAutoUpdate() {
		return this.autoUpdate;
	}
}
