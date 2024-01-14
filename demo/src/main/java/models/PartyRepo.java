package models;

public class PartyRepo {

  public static String[][] all_parties = { { "Afghanistan", "2003-02-10", "2003-05-01" },
      { "Albania", "2003-01-31", "2003-05-01" },
      { "Andorra", "2001-04-30", "2002-07-01" },
      { "Barbados", "2002-12-10", "2003-03-01" },
      { "Belgium", "2000-06-28", "2002-07-01" },
      { "Belize", "2000-04-05", "2002-07-01" },
      { "Benin", "2002-01-22", "2002-07-01" },
      { "Bolivia", "2002-06-27", "2002-09-01" },
      { "Bosnia and Herzegovina", "2002-04-11", "2002-07-01" },
      { "Botswana", "2000-09-08", "2002-07-01" },
      { "Brazil", "2002-06-20", "2002-09-01" },
      { "Bulgaria", "2002-04-11", "2002-07-01" },
      { "Burkina Faso", "2004-04-16", "2004-07-01" },
      { "Cambodia", "2002-04-11", "2002-07-01" },
      { "Canada", "2000-07-07", "2002-07-01" },
      { "Cape Verde", "2011-10-10", "2012-01-01" },
      { "Central African Republic", "2001-10-03", "2002-07-01" },
      { "Chad", "2006-11-01", "2007-01-01" },
      { "Chile", "2009-06-29", "2009-09-01" },
      { "Colombia", "2002-08-05", "2002-11-01" },
      { "Comoros", "2006-08-18", "2006-11-01" },
      { "Democratic Republic of the Congo", "2002-04-11", "2002-07-01" },
      { "Congo, Republic of the", "2004-05-03", "2004-08-01" },
      { "Cook Islands", "2008-07-18", "2008-10-01" },
      { "Costa Rica", "2001-06-07", "2002-07-01" },
      { "Côte d'Ivoire", "2013-02-15", "2013-05-01" },
      { "Croatia", "2001-05-21", "2002-07-01" },
      { "Cyprus", "2002-03-07", "2002-07-01" },
      { "Czech Republic", "2009-07-21", "2009-10-01" },
      { "Denmark", "2001-06-21", "2002-07-01" },
      { "Djibouti", "2002-11-05", "2003-02-01" },
      { "Dominica", "2001-02-12", "2002-07-01" },
      { "Dominican Republic", "2005-05-12", "2005-08-01" },
      { "East Timor", "2002-09-06", "2002-12-01" },
      { "Ecuador", "2002-02-05", "2002-07-01" },
      { "El Salvador", "2016-03-03", "2016-06-01" },
      { "Estonia", "2002-01-30", "2002-07-01" },
      { "Fiji", "1999-11-29", "2002-07-01" },
      { "Finland", "2000-12-29", "2002-07-01" },
      { "France", "2000-06-09", "2002-07-01" },
      { "Gabon", "2000-09-20", "2002-07-01" },
      { "Gambia", "2002-06-28", "2002-09-01" },
      { "Georgia", "2003-09-05", "2003-12-01" },
      { "Germany", "2000-12-11", "2002-07-01" },
      { "Ghana", "1999-12-20", "2002-07-01" },
      { "Greece", "2002-05-15", "2002-08-01" },
      { "Grenada", "2011-05-19", "2011-08-01" },
      { "Guatemala", "2012-04-02", "2012-07-01" },
      { "Guinea", "2003-07-14", "2003-10-01" },
      { "Guyana", "2004-09-24", "2004-12-01" },
      { "Honduras", "2002-07-01", "2002-09-01" },
      { "Hungary", "2001-11-30", "2002-07-01" },
      { "Iceland", "2000-05-25", "2002-07-01" },
      { "Ireland", "2002-04-11", "2002-07-01" },
      { "Italy", "1999-07-26", "2002-07-01" },
      { "Japan", "2007-07-17", "2007-10-01" },
      { "Jordan", "2002-04-11", "2002-07-01" },
      { "Kenya", "2005-03-15", "2005-06-01" },
      { "Kiribati", "2019-11-26", "2020-02-01" },
      { "South Korea", "2002-11-13", "2003-02-01" },
      { "Latvia", "2002-06-28", "2002-09-01" },
      { "Lesotho", "2000-09-06", "2002-07-01" },
      { "Liberia", "2004-09-22", "2004-12-01" },
      { "Liechtenstein", "2001-10-02", "2002-07-01" },
      { "Lithuania", "2003-05-12", "2003-08-01" },
      { "Luxembourg", "2000-09-08", "2002-07-01" },
      { "Madagascar", "2008-03-14", "2008-06-01" },
      { "Malawi", "2002-09-19", "2002-12-01" },
      { "Maldives", "2011-09-21", "2011-12-01" },
      { "Mali", "2000-08-16", "2002-07-01" },
      { "Malta", "2002-11-29", "2003-02-01" },
      { "Marshall Islands", "2000-12-07", "2002-07-01" },
      { "Mauritius", "2002-03-05", "2002-07-01" },
      { "Mexico", "2005-10-28", "2006-01-01" },
      { "Moldova", "2010-10-12", "2011-01-01" },
      { "Mongolia", "2002-04-11", "2002-07-01" },
      { "Montenegro", "2006-10-23", "2006-06-03" },
      { "Namibia", "2002-06-25", "2002-09-01" },
      { "Nauru", "2001-11-12", "2002-07-01" },
      { "Netherlands", "2001-07-17", "2002-07-01" },
      { "New Zealand", "2000-09-07", "2002-07-01" },
      { "Niger", "2002-04-11", "2002-07-01" },
      { "Nigeria", "2001-09-27", "2002-07-01" },
      { "North Macedonia", "2002-03-06", "2002-07-01" },
      { "Norway", "2000-02-16", "2002-07-01" },
      { "Palestine", "2015-01-02", "2015-04-01" },
      { "Panama", "2002-03-21", "2002-07-01" },
      { "Paraguay", "2001-05-14", "2002-07-01" },
      { "Peru", "2001-11-10", "2002-07-01" },
      { "Poland", "2001-11-12", "2002-07-01" },
      { "Portugal", "2002-02-05", "2002-07-01" },
      { "Romania", "2002-04-11", "2002-07-01" },
      { "Saint Kitts and Nevis", "2006-08-22", "2006-11-01" },
      { "Saint Lucia", "2010-08-18", "2010-11-01" },
      { "Saint Vincent and the Grenadines", "2002-12-03", "2003-03-01" },
      { "Samoa", "2002-09-16", "2002-12-01" },
      { "San Marino", "1999-05-13", "2002-07-01" },
      { "Senegal", "1999-02-02", "2002-07-01" },
      { "Serbia", "2001-09-06", "2002-07-01" },
      { "Seychelles", "2010-08-10", "2010-11-01" },
      { "Sierra Leone", "2000-09-15", "2002-07-01" },
      { "Slovakia", "2002-04-11", "2002-07-01" },
      { "Slovenia", "2001-12-31", "2002-07-01" },
      { "South Africa", "2000-11-27", "2002-07-01" },
      { "Spain", "2000-10-24", "2002-07-01" },
      { "Suriname", "2008-07-15", "2008-10-01" },
      { "Sweden", "2001-06-28", "2002-07-01" },
      { "Switzerland", "2001-10-12", "2002-07-01" },
      { "Tajikistan", "2000-05-05", "2002-07-01" },
      { "Tanzania", "2002-08-20", "2002-11-01" },
      { "Trinidad and Tobago", "1999-04-06", "2002-07-01" },
      { "Tunisia", "2011-06-24", "2011-09-01" },
      { "Uganda", "2002-06-14", "2002-09-01" },
      { "United Kingdom", "2001-10-04", "2002-07-01" },
      { "Uruguay", "2002-06-28", "2002-09-01" },
      { "Vanuatu", "2011-12-02", "2012-02-01" },
      { "Venezuela", "2000-06-07", "2002-07-01" },
      { "Zambia", "2002-11-13", "2003-02-01" }

  };

}
