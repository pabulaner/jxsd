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

// SEQUENCE CONVERTER
public class CTConnectorNonVisualConverter
{
	
	private CTConnectorNonVisualConverter() {
		// empty
	}
	
	public static CTConnectorNonVisualModel fromDocx4j(CTConnectorNonVisual value)
	{
		return new CTConnectorNonVisualModel(
		CTNonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr())
		,
		CTNonVisualConnectorPropertiesConverter.fromDocx4j(value.getCNvCxnSpPr())
		
		);
	}
}
