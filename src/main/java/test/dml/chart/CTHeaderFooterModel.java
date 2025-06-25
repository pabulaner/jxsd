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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTHeaderFooterModel.*;
import test.officeDocument.relationships.*;

public class CTHeaderFooterModel
{
	
	private final BooleanModel differentOddEven;
	private final BooleanModel differentFirst;
	private final BooleanModel alignWithMargins;
	private final STXstringModel oddHeader;
	private final STXstringModel oddFooter;
	private final STXstringModel evenHeader;
	private final STXstringModel evenFooter;
	private final STXstringModel firstHeader;
	private final STXstringModel firstFooter;
	
	public CTHeaderFooterModel(BooleanModel differentOddEven, BooleanModel differentFirst, BooleanModel alignWithMargins, STXstringModel oddHeader, STXstringModel oddFooter, STXstringModel evenHeader, STXstringModel evenFooter, STXstringModel firstHeader, STXstringModel firstFooter) {
		this.differentOddEven = differentOddEven;
		this.differentFirst = differentFirst;
		this.alignWithMargins = alignWithMargins;
		this.oddHeader = oddHeader;
		this.oddFooter = oddFooter;
		this.evenHeader = evenHeader;
		this.evenFooter = evenFooter;
		this.firstHeader = firstHeader;
		this.firstFooter = firstFooter;
	}
	
	public BooleanModel getDifferentOddEven() {
		return this.differentOddEven;
	}
	public BooleanModel getDifferentFirst() {
		return this.differentFirst;
	}
	public BooleanModel getAlignWithMargins() {
		return this.alignWithMargins;
	}
	public STXstringModel getOddHeader() {
		return this.oddHeader;
	}
	public STXstringModel getOddFooter() {
		return this.oddFooter;
	}
	public STXstringModel getEvenHeader() {
		return this.evenHeader;
	}
	public STXstringModel getEvenFooter() {
		return this.evenFooter;
	}
	public STXstringModel getFirstHeader() {
		return this.firstHeader;
	}
	public STXstringModel getFirstFooter() {
		return this.firstFooter;
	}
}
