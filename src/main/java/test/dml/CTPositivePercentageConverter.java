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
import test.dml.CTPositivePercentageModel.*;
import test.officeDocument.relationships.*;

public class CTPositivePercentageConverter
{
	
	private CTPositivePercentageConverter() {
		// empty
	}
	
	public static CTPositivePercentageModel fromDocx4j(CTPositivePercentage value)
	{
		return new CTPositivePercentageModel(
		STPositivePercentageConverter.fromDocx4j(value.getVal())
		
		);
	}
}
