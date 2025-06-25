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

public class CTScale2DModel
{
	
	private final CTRatioModel sx;
	private final CTRatioModel sy;
	
	public CTScale2DModel(CTRatioModel sx, CTRatioModel sy) {
		this.sx = sx;
		this.sy = sy;
	}
	
	public CTRatioModel getSx() {
		return this.sx;
	}
	public CTRatioModel getSy() {
		return this.sy;
	}
}
