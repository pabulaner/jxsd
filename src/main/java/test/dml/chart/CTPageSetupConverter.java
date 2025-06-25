package test.dml.chart;

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
import test.dml.chart.CTPageSetupModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPageSetupConverter
{
	
	private CTPageSetupConverter() {
		// empty
	}
	
	public static CTPageSetupModel fromDocx4j(CTPageSetup value)
	{
		return new CTPageSetupModel(
		IntConverter.fromDocx4j(value.getVerticalDpi())
		,
		IntConverter.fromDocx4j(value.getHorizontalDpi())
		,
		UnsignedIntConverter.fromDocx4j(value.getFirstPageNumber())
		,
		STPageSetupOrientationConverter.fromDocx4j(value.getOrientation())
		,
		BooleanConverter.fromDocx4j(value.getDraft())
		,
		UnsignedIntConverter.fromDocx4j(value.getCopies())
		,
		UnsignedIntConverter.fromDocx4j(value.getPaperSize())
		,
		BooleanConverter.fromDocx4j(value.getUseFirstPageNumber())
		,
		BooleanConverter.fromDocx4j(value.getBlackAndWhite())
		
		);
	}
}
