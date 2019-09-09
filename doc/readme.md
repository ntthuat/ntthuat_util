# PostGresSQL Database:

# Guideline:

# java.util.Date
Despite its name, java.util.Date represents an instant on the time-line, not a "date". 
The actual data stored within the object is a long count of milliseconds since 1970-01-01T00:00Z (midnight at the start of 1970 GMT/UTC).

https://stackoverflow.com/questions/21242110/convert-java-util-date-to-java-time-localdate