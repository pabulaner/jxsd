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
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTLineEndPropertiesModel.*;
import test.officeDocument.relationships.*;

public class CTLineEndPropertiesConverter
{
	
	private CTLineEndPropertiesConverter() {
		// empty
	}
	
	public static CTLineEndPropertiesModel fromDocx4j(CTLineEndProperties value)
	{
		return new CTLineEndPropertiesModel(
		STLineEndTypeConverter.fromDocx4j(value.getType())
		,
		STLineEndWidthConverter.fromDocx4j(value.getW())
		,
		STLineEndLengthConverter.fromDocx4j(value.getLen())
		
		);
	}
}
