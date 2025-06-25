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
import test.dml.CTLineEndPropertiesModel.*;
import test.officeDocument.relationships.*;

public class CTLineEndPropertiesModel
{
	
	private final STLineEndTypeModel type;
	private final STLineEndWidthModel w;
	private final STLineEndLengthModel len;
	
	public CTLineEndPropertiesModel(STLineEndTypeModel type, STLineEndWidthModel w, STLineEndLengthModel len) {
		this.type = type;
		this.w = w;
		this.len = len;
	}
	
	public STLineEndTypeModel getType() {
		return this.type;
	}
	public STLineEndWidthModel getW() {
		return this.w;
	}
	public STLineEndLengthModel getLen() {
		return this.len;
	}
}
