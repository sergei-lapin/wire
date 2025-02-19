// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.OneOfMessage in one_of.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.countNonNull
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import okio.ByteString

/**
 * It's a one of message.
 */
public class OneOfMessage(
  /**
   * What foo.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    oneofName = "choice",
    schemaIndex = 0,
  )
  @JvmField
  public val foo: Int? = null,
  /**
   * Such bar.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    oneofName = "choice",
    schemaIndex = 1,
  )
  @JvmField
  public val bar: String? = null,
  /**
   * Nice baz.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    oneofName = "choice",
    schemaIndex = 2,
  )
  @JvmField
  public val baz: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OneOfMessage, OneOfMessage.Builder>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(foo, bar, baz) <= 1) {
      "At most one of foo, bar, baz may be non-null"
    }
  }

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.foo = foo
    builder.bar = bar
    builder.baz = baz
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OneOfMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (foo != other.foo) return false
    if (bar != other.bar) return false
    if (baz != other.baz) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (foo?.hashCode() ?: 0)
      result = result * 37 + (bar?.hashCode() ?: 0)
      result = result * 37 + (baz?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (foo != null) result += """foo=$foo"""
    if (bar != null) result += """bar=${sanitize(bar)}"""
    if (baz != null) result += """baz=${sanitize(baz)}"""
    return result.joinToString(prefix = "OneOfMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(
    foo: Int? = this.foo,
    bar: String? = this.bar,
    baz: String? = this.baz,
    unknownFields: ByteString = this.unknownFields,
  ): OneOfMessage = OneOfMessage(foo, bar, baz, unknownFields)

  public class Builder : Message.Builder<OneOfMessage, Builder>() {
    @JvmField
    public var foo: Int? = null

    @JvmField
    public var bar: String? = null

    @JvmField
    public var baz: String? = null

    /**
     * What foo.
     */
    public fun foo(foo: Int?): Builder {
      this.foo = foo
      this.bar = null
      this.baz = null
      return this
    }

    /**
     * Such bar.
     */
    public fun bar(bar: String?): Builder {
      this.bar = bar
      this.foo = null
      this.baz = null
      return this
    }

    /**
     * Nice baz.
     */
    public fun baz(baz: String?): Builder {
      this.baz = baz
      this.foo = null
      this.bar = null
      return this
    }

    override fun build(): OneOfMessage = OneOfMessage(
      foo = foo,
      bar = bar,
      baz = baz,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OneOfMessage> = object : ProtoAdapter<OneOfMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      OneOfMessage::class, 
      "type.googleapis.com/squareup.protos.kotlin.oneof.OneOfMessage", 
      PROTO_2, 
      null, 
      "one_of.proto"
    ) {
      override fun encodedSize(`value`: OneOfMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.foo)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.bar)
        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.baz)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: OneOfMessage) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.foo)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.bar)
        ProtoAdapter.STRING.encodeWithTag(writer, 4, value.baz)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: OneOfMessage) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 4, value.baz)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.bar)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.foo)
      }

      override fun decode(reader: ProtoReader): OneOfMessage {
        var foo: Int? = null
        var bar: String? = null
        var baz: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> foo = ProtoAdapter.INT32.decode(reader)
            3 -> bar = ProtoAdapter.STRING.decode(reader)
            4 -> baz = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OneOfMessage(
          foo = foo,
          bar = bar,
          baz = baz,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: OneOfMessage): OneOfMessage = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): OneOfMessage = Builder().apply(body).build()
  }
}
