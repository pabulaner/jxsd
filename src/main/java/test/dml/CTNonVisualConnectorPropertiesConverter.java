package test.dml;

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
import test.dml.CTNonVisualConnectorPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
