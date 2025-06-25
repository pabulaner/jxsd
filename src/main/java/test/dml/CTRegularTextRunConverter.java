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
import test.dml.CTRegularTextRunModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTRegularTextRunConverter
{
	
	private CTRegularTextRunConverter() {
		// empty
	}
	
	public static CTRegularTextRunModel fromDocx4j(CTRegularTextRun value)
	{
		return new CTRegularTextRunModel(
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getRPr())
		,
		StringConverter.fromDocx4j(value.getT())
		
		);
	}
}
