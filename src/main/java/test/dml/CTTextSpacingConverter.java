package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextSpacingModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextSpacingConverter
{
	
	private CTTextSpacingConverter() {
		// empty
	}
	
	public static CTTextSpacingModel fromDocx4j(CTTextSpacing value)
	{
		if (value.getSpcPct() != null) return new CTTextSpacingModel(
		CTTextSpacingPercentConverter.fromDocx4j(value.getSpcPct())
		);
		if (value.getSpcPts() != null) return new CTTextSpacingModel(
		CTTextSpacingPointConverter.fromDocx4j(value.getSpcPts())
		);
		
		return new CTTextSpacingModel();
	}
}
