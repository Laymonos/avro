package aymenzaghouani.com;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class emp extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7827391935298346272L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"emp\",\"namespace\":\"aymenzaghouani.com\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"salary\",\"type\":\"int\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"address\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<emp> ENCODER =
      new BinaryMessageEncoder<emp>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<emp> DECODER =
      new BinaryMessageDecoder<emp>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<emp> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<emp> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<emp>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this emp to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a emp from a ByteBuffer. */
  public static emp fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int id;
  @Deprecated public int salary;
  @Deprecated public int age;
  @Deprecated public java.lang.CharSequence address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public emp() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param id The new value for id
   * @param salary The new value for salary
   * @param age The new value for age
   * @param address The new value for address
   */
  public emp(java.lang.CharSequence name, java.lang.Integer id, java.lang.Integer salary, java.lang.Integer age, java.lang.CharSequence address) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.age = age;
    this.address = address;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return id;
    case 2: return salary;
    case 3: return age;
    case 4: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.Integer)value$; break;
    case 2: salary = (java.lang.Integer)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: address = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'salary' field.
   * @return The value of the 'salary' field.
   */
  public java.lang.Integer getSalary() {
    return salary;
  }

  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(java.lang.Integer value) {
    this.salary = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Creates a new emp RecordBuilder.
   * @return A new emp RecordBuilder
   */
  public static aymenzaghouani.com.emp.Builder newBuilder() {
    return new aymenzaghouani.com.emp.Builder();
  }

  /**
   * Creates a new emp RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new emp RecordBuilder
   */
  public static aymenzaghouani.com.emp.Builder newBuilder(aymenzaghouani.com.emp.Builder other) {
    return new aymenzaghouani.com.emp.Builder(other);
  }

  /**
   * Creates a new emp RecordBuilder by copying an existing emp instance.
   * @param other The existing instance to copy.
   * @return A new emp RecordBuilder
   */
  public static aymenzaghouani.com.emp.Builder newBuilder(aymenzaghouani.com.emp other) {
    return new aymenzaghouani.com.emp.Builder(other);
  }

  /**
   * RecordBuilder for emp instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<emp>
    implements org.apache.avro.data.RecordBuilder<emp> {

    private java.lang.CharSequence name;
    private int id;
    private int salary;
    private int age;
    private java.lang.CharSequence address;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(aymenzaghouani.com.emp.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.salary)) {
        this.salary = data().deepCopy(fields()[2].schema(), other.salary);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing emp instance
     * @param other The existing instance to copy.
     */
    private Builder(aymenzaghouani.com.emp other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.salary)) {
        this.salary = data().deepCopy(fields()[2].schema(), other.salary);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder setId(int value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder clearId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'salary' field.
      * @return The value.
      */
    public java.lang.Integer getSalary() {
      return salary;
    }

    /**
      * Sets the value of the 'salary' field.
      * @param value The value of 'salary'.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder setSalary(int value) {
      validate(fields()[2], value);
      this.salary = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'salary' field has been set.
      * @return True if the 'salary' field has been set, false otherwise.
      */
    public boolean hasSalary() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'salary' field.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder clearSalary() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder setAge(int value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder clearAge() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.address = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public aymenzaghouani.com.emp.Builder clearAddress() {
      address = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public emp build() {
      try {
        emp record = new emp();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.Integer) defaultValue(fields()[1]);
        record.salary = fieldSetFlags()[2] ? this.salary : (java.lang.Integer) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.address = fieldSetFlags()[4] ? this.address : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<emp>
    WRITER$ = (org.apache.avro.io.DatumWriter<emp>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<emp>
    READER$ = (org.apache.avro.io.DatumReader<emp>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
