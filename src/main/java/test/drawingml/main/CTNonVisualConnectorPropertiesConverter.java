package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTNonVisualConnectorPropertiesModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTNonVisualConnectorPropertiesConverter
{
	
	private CTNonVisualConnectorPropertiesConverter() {
		// empty
	}
	
	public static CTNonVisualConnectorPropertiesModel fromDocx4j(CTNonVisualConnectorProperties value)
	{
		return new CTNonVisualConnectorPropertiesModel(
		CTConnectorLockingConverter.fromDocx4j(value.getCxnSpLocks())
		,
		CTConnectionConverter.fromDocx4j(value.getStCxn())
		,
		CTConnectionConverter.fromDocx4j(value.getEndCxn())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
