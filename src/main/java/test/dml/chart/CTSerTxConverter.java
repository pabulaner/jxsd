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
import test.dml.chart.CTSerTxModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSerTxConverter
{
	
	private CTSerTxConverter() {
		// empty
	}
	
	public static CTSerTxModel fromDocx4j(CTSerTx value)
	{
		if (value.getStrRef() != null) return new CTSerTxModel(
		CTStrRefConverter.fromDocx4j(value.getStrRef())
		);
		if (value.getV() != null) return new CTSerTxModel(
		STXstringConverter.fromDocx4j(value.getV())
		);
		
		return new CTSerTxModel();
	}
}
