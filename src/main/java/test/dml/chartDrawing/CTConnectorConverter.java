package test.dml.chartDrawing;

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
import test.dml.chartDrawing.CTConnectorModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTConnectorConverter
{
	
	private CTConnectorConverter() {
		// empty
	}
	
	public static CTConnectorModel fromDocx4j(CTConnector value)
	{
		return new CTConnectorModel(
		BooleanConverter.fromDocx4j(value.getFPublished())
		,
		StringConverter.fromDocx4j(value.getMacro())
		,
		CTConnectorNonVisualConverter.fromDocx4j(value.getNvCxnSpPr())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTShapeStyleConverter.fromDocx4j(value.getStyle())
		
		);
	}
}
