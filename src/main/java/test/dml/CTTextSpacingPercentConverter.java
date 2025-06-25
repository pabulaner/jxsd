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
import test.dml.CTTextSpacingPercentModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextSpacingPercentConverter
{
	
	private CTTextSpacingPercentConverter() {
		// empty
	}
	
	public static CTTextSpacingPercentModel fromDocx4j(CTTextSpacingPercent value)
	{
		return new CTTextSpacingPercentModel(
		STTextSpacingPercentConverter.fromDocx4j(value.getVal())
		
		);
	}
}
