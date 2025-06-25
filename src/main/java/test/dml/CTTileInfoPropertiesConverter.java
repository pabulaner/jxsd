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
import test.dml.CTTileInfoPropertiesModel.*;
import test.officeDocument.relationships.*;

public class CTTileInfoPropertiesConverter
{
	
	private CTTileInfoPropertiesConverter() {
		// empty
	}
	
	public static CTTileInfoPropertiesModel fromDocx4j(CTTileInfoProperties value)
	{
		return new CTTileInfoPropertiesModel(
		STPercentageConverter.fromDocx4j(value.getSy())
		,
		STCoordinateConverter.fromDocx4j(value.getTy())
		,
		STPercentageConverter.fromDocx4j(value.getSx())
		,
		STTileFlipModeConverter.fromDocx4j(value.getFlip())
		,
		STCoordinateConverter.fromDocx4j(value.getTx())
		,
		STRectAlignmentConverter.fromDocx4j(value.getAlgn())
		
		);
	}
}
