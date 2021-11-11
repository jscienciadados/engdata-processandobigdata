// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Nov 11 17:50:00 GMT 2021
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("USER_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.USER_ID = (String)value;
      }
    });
    setters.put("MOVIE_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MOVIE_ID = (String)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String USER_ID;
  public String get_USER_ID() {
    return USER_ID;
  }
  public void set_USER_ID(String USER_ID) {
    this.USER_ID = USER_ID;
  }
  public QueryResult with_USER_ID(String USER_ID) {
    this.USER_ID = USER_ID;
    return this;
  }
  private String MOVIE_ID;
  public String get_MOVIE_ID() {
    return MOVIE_ID;
  }
  public void set_MOVIE_ID(String MOVIE_ID) {
    this.MOVIE_ID = MOVIE_ID;
  }
  public QueryResult with_MOVIE_ID(String MOVIE_ID) {
    this.MOVIE_ID = MOVIE_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.USER_ID == null ? that.USER_ID == null : this.USER_ID.equals(that.USER_ID));
    equal = equal && (this.MOVIE_ID == null ? that.MOVIE_ID == null : this.MOVIE_ID.equals(that.MOVIE_ID));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.USER_ID == null ? that.USER_ID == null : this.USER_ID.equals(that.USER_ID));
    equal = equal && (this.MOVIE_ID == null ? that.MOVIE_ID == null : this.MOVIE_ID.equals(that.MOVIE_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.USER_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.MOVIE_ID = JdbcWritableBridge.readString(2, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.USER_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.MOVIE_ID = JdbcWritableBridge.readString(2, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(USER_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MOVIE_ID, 2 + __off, 12, __dbStmt);
    return 2;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(USER_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MOVIE_ID, 2 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.USER_ID = null;
    } else {
    this.USER_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MOVIE_ID = null;
    } else {
    this.MOVIE_ID = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.USER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USER_ID);
    }
    if (null == this.MOVIE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MOVIE_ID);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.USER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USER_ID);
    }
    if (null == this.MOVIE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MOVIE_ID);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(USER_ID==null?"null":USER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOVIE_ID==null?"null":MOVIE_ID, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(USER_ID==null?"null":USER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MOVIE_ID==null?"null":MOVIE_ID, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.USER_ID = null; } else {
      this.USER_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MOVIE_ID = null; } else {
      this.MOVIE_ID = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.USER_ID = null; } else {
      this.USER_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MOVIE_ID = null; } else {
      this.MOVIE_ID = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("USER_ID", this.USER_ID);
    __sqoop$field_map.put("MOVIE_ID", this.MOVIE_ID);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("USER_ID", this.USER_ID);
    __sqoop$field_map.put("MOVIE_ID", this.MOVIE_ID);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
