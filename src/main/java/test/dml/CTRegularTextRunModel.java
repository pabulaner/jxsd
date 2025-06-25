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
import test.dml.CTRegularTextRunModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTRegularTextRunModel
{
	
	private final CTTextCharacterPropertiesModel rPr;
	private final StringModel t;
	
	public CTRegularTextRunModel(CTTextCharacterPropertiesModel rPr, StringModel t) {
		this.rPr = rPr;
		this.t = t;
	}
	
	public CTTextCharacterPropertiesModel getRPr() {
		return this.rPr;
	}
	public StringModel getT() {
		return this.t;
	}
}
