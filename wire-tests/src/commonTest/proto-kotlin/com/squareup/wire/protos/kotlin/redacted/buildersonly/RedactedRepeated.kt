// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedRepeated in redacted_test_builders_only.proto
package com.squareup.wire.protos.kotlin.redacted.buildersonly

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
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import okio.ByteString

public class RedactedRepeated private constructor(
  builder: Builder,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RedactedRepeated, RedactedRepeated.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    redacted = true,
    schemaIndex = 0,
  )
  @JvmField
  public val a: List<String> = immutableCopyOf("a", builder.a)

  /**
   * Values in the repeated type need redacting.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.redacted.buildersonly.RedactedFields#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 1,
  )
  @JvmField
  public val b: List<RedactedFields> = immutableCopyOf("b", builder.b)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.a = a
    builder.b = b
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedRepeated) return false
    if (unknownFields != other.unknownFields) return false
    if (a != other.a) return false
    if (b != other.b) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + a.hashCode()
      result = result * 37 + b.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (a.isNotEmpty()) result += """a=██"""
    if (b.isNotEmpty()) result += """b=$b"""
    return result.joinToString(prefix = "RedactedRepeated{", separator = ", ", postfix = "}")
  }

  public class Builder : Message.Builder<RedactedRepeated, Builder>() {
    @JvmField
    public var a: List<String> = emptyList()

    @JvmField
    public var b: List<RedactedFields> = emptyList()

    public fun a(a: List<String>): Builder {
      checkElementsNotNull(a)
      this.a = a
      return this
    }

    /**
     * Values in the repeated type need redacting.
     */
    public fun b(b: List<RedactedFields>): Builder {
      checkElementsNotNull(b)
      this.b = b
      return this
    }

    override fun build(): RedactedRepeated = RedactedRepeated(
      builder = this,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RedactedRepeated> = object : ProtoAdapter<RedactedRepeated>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedRepeated::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedRepeated", 
      PROTO_2, 
      null, 
      "redacted_test_builders_only.proto"
    ) {
      override fun encodedSize(`value`: RedactedRepeated): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.a)
        size += RedactedFields.ADAPTER.asRepeated().encodedSizeWithTag(2, value.b)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RedactedRepeated) {
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.a)
        RedactedFields.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.b)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: RedactedRepeated) {
        writer.writeBytes(value.unknownFields)
        RedactedFields.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.b)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.a)
      }

      override fun decode(reader: ProtoReader): RedactedRepeated {
        val builder = Builder()
        val a = mutableListOf<String>()
        val b = mutableListOf<RedactedFields>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a.add(ProtoAdapter.STRING.decode(reader))
            2 -> b.add(RedactedFields.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedRepeated(
          builder = builder
            .a(a)
            .b(b),
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RedactedRepeated): RedactedRepeated = RedactedRepeated(
        builder = value.newBuilder()
          .a(emptyList())
          .b(value.b.redactElements(RedactedFields.ADAPTER)),
        unknownFields = ByteString.EMPTY,
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): RedactedRepeated =
        Builder().apply(body).build()
  }
}
