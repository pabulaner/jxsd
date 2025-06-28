package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTConnectorNonVisualModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTConnectorNonVisualModel
{
	
	private final CTNonVisualDrawingPropsModel cNvPr;
	private final CTNonVisualConnectorPropertiesModel cNvCxnSpPr;
	
	public CTConnectorNonVisualModel(CTNonVisualDrawingPropsModel cNvPr, CTNonVisualConnectorPropertiesModel cNvCxnSpPr) {
		this.cNvPr = cNvPr;
		this.cNvCxnSpPr = cNvCxnSpPr;
	}
	
	public CTNonVisualDrawingPropsModel getCNvPr() {
		return this.cNvPr;
	}
	public CTNonVisualConnectorPropertiesModel getCNvCxnSpPr() {
		return this.cNvCxnSpPr;
	}
}
