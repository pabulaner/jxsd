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
import test.dml.CTScale2DModel.*;
import test.officeDocument.relationships.*;

public class CTScale2DConverter
{
	
	private CTScale2DConverter() {
		// empty
	}
	
	public static CTScale2DModel fromDocx4j(CTScale2D value)
	{
		return new CTScale2DModel(
		CTRatioConverter.fromDocx4j(value.getSx())
		,
		CTRatioConverter.fromDocx4j(value.getSy())
		
		);
	}
}
