package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.CTRatioModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTRatioModel
{
	
	private final LongModel n;
	private final LongModel d;
	
	public CTRatioModel(LongModel n, LongModel d) {
		this.n = n;
		this.d = d;
	}
	
	public LongModel getN() {
		return this.n;
	}
	public LongModel getD() {
		return this.d;
	}
}
