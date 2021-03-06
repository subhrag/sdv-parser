package net.sympower.parser.sdv;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class BigDecimalConverter extends AbstractNumberConverter<BigDecimal> {

  @Override
  protected BigDecimal parseDefault(String value) {
    return new BigDecimal(value);
  }

  protected BigDecimal parse(String value, DecimalFormat fmt) throws ParseException {
    fmt.setParseBigDecimal(true);
    return (BigDecimal) fmt.parse(value);
  }

}
