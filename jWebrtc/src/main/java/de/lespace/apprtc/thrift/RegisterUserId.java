/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.lespace.apprtc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-02-19")
public class RegisterUserId implements org.apache.thrift.TBase<RegisterUserId, RegisterUserId._Fields>, java.io.Serializable, Cloneable, Comparable<RegisterUserId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RegisterUserId");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FIREBASE_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("firebaseToken", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RegisterUserIdStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RegisterUserIdTupleSchemeFactory();

  public java.lang.String userId; // required
  public java.lang.String firebaseToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    FIREBASE_TOKEN((short)2, "firebaseToken");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // FIREBASE_TOKEN
          return FIREBASE_TOKEN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIREBASE_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("firebaseToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RegisterUserId.class, metaDataMap);
  }

  public RegisterUserId() {
  }

  public RegisterUserId(
    java.lang.String userId,
    java.lang.String firebaseToken)
  {
    this();
    this.userId = userId;
    this.firebaseToken = firebaseToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RegisterUserId(RegisterUserId other) {
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetFirebaseToken()) {
      this.firebaseToken = other.firebaseToken;
    }
  }

  public RegisterUserId deepCopy() {
    return new RegisterUserId(this);
  }

  @Override
  public void clear() {
    this.userId = null;
    this.firebaseToken = null;
  }

  public java.lang.String getUserId() {
    return this.userId;
  }

  public RegisterUserId setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public java.lang.String getFirebaseToken() {
    return this.firebaseToken;
  }

  public RegisterUserId setFirebaseToken(java.lang.String firebaseToken) {
    this.firebaseToken = firebaseToken;
    return this;
  }

  public void unsetFirebaseToken() {
    this.firebaseToken = null;
  }

  /** Returns true if field firebaseToken is set (has been assigned a value) and false otherwise */
  public boolean isSetFirebaseToken() {
    return this.firebaseToken != null;
  }

  public void setFirebaseTokenIsSet(boolean value) {
    if (!value) {
      this.firebaseToken = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.String)value);
      }
      break;

    case FIREBASE_TOKEN:
      if (value == null) {
        unsetFirebaseToken();
      } else {
        setFirebaseToken((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case FIREBASE_TOKEN:
      return getFirebaseToken();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case FIREBASE_TOKEN:
      return isSetFirebaseToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RegisterUserId)
      return this.equals((RegisterUserId)that);
    return false;
  }

  public boolean equals(RegisterUserId that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_firebaseToken = true && this.isSetFirebaseToken();
    boolean that_present_firebaseToken = true && that.isSetFirebaseToken();
    if (this_present_firebaseToken || that_present_firebaseToken) {
      if (!(this_present_firebaseToken && that_present_firebaseToken))
        return false;
      if (!this.firebaseToken.equals(that.firebaseToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId())
      hashCode = hashCode * 8191 + userId.hashCode();

    hashCode = hashCode * 8191 + ((isSetFirebaseToken()) ? 131071 : 524287);
    if (isSetFirebaseToken())
      hashCode = hashCode * 8191 + firebaseToken.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RegisterUserId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFirebaseToken()).compareTo(other.isSetFirebaseToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirebaseToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firebaseToken, other.firebaseToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RegisterUserId(");
    boolean first = true;

    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("firebaseToken:");
    if (this.firebaseToken == null) {
      sb.append("null");
    } else {
      sb.append(this.firebaseToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (userId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not present! Struct: " + toString());
    }
    if (firebaseToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'firebaseToken' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RegisterUserIdStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RegisterUserIdStandardScheme getScheme() {
      return new RegisterUserIdStandardScheme();
    }
  }

  private static class RegisterUserIdStandardScheme extends org.apache.thrift.scheme.StandardScheme<RegisterUserId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RegisterUserId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIREBASE_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firebaseToken = iprot.readString();
              struct.setFirebaseTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RegisterUserId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.firebaseToken != null) {
        oprot.writeFieldBegin(FIREBASE_TOKEN_FIELD_DESC);
        oprot.writeString(struct.firebaseToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RegisterUserIdTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RegisterUserIdTupleScheme getScheme() {
      return new RegisterUserIdTupleScheme();
    }
  }

  private static class RegisterUserIdTupleScheme extends org.apache.thrift.scheme.TupleScheme<RegisterUserId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RegisterUserId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.userId);
      oprot.writeString(struct.firebaseToken);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RegisterUserId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userId = iprot.readString();
      struct.setUserIdIsSet(true);
      struct.firebaseToken = iprot.readString();
      struct.setFirebaseTokenIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
