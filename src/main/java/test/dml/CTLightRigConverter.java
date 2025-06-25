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
import test.dml.CTLightRigModel.*;
import test.officeDocument.relationships.*;

public class CTLightRigConverter
{
	
	private CTLightRigConverter() {
		// empty
	}
	
	public static CTLightRigModel fromDocx4j(CTLightRig value)
	{
		return new CTLightRigModel(
		STLightRigTypeConverter.fromDocx4j(value.getRig())
		,
		STLightRigDirectionConverter.fromDocx4j(value.getDir())
		,
		CTSphereCoordsConverter.fromDocx4j(value.getRot())
		
		);
	}
}
