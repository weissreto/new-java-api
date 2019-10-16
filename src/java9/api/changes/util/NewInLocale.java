package java9.api.changes.util;

import java.util.Locale;
import java.util.Locale.IsoCountryCode;

public class NewInLocale
{
  public void locale()
  {
    Locale locale = null;
    IsoCountryCode type = IsoCountryCode.PART3; // IsoCountryCode.PART1_ALPHA2; IsoCountryCode.PART1_ALPHA3;
    locale.getISOCountries(type );
  }

}
