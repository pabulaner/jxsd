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
import test.dml.CTBevelModel.*;
import test.officeDocument.relationships.*;

public class CTBevelConverter
{
	
	private CTBevelConverter() {
		// empty
	}
	
	public static CTBevelModel fromDocx4j(CTBevel value)
	{
		return new CTBevelModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getH())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getW())
		,
		STBevelPresetTypeConverter.fromDocx4j(value.getPrst())
		
		);
	}
}
