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
import test.dml.CTRelativeRectModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTRelativeRectConverter
{
	
	private CTRelativeRectConverter() {
		// empty
	}
	
	public static CTRelativeRectModel fromDocx4j(CTRelativeRect value)
	{
		return new CTRelativeRectModel(
		STPercentageConverter.fromDocx4j(value.getL())
		,
		STPercentageConverter.fromDocx4j(value.getT())
		,
		STPercentageConverter.fromDocx4j(value.getR())
		,
		STPercentageConverter.fromDocx4j(value.getB())
		
		);
	}
}
