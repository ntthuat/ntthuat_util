package org.ntthuat.util;

import org.junit.Test;
import org.ntthuat.constant.DatePattern;

import java.sql.Timestamp;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/29 10:33 AM
 * $Log: DateUtilTest.java
 */
public class DateUtilTest
{
  @Test
  public void convertDate2LocalDate()
  {
    final java.util.Date inputDate = DateUtil.convertString2Date("28/07/2019", DatePattern.ddMMyyyy_slash);
    final LocalDate localDate = DateUtil.convertDate2LocalDate(inputDate);
    final LocalDate expectedLocalDate = LocalDate.parse("2019-07-28");
    assertEquals(expectedLocalDate, localDate);
    assertEquals("2019-07-28", localDate.toString());
  }

  @Test
  public void convertString2Date()
  {
    final java.util.Date utilDate = DateUtil.convertString2Date("28/07/2019", DatePattern.ddMMyyyy_slash);
    assertEquals("Sun Jul 28 00:00:00 ICT 2019", utilDate.toString());
  }

  @Test
  public void convertString2DateUsingPattern()
  {
    java.util.Date utilDate1 = DateUtil.convertString2Date("28/07/2019", DatePattern.ddMMyyyy_slash);
    assertEquals("Sun Jul 28 00:00:00 ICT 2019", utilDate1.toString());

    java.util.Date utilDate2 = DateUtil.convertString2Date("Mon, July 29 2019", DatePattern.EMMMddyyyy);
    assertEquals("Mon Jul 29 00:00:00 ICT 2019", utilDate2.toString());

    java.util.Date utilDate3 = DateUtil.convertString2Date("Tuesday, July 30, 2019 09:10:56 PM", DatePattern.EEEEMMMddyyyyHHmmssa);
    assertEquals("Tue Jul 30 09:10:56 ICT 2019", utilDate3.toString());

    java.util.Date utilDate4 = DateUtil.convertString2Date("Wednesday, July 31, 2019 09:10:56 PM", DatePattern.EEEEMMMddyyyyhhmmssa);
    assertEquals("Wed Jul 31 21:10:56 ICT 2019", utilDate4.toString());
  }
}
