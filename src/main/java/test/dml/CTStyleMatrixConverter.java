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
import test.dml.CTStyleMatrixModel.*;
import test.officeDocument.relationships.*;

public class CTStyleMatrixConverter
{
	
	private CTStyleMatrixConverter() {
		// empty
	}
	
	public static CTStyleMatrixModel fromDocx4j(CTStyleMatrix value)
	{
		return new CTStyleMatrixModel(
		StringConverter.fromDocx4j(value.getName())
		,
		CTFillStyleListConverter.fromDocx4j(value.getFillStyleLst())
		,
		CTLineStyleListConverter.fromDocx4j(value.getLnStyleLst())
		,
		CTEffectStyleListConverter.fromDocx4j(value.getEffectStyleLst())
		,
		CTBackgroundFillStyleListConverter.fromDocx4j(value.getBgFillStyleLst())
		
		);
	}
}
