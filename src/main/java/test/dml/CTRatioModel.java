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
import test.dml.CTRatioModel.*;
import test.officeDocument.relationships.*;

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
