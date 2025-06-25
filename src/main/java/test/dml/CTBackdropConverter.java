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
import test.officeDocument.relationships.*;
import test.dml.CTBackdropModel.*;

public class CTBackdropConverter
{
	
	private CTBackdropConverter() {
		// empty
	}
	
	public static CTBackdropModel fromDocx4j(CTBackdrop value)
	{
		return new CTBackdropModel(
		CTPoint3DConverter.fromDocx4j(value.getAnchor())
		,
		CTVector3DConverter.fromDocx4j(value.getNorm())
		,
		CTVector3DConverter.fromDocx4j(value.getUp())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
